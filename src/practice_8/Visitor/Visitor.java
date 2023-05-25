package practice_8.Visitor;

public interface Visitor {
    public void visit(SportCar sportCar);
    public void visit(Engine engine);
    public void visit(Wheel wheel);
}
