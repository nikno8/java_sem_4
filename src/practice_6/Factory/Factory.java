package practice_6.Factory;

public abstract class Factory {
    public Car doCar(){
        Car car = createCar();
        car.deliver();
        return car;
    }

    protected abstract Car createCar();
}
