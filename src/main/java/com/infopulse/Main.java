package com.infopulse;

import com.infopulse.beans.First;
import com.infopulse.configuration.AutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AutoConfiguration.class);
        ctx.refresh();

        First first = ctx.getBean("firstBean", First.class);
        System.out.println(first.getSecond().getA());
        System.out.println(first.getExternalBean().getB());
    }
}
