package practice_8.Visitor;

class SportCar implements Car {
    Car[] cars;
    public SportCar(){
        cars = new Car[]{new Engine(), new Wheel()};
    }
    public void accept(Visitor visitor) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].accept(visitor);
        }
        visitor.visit(this);
    }
}

