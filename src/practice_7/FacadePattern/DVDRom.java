package practice_7.FacadePattern;

public class DVDRom {
    private boolean data = false;
    public boolean hasData(){
        return data;
    }
    public void load(){

        data = true;
    }
    public void unload(){

        data = false;
    }
}
