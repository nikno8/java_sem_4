package practice_7.Composite;

import practice_7.Composite.Cloth;
import practice_7.Composite.Composite;
import practice_7.Composite.Jacket;
import practice_7.Composite.Shirt;

public class Test {
    public static void main(String[] args) {
        Cloth shirt_1 = new Shirt();
        Cloth shirt_2 = new Shirt();
        Cloth shirt_3 = new Shirt();

        Cloth jacket_1 = new Jacket();
        Cloth jacket_2 = new Jacket();

        Composite composite_1 =new Composite();
        Composite composite_2 =new Composite();
        Composite composite_3 =new Composite();

        composite_1.addComponent(shirt_1);
        composite_1.addComponent(jacket_1);

        composite_2.addComponent(shirt_3);
        composite_2.addComponent(shirt_2);
        composite_2.addComponent(jacket_2);

        composite_3.addComponent(composite_1);
        composite_3.addComponent(composite_2);

        composite_3.wear();


    }
}
