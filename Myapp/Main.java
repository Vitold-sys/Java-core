package com.my.app;
import com.my.app.Example;

public class Main {
    public static void main(String[] args) {
        Window window = new Window("My APP", 1024, 720);
        window.addLayer(new Example());
    }
}
