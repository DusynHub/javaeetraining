package org.example.injection;

import javax.annotation.ManagedBean;
import java.util.Date;

@ManagedBean
public class FormattedDateSource extends DateSource{
    public String getDate() {
        String prefix = "FormattedDateSource = ";
        String date = new Date().toString();
        return  prefix + date;
    }
}