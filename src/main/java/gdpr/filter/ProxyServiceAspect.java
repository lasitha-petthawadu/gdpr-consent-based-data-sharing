package gdpr.filter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProxyServiceAspect {

    @Around("@annotation(FilterPersonalData)")
    public Object intercept(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Intercepted Advice executing...");
        UserEntity entity = (UserEntity)joinPoint.proceed(joinPoint.getArgs());
        System.out.println("Email returned from target - "+entity.getEmail());
        entity.setEmail(null);
        return entity;

    }
}
