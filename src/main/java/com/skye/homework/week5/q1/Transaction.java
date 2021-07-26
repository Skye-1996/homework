package com.skye.homework.week5.q1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Transaction {
    String value() default "Transaction";
}
