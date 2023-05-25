package practice_7.FacadePattern;

public class HDD {
    public void copyFromDVD(DVDRom dvd){
        if (dvd.hasData())
            System.out.println("Копирование данных с диска...");
        else
            System.out.println("Вставьте диск с данными");
    }
}
