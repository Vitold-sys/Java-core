package com.my.app;
import com.my.app.Event;
import com.my.app.Layer;

public class Example extends Layer {
    @Override
    public void onEvent(Event event) {
        System.out.println(event);

    }
}
