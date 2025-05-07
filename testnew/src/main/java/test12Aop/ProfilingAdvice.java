package test12Aop;

import org.aspectj.lang.ProceedingJoinPoint;
//공통관심클래스==엑스트라
public class ProfilingAdvice {
	//공통관심클래스에서 수행할 메소드
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		String signatureString = joinPoint.getSignature().toShortString();
		
		System.out.println(signatureString + " 시작 ");
		long start = System.currentTimeMillis();
		
		Object result = null;
		result = joinPoint.proceed();//대상 메소드 호출
		
		long finish = System.currentTimeMillis();
		
		System.out.println(signatureString + " 종료 ");
		System.out.println(signatureString + " 실행시간 " + (finish - start) + "ms");
		
		return result;
	}
}
