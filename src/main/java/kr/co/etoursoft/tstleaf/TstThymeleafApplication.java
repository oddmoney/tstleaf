package kr.co.etoursoft.tstleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableCaching 
@ComponentScan(value = { "kr.co.etoursoft.tstleaf.*" })
@PropertySource({ "classpath:property/tstleaf.properties"})
@EnableAspectJAutoProxy
public class TstThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(TstThymeleafApplication.class, args);
	}

}
