package practice_7.FacadePattern;

public class Test {
    public static void main(String[] args) {
//        Power power = new Power();
//        power.on();
//
//        DVDRom dvd = new DVDRom();
//        dvd.load();
//
//        HDD hdd = new HDD();
//        hdd.copyFromDVD(dvd);
        Computer computer = new Computer();
        computer.copy();
    }
}
