package en.abramovskyi.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(20)
public class ExceptionHandlingAspect {
    @Before("en.abramovskyi.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice: " +
                "Catching/processing exception during attempting getting book/magazine");
        System.out.println("------------------------------------------------------");
    }

//    @Before("en.abramovskyi.spring.aop.aspects.MyPointcuts.allAddMethods()")
//    public void beforeAddExceptionHandlingAdvice(){
//        System.out.println("beforeAddExceptionHandlingAdvice: " +
//                "Catching/processing exception during attempting getting book/magazine");
//        System.out.println("------------------------------------------------------");
//    }

}
