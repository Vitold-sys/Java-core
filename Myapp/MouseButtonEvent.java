package com.my.app;

public class MouseButtonEvent extends Event{
    private int keyCode, x, y;

    public MouseButtonEvent(Type type, int KeyCode, int x, int y) {
        super(type);
        this.keyCode = KeyCode;
        this.x = x;
        this.y = y;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
