package practice_6.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Вы можете добавить в программу фабрику прототипов, которая будет хранить каталог прототипов.
 * Таким образом, вы сможете запрашивать у фабрики новые объекты, описывая нужные вам свойства.
 * Фабрика будет искать соответствующий прототип в кеше и возвращать вам копию.
 * **/
public class ShirtStore {
    private static Map<String, Shirt> shirtMap = new HashMap<String, Shirt>();

    static
    {
        shirtMap.put("white", new WhiteShirt());
        shirtMap.put("black", new BlackShirt());
    }

    public static Shirt getShirt(String colorName)
    {
        return (Shirt) shirtMap.get(colorName).clone();
    }
}