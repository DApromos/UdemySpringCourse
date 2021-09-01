package en.abramovskyi.spring.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods(){}

//    @Pointcut("execution(* get*())")
//    public void allAddMethods(){}
}
