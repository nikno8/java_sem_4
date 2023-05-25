package practise_1;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
       Consumer cons = new Consumer() {
           @Override
           public void printMaxUncommon(String[] arr) {
               int[] count = new int[arr.length];

              for(int i = 0; i < arr.length; i++){
                  for (int j = 0; j <arr[i].length(); j++){
                      char temp = ' ';
                      for (int z = j; z < arr[i].length(); z++){
                          if(arr[i].charAt(j)!=arr[i].charAt(z) && temp != arr[i].charAt(z)){ //Если текущий символ не будет равен следующему символу то делаем count[]++ то есть прибавляем длину
                              temp = arr[i].charAt(z);
                              count[i]++;
                          }
                      }
                  }
              }
               String answer = "";
               int max = 0;
               for (int i =0; i < count.length; i++){
                   if (max <= count[i]){
                       max = count[i];
                       answer = arr[i];
                   }
               }
               System.out.println(answer);
           }
       };
       String arr[] = {"dgdgdfffffff", "dgdgdfau", "Nikita","abcfu"};
       cons.printMaxUncommon(arr);
    }
}


//14) Имплементировать интерфейс Consumer, принимающий на вход
//        массив строк и выводящий в консоль строку с наибольшим количеством
//        уникальных символов.
