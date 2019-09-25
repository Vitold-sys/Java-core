package com.my.app;

public class MousePressedEvent extends MouseButtonEvent {

    public MousePressedEvent(Type type, int KeyCode, int x, int y) {
        super(Type.MOUSE_PRESSED, KeyCode, x, y);
    }

    public MousePressedEvent(int keyCode, int x, int y) {
        super(Type.MOUSE_PRESSED, keyCode, x, y);
    }
}
