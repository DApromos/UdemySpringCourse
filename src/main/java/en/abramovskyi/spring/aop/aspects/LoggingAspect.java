package en.abramovskyi.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("en.abramovskyi.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(){
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
