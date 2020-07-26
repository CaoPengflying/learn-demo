package com.cpf.zzc.config;

import com.cpf.zzc.bean.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cpf.zzc")
public class AppConfig {
    /**
     *     method invoke
     */
    @Bean
    public Fox getFox(){
        return new Fox();
    }
}
