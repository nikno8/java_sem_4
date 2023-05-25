package practice_6.Factory;

public class RacingCreator extends Factory {
    @Override
    protected Car createCar() {
        return new RacingCar();
    }
}
