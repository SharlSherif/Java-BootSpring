package com.example.demo;

import com.example.demo.Scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplicationScope {
    private static Logger LOGGER = LoggerFactory.getLogger(DemoApplicationScope.class);

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(DemoApplicationScope.class, args);
        PersonDAO personDAO1 = appContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = appContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO1.getJdbcConnection());
        LOGGER.info("{}", personDAO2.getJdbcConnection());
    }

}
