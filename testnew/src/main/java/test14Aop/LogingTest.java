package test14Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogingTest {
	@Pointcut("within(test14Aop.*)")
	private void pointcutMethod() {	}
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		String sing = joinPoint.getSignature().getName();
		System.out.println(sing + " 시작");
		long st = System.currentTimeMillis();
		try {
			Object obj = joinPoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(sing + " 끝.");
			System.out.println(sing + " 경과시간 : " + (et-st));
		}
	}
	@Before("within(test14Aop.*)")
	public void beforeAdvice() {
		System.out.println("before : ");
	}
}
