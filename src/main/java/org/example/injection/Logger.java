package org.example.injection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Logger {

    protected DateSource dateSource;

    @Inject
    public Logger( DateSource dateSource) {
        this.dateSource = dateSource;
    }

    public void print(String message) {
        System.out.println("dateSource.getDate() = " + dateSource.getDate());
        System.out.println(dateSource.getDate() + " : " + message);
    }
}
