package practice_8.Visitor;

class CarVisitor implements Visitor {
    public void visit(SportCar sportcar) {
        print("car");
    }
    public void visit(Engine engine) {
        print("engine");
    }
    public void visit(Wheel wheel) {
        print("wheel");
    }
    private void print(String string) {
        System.out.println(string);
    }
}

