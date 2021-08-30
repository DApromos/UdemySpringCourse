package en.abramovskyi.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class SecurityAspect {
    @Before("en.abramovskyi.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeAddSecurityAdvice: Checking rights of getting book" +
                " or magazine");
        System.out.println("------------------------------------------------------");
    }


//    @Before("en.abramovskyi.spring.aop.aspects.MyPointcuts.allAddMethods()")
//    public void beforeAddSecurityAdvice(){
//        System.out.println("beforeAddSecurityAdvice: Checking rights of getting book" +
//                " or magazine");
//        System.out.println("------------------------------------------------------");
    }

