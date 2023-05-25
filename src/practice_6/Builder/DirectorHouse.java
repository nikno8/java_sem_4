package practice_6.Builder;

public class DirectorHouse {
    public void constructSimpleHouse(Builder builder){
        builder.setFrame(true);
        builder.setRooms(6);

    }
    public void onlyFrame(Builder builder){
        builder.setFrame(true);
    }
}