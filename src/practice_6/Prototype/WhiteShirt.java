package practice_6.Prototype;

public class WhiteShirt extends Shirt {
    public WhiteShirt() {
        this.color="white";
    }

    @Override
    void wearShirt() {
        System.out.println("wearing white shirt");
    }
}
