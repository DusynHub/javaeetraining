package org.example.observer;

import javax.enterprise.event.Observes;

public class ExampleEventObserver {

    public String onEvent(@Observes ExampleEvent event, TextService textService) {
        return textService.parseText(event.getEventMessage());
    }
}