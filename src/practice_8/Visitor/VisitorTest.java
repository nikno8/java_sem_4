package practice_8.Visitor;

public class VisitorTest {//тест
    public static void main(String[] args) {
        Car computer = new SportCar();
        computer.accept(new CarVisitor());
    }
}