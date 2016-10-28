package spms.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // 어노테이션의 유지 정책을 RUNTIME으로 함(실행 중에도 참조 가능)
public @interface Component {
	String value() default "";
}
