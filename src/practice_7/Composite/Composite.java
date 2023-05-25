package practice_7.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Cloth {
    private List<Cloth> components = new ArrayList<>();
    public void addComponent(Cloth component){
        components.add(component);
    }
    public void removeComponent(Cloth component){
        components.remove(component);
    }

    @Override
    public void wear() {
        for (Cloth component:components){
            component.wear();
        }
    }
}
