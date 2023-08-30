package org.example;


import javax.inject.Inject;

public class Logger {

    protected DateSource dateSource;

    @Inject
    public Logger( @Source(value = SourceSpec.SOURCE2) DateSource dateSource) {
        this.dateSource = dateSource;
    }

    public void print(String message) {
        System.out.println("dateSource.getDate() = " + dateSource.getDate());
        System.out.println(dateSource.getDate() + " : " + message);
    }
}
