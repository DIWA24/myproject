package com.backend.timeroll_backed;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.config.ApplicationConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
        		new AnnotationConfigApplicationContext(ApplicationConfig.class);
    }
}
