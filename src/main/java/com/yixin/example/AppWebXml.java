package com.yixin.example;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * Converting a Spring Boot JAR Application to a WAR
 * https://spring.io/guides/gs/convert-jar-to-war/
 * @author jiangyixin
 *
 */
public class AppWebXml extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }
}
