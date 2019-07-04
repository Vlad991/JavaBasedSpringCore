package com.infopulse;

import com.infopulse.beans.First;
import com.infopulse.beans.OtherFirst;
import com.infopulse.configuration.AutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AutoConfiguration.class);
        ctx.refresh();

        First first = ctx.getBean("firstBean", First.class);
        System.out.println(first);
        System.out.println(first.getSecond().getA());
        System.out.println(first.getExternalBean().getB());

        First first2 = ctx.getBean("firstBean2", First.class);
        System.out.println(first2);
        System.out.println(first2.getSecond().getA());
        System.out.println(first2.getExternalBean().getB());

        First first3 = ctx.getBean("firstBean2", First.class);
        System.out.println(first3);
        System.out.println(first3.getSecond().getA());
        System.out.println(first3.getExternalBean().getB());

        OtherFirst otherFirst = ctx.getBean("otherFirst", OtherFirst.class);
        System.out.println(otherFirst.getSecond() == first.getSecond());


    }
}
