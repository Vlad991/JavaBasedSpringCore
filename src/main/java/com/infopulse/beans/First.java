package com.infopulse.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@Component(value = "firstBean")             // application context
@Lazy
public class First {
    @Autowired
    @Qualifier("second")
    private Second second;

    @Autowired(required = false)       // true: if spring cannot find obj bean -> exeption
    @Qualifier("externalBean")
    private ExternalBean externalBean;

    public First() {
    }

    public First(@Qualifier("second")Second second, @Qualifier("externalBean")ExternalBean externalBean){
        this.second = second;
        this.externalBean = externalBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("First.init()");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("First.destroy");
    }

}
