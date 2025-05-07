package test12Aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		
		String singnatureString=joinPoint.getSignature().toShortString();
		
		System.out.println(singnatureString+" 시작");
		long start=System.currentTimeMillis();
		
		Object result=null;
		result=joinPoint.proceed();//대상 메소드 호출
		
		long finish=System.currentTimeMillis();
		
		System.out.println(singnatureString+" 종료");
		System.out.println(singnatureString+" 실행시간 : "+(finish-start)+"ms");
		return result;
		
	}
}
