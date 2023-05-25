package org.example.components;

import org.example.interfaces.Programmer;

public class Middle implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("I'm middle developer");
    }
}
