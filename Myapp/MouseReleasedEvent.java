package com.my.app;

public class MouseReleasedEvent extends MouseButtonEvent {

    public MouseReleasedEvent(int KeyCode, int x, int y) {
        super(Event.Type.MOUSE_RELEASED, KeyCode, x, y);
    }
}
