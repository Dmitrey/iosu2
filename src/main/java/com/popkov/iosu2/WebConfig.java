package com.popkov.iosu2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

//    @Bean
//    public ViewResolver getViewResolver(){
//        FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
//        freeMarkerViewResolver.setOrder(1);
//        freeMarkerViewResolver.setPrefix("/templates/");
//        freeMarkerViewResolver.setSuffix(".ftl");
//        freeMarkerViewResolver.setContentType("text/html; charset=UTF-8");
//        return freeMarkerViewResolver;
//   }

    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver resolver= new InternalResourceViewResolver();
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".ftl");
        return resolver;
    }

//    @Bean
//    public FreeMarkerConfigurer getFreeMarkerConfigurer(){
//        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
//        freeMarkerConfigurer.setTemplateLoaderPath("/templates/");
//        return freeMarkerConfigurer;
//    }

}
