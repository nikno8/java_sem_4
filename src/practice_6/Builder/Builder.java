package practice_6.Builder;

public interface Builder {
    void setFrame(Boolean hasFrame);
    void setRooms(int numRooms);
    House getResult();
}
