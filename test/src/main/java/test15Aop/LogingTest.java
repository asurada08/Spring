package test15Aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogingTest implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) 
			throws Throwable {
		String methodName=invocation.getMethod().getName();
		
		System.out.println(methodName + "실행전");

		Object obj =  invocation.proceed();//대상 메소드 호출

		System.out.println(methodName + "실행후");
		return obj;
	}

}
