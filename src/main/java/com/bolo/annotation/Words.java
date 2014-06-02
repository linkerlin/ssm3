package com.bolo.annotation;

import com.bolo.annotation.impl.WordsValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 敏感词验证
 *
 * @author 菠萝大象
 */
@Documented
@Constraint(validatedBy = {WordsValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
public @interface Words {

    String message() default "{constraint.default.words.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String filed() default "";
}