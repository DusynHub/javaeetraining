package org.example;

import javax.annotation.ManagedBean;
import java.util.Date;

@Source(value = SourceSpec.SOURCE1)
@ManagedBean
public class DateSource {
    public String getDate() {
        String prefix = "DateSource = ";
        String date = new Date().toString();
        return  prefix + date;
    }
}