package practice_6.Factory;

public class TestFactory {
    public static void main(String[] args) {
        Factory cityCar = new CityCreator();
        for (int i=0;i<3;i++){
            cityCar.doCar();
        }

        Factory seaTransport = new RacingCreator();
        seaTransport.doCar();

    }
}
