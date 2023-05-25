package practice_6;

public class Barcelona implements AbstractFactory {

    @Override
    public Player createPlayer() {
        return new FerranTorres();
    }

    @Override
    public Coach createCoach() {
        return new Xavi();
    }
}
