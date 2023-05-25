package practice_6.Prototype;

public abstract class Shirt implements Cloneable {
    protected String color;

    abstract void wearShirt();

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
