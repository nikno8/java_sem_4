package practice_6.Factory;

public class CityCreator extends Factory{

    @Override
    protected Car createCar() {
        return new CityCar();
    }
}
