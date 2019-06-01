package com.infopulse.configuration;

import com.infopulse.beans.ExternalBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.infopulse.beans")
public class AutoConfiguration {

    @Bean                                    // когда нужно засунуть в application contenxt бин из чужого пакета
    public ExternalBean externalBean(){
        return new ExternalBean(200);       // bean pushed to application contenxt
    }
}
