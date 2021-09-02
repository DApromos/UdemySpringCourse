package en.abramovskyi.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class ProcessingAroundAdviceAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundAdviceLoggingAdvice: " +
                "attempt to return book in library");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: Exception " + e
            + " logged");

            //rethrow exception into target method
            throw e;

            //processing exception in aspect method
//            targetMethodResult = "Unknown name of the book";
        }

        System.out.println("aroundAdviceLoggingAdvice: " +
                "book successfully returned to library");

        return targetMethodResult;
    }
}
