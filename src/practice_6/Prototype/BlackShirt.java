package practice_6.Prototype;

public class BlackShirt extends Shirt {
    public BlackShirt() {
        this.color="black";
    }

    @Override
    void wearShirt() {
        System.out.println("wearing black shirt");
    }
}