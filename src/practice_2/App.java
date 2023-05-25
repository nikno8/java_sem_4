package practice_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;




// Сортировка по сумме веса и возраста,
// фильтрация по весу кратно 5,
// выбор первых четырёх элементов,
// конкатенация имён через пробел
public class App {
    private Stream<Human> temp;

    //получить список людей
    public Stream<Human> getHumans() {
        List<Human> input = new ArrayList<>();
        input.add(new Human(20, "Nikita", "Lagutkin", LocalDate.of(2003, 8, 9), 62));
        input.add(new Human(40, "Alex", "Tsvetkov", LocalDate.of(2003, 7, 22), 65));
        input.add(new Human(15, "Vlad", "Derzhavin", LocalDate.of(2003, 5, 12), 63));
        input.add(new Human(35, "Cristiano", "Ronaldo", LocalDate.of(1985, 2, 4), 81));
        input.add(new Human(30, "Valeriy", "Karpin", LocalDate.of(1974, 2, 1), 71));
        Stream<Human> stream = input.stream();
        return stream;
    }


    //фильтрация
    public void filterByWeight(Stream<Human> temp) {
         temp.filter(human -> (human.getWeight() % 5 == 0)).forEach(System.out::println);
    }

    //вывод на экран
    public void printHuman(Stream<Human> temp) {
        temp.forEach(System.out::println);
    }

    //сортировка по сумме веса и возраста
    public void sortByAgeAndWeight(Stream<Human> temp) {
        temp.sorted((human1, human2) -> (Integer.compare((Integer) human1.getWeightAndAgeSum(), (Integer) human2.getWeightAndAgeSum()))).forEach(System.out::println);
    }

    public void concatNames(Stream <Human> temp) {
        temp.forEach(human -> System.out.print(human.getFirstName() + " "));
    }

    public void chooseFirstFour(Stream <Human> temp){
        temp.limit(4).forEach(System.out::println);
    }

}