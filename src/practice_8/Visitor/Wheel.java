package practice_8.Visitor;

class Wheel implements Car {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}