package Task;

//import java.util.Arrays;
import java.util.Arrays;
import java.util.stream.IntStream;
//import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to JAVA Lab1!");
        Arr a = new Arr(new int[]{1, 2, 3, 4, 1, 2});
//        int[] b = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(a.getArray()));
        System.out.println("Task 1");
        System.out.println(a.avg());
        System.out.println("Task 2");
        System.out.println(a.count());
        System.out.println("Task 3");
        int[] mulRes = a.mul(5);
        System.out.println(Arrays.toString(mulRes));
        System.out.println("Task 4");
        System.out.println(Arrays.toString(a.indices(1)));
        System.out.println("Task 5");
        System.out.println(Arrays.toString(a.t2()));
    }
}
//5 6 15 17 2
//2 - Найти среднее значение элементов
//5 - Посчитать количество элементов больше нуля
//6 - Помножить элементы  на число
//15 - Найти индексы вхождения элемента в массив (IntStream)
//17 - Вывести элементы, значения которых равны значениям других элементов.