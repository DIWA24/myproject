package com.backend.backend;

<<<<<<< HEAD
/**
 * Hello world!
 *
 */
=======
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfig;

>>>>>>> initial commit backend
public class App 
{
    public static void main( String[] args )
    {
<<<<<<< HEAD
        System.out.println( "Hello World!" );
    }
}
=======
       
AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
//annotationConfigApplicationContext.refresh();

}

}
>>>>>>> initial commit backend
