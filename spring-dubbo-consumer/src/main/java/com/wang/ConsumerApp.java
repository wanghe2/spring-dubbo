package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations= {"classpath:dubbo-consumer.xml"})
public class ConsumerApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ConsumerApp.class, args);
    }
}
