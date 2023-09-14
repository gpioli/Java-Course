package org.piolig.annotations.example;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD) // indicates were the annotation is going to be applied
@Retention(RetentionPolicy.RUNTIME) // indicates the scope of the anotation
public @interface JsonAttribute {
    String name() default "";
    boolean capitalize() default false;

}
