package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести данные для списка: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        Integer a = sc.nextInt();
        List<Integer> list = new ArrayList<>(a);
        System.out.println("Введите верхнюю границу для значений:");
        Integer b = sc.nextInt();
        logger.log("Создаем и наполняем список");
        fillList(list,a,b);
        System.out.println("Вот случайный список: "+list);
        logger.log("Просим пользователя вести ходные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        Integer f = sc.nextInt();
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим список на экран");
        System.out.println("Отфильтрованный список" + result);
        logger.log("Завершаем программу");

    }
    public static void fillList(List<Integer> list, int a, int b){
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            list.add(random.nextInt(b));
        }
    }
}
