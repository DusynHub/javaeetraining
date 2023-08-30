package org.example;

import javax.annotation.ManagedBean;
import java.util.Date;

@Source(SourceSpec.SOURCE2)
@ManagedBean
public class FormattedDateSource extends DateSource{
    public String getDate() {
        String prefix = "FormattedDateSource = ";
        String date = new Date().toString();
        return  prefix + date;
    }
}