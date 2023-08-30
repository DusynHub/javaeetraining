package org.example;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

@ApplicationScoped
public class CdiApp {
    public static void main(String[] args) {
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        initializer.addPackages(CdiApp.class.getPackage());
        SeContainer container = initializer.initialize();
        Logger logger = container.select(Logger.class).get();
        logger.print("Some test text!");
//        container.getBeanManager().fireEvent(new ExampleEvent("Welcome to Baeldung!"));
    }
}