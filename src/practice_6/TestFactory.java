package practice_6;

public class TestFactory {
    public static void main(String[] args) {
        Barcelona barca_fact = new Barcelona();
        Coach xavi = barca_fact.createCoach();
        xavi.teach();
        Player ferran = barca_fact.createPlayer();
        ferran.play();


    }
}
