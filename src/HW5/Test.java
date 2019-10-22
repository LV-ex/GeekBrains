package HW5;

public class Test {
//    Инициализируем базовые компоненты , чтобы не преписывать их каждый раз в разных методах
public static int size =  10000000;
public static int h = size / 2;
public static float[] arr = new float[size];
 static long start;

    public static void method1(){

//       Забивем массив единицами
        for(int i = 0;i<size;i++){
            arr[i] = 1;
        }
//        Запускаем "таймер" и перебиваем "внутренности" массива
        start = System.currentTimeMillis();
        for(int i = 0;i<size;i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Вермя работы первого метода - " + (System.currentTimeMillis() - start));
    }

    public static void method2() {

//        Забиваем массив единицами
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
//        Запускаем "таймер" и начинаем разбивать массив
         float[] a1 = new float[h];
         float[] a2 = new float[h];
        start = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
//        Забиваем массив новыми элементами через два потока
        new Thread(new MyThread(a1 , 0)).start();
        new Thread(new MyThread(a2 , h)).start();
//        Заново склеиваем массив воедино и останавливаем таймер
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Вермя работы второго метода - " + (System.currentTimeMillis() - start));

    }

    public static void main(String[] args){

    Test.method1();
    Test.method2();
    }

}
