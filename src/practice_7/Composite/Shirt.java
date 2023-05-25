package practice_7.Composite;

import practice_7.Composite.Cloth;

public class Shirt implements Cloth {

    @Override
    public void wear() {
        System.out.println("wearing a shirt");
    }
}
