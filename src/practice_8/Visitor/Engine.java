package practice_8.Visitor;

public class Engine implements Car{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
