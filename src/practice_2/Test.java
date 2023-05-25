package practice_2;

import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        //можно через static
        App humanApp = new App();
        Stream<Human> listHuman =  humanApp.getHumans();
        humanApp.printHuman(listHuman);

        System.out.println("Фильтрация");
        App humanApp1 = new App();
        Stream<Human> listHuman1 =  humanApp1.getHumans();
        humanApp1.filterByWeight(listHuman1);

        System.out.println("----------------------------");
        System.out.println("Сортировка");
        App humanApp2 = new App();
        Stream<Human> listHuman2 =  humanApp2.getHumans();
        humanApp2.sortByAgeAndWeight(listHuman2);
        System.out.println("----------------------------");


        System.out.println("Конкатенация");
        App humanApp3 = new App();
        Stream<Human> listHuman3 =  humanApp3.getHumans();
        humanApp3.concatNames(listHuman3);
        System.out.println("----------------------------");


        System.out.println("Первые 4");
        App humanApp4 = new App();
        Stream<Human> listHuman4 =  humanApp4.getHumans();
        humanApp4.chooseFirstFour(listHuman4);
    }
}