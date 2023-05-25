package org.example.components;

import org.example.interfaces.Programmer;

public class Senior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("I'm senior developer");
    }
}
