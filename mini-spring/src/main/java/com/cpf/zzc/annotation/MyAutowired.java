package com.cpf.zzc.annotation;

import java.lang.annotation.*;

/**
 * date 2020/8/1
 *
 * @author caopengflying
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowired {
    String value() default "";

}
