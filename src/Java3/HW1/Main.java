package Java3.HW1;
//Основной файл к ДЗ 1
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

// Исполняемый код для проверки задания 1
        Integer[] testArr = new Integer[2];
        testArr[0] = 2;
        testArr[1] = 4;
        System.out.println("Массив до свапа\n" + Arrays.toString(testArr));
        Arrays.toString(testArr);
        swap(testArr,0,1);
        System.out.println("Массив после свапа\n" + Arrays.toString(testArr));

// Исполняемый код для проверки задания 2
        ArrayList<Integer> integerArrayList = toArrayList(testArr);

// Исполняемый код для проверки задания 3
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3, apple4);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2, orange3);

// Сравнение коробки яблок с коробкой апельсинов
        System.out.println(box1.compare(box2));

// Перенос содержимого из одной коробки в другую
        Box<Orange> box3 = new Box<Orange>();
        System.out.println(box2.getItems());
        System.out.println(box3.getItems());
        box2.transfer(box3);
        System.out.println(box2.getItems());
        System.out.println(box3.getItems());
    }

    // Задание 1. Пишем метод, для того, чтобы менять местами элементы массива
    public static void swap (Object[] arr, int index1 , int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
    // Задание 2. Пишем метод, для преобразование массива в ArrayList
    public static <T> ArrayList<T> toArrayList(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }

}
