package org.example.injection;

import javax.annotation.ManagedBean;
import java.util.Date;

@ManagedBean
public class DateSource {
    public String getDate() {
        String prefix = "DateSource = ";
        String date = new Date().toString();
        return  prefix + date;
    }
}