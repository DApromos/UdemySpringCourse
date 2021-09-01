package en.abramovskyi.spring.aop.aspects;

import en.abramovskyi.spring.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("en.abramovskyi.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " +
                methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " +
                methodSignature.getReturnType());
        System.out.println("methodSignature.getReturnType() = " +
                methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
        for (Object obj: arguments){
         if (obj instanceof Book){
             Book myBook = (Book) obj;
             System.out.println("Information about the book: name - "+
                     myBook.getName() + ", author - " + myBook.getAuthor() +
                     ", published in - " + myBook.getYearOfPublication());
         } else if(obj instanceof String){
             System.out.println("Book added by " + obj);
         }
        }

        }

        System.out.println("beforeAddLoggingAdvice: Logging of attempt to get book/magazine");
        System.out.println("------------------------------------------------------");
    }






//    @Before("en.abramovskyi.spring.aop.aspects.MyPointcuts.allAddMethods()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("beforeAddLoggingAdvice: Logging of attempt to get book/magazine");
//        System.out.println("------------------------------------------------------");
//    }



//    @Pointcut("execution(* en.abramovskyi.spring.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void en.abramovskyi.spring.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibrary: Log #10");
//    }


//    @Pointcut("execution(* en.abramovskyi.spring.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* en.abramovskyi.spring.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("beforeAddLoggingAdvice: writing Log#1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log#2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }


//    @Pointcut("execution(* get*())")
//    private void allAddMethods(){}

//    @Before("en.abramovskyi.spring.aop.aspects.MyPointcuts.allAddMethods()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("beforeAddLoggingAdvice: Logging of attempt to get book/magazine");
//    }

//    @Before("allAddMethods()")
//    public void beforeAddSecurityAdvice(){
//        System.out.println("beforeAddSecurityAdvice: Checking rights of getting book" +
//                " or magazine");
//    }


//    @Before("execution(public void getBook(en.abramovskyi.spring.aop.Book))")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: Attempt to get book");
//    }
//
//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: Attempt to return book");
//    }
//
//    @Before("execution(protected void *(..))")
//    public void beforeTakingAnotherBookAdvice(){
//        System.out.println("beforeTakingAnotherBookAdvice: Attempt to return book");
//    }
}
