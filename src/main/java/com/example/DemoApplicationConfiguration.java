package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.GenericConversionService;

@Configuration
public class DemoApplicationConfiguration {

    @Bean
    public ConversionService conversionService() {
        GenericConversionService conversionService = new GenericConversionService();
        conversionService.addConverter(new MapToEmployeeConverter());
        return conversionService;
    }
}
