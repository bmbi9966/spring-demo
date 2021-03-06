package love.wangqi.http.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: wangqi
 * @description:
 * @date: Created in 2019-01-14 14:40
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface HttpRequest {
    String path() default "";

    String method() default "GET";
}
