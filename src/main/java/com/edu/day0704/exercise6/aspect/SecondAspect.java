package com.edu.day0704.exercise6.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author:zk
 * @date: 2023/7/4 17:22
 * @since: 11
 * 注释：注解方式使用举例
 */
//声明spring容器管理
@Component
//声明是切面类
@Aspect
public class SecondAspect {

    // 替换xml中的切入点配置
    @Pointcut("execution(* com.edu.day0704.exercise6.service..*.*(..))")
    public void pc(){

    }
    @Before("pc()")
    public void before(JoinPoint joinPoint){
        Object target = joinPoint.getTarget();
        System.out.println("before的getClass：" + target.getClass());
        Object[] args = joinPoint.getArgs();
        System.out.println("before的getArgs：" + Arrays.toString(args));

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        // 获取异常类型
        System.out.println("before的异常类型：" + signature.getExceptionTypes());
        // 获取返回值类型
        System.out.println("before的返回值类型：" + signature.getReturnType());
        // 获取方法
        System.out.println("before的方法：" + signature.getMethod());
        System.out.println("before的前置通知执行了");

    }

    /**
     * 在目标方法执行之前和之后都可以执行额外代码的通知。
     * 在环绕通知中必须显式的调用目标方法，否则目标方法不会执行
     * 这个显式调用时通过ProceedingJoinPoint来实现的，可以在环绕通知中接收一个此类型的形参，
     * spring容器会自动将该对象传入，这个参数必须处在环绕通知的第一个形参位置。
     * 环绕通知需要返回返回值，否则真正调用者将拿不到返回值，只能得到一个null。
     * 要注意，只有环绕通知可以接收ProceedingJoinPoint，而其他通知只能接收JoinPoint
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("pc()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around：前 环绕通知");

        // 此为方法执行完毕后的返回结果
        Object o = joinPoint.proceed();
        System.out.println("around：执行后的结果："+ o);

        System.out.println("around：后 环绕通知");
        return null;
    }

    /**
     * 方法只要不抛出异常在方法执行完毕后执行后置通知
     * @param joinPoint
     * @param re
     */
    @AfterReturning(value = "pc()",returning = "re")
    public void afterReturn(JoinPoint joinPoint,Object re){
        //可以接受方法执行的时候传递的参数值
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println("afterReturn获取方法的返回值：" + re);
        System.out.println("afterReturn后置通知执行是在方法执行完毕后");

    }

    /**
     * 在目标方法抛出异常是执行的
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(value = "pc()",throwing = "e")
    public void afterThrow(JoinPoint joinPoint,Exception e){
        System.out.println("afterThrow前面异常通知执行了");
        System.out.println("afterThrow获取到的异常信息是" + e.toString());
    }

    /**
     * 最终通知是一定会执行的
     * @param joinPoint
     */
    @After("pc()")
    public void after(JoinPoint joinPoint){
        System.out.println("after最终通知执行了");
    }
}
