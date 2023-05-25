package practice_6;

public class ManchesterUnited implements AbstractFactory{
    @Override
    public Player createPlayer() {
        return new Rashford();
    }

    @Override
    public Coach createCoach() {
        return new TenHaag();
    }
}
