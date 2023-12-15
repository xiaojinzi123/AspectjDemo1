package com.xiaojinzi.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class HelloWorldAspect {

    private static final String POINTCUT_METHOD =
            "execution(* com.xiaojinzi.jar.*.test1(..))";

    @Around("execute()")
    public Object weaveJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
            String className = methodSignature.getDeclaringType().getSimpleName();
            String methodName = methodSignature.getName();
            System.out.println("className + " + className + ",methodName = " + methodName);
            return joinPoint.proceed();
        } catch (Exception e) {
            return joinPoint.proceed();
        }
    }

}
