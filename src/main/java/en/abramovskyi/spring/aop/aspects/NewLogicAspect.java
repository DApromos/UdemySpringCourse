package en.abramovskyi.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLogicAspect {

//    @Around("execution(public String returnBook())")
//    public Object aroundAdviceLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("aroundAdviceLoggingAdvice: " +
//                "attempt to return book in library");
//
//        long begin = System.currentTimeMillis();
//        Object targetMethodResult = proceedingJoinPoint.proceed();
//        targetMethodResult = "Crime and Punishment";
//        long end = System.currentTimeMillis();
//
//        System.out.println("aroundAdviceLoggingAdvice: " +
//                "book successfully returned to library");
//        System.out.println("aroundAdviceLoggingAdvice: method returnBook finished work in " +
//                + (end-begin) + " milliseconds");
//        return targetMethodResult;
//    }
}
