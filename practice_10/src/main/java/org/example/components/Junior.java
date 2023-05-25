package org.example.components;

import org.example.interfaces.Programmer;

public class Junior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("I'm junior developer");
    }
}
