package HW5;
//      Описываем работу потоков
public class MyThread implements Runnable {

    private float array[];
    private int start;

    public MyThread(float array[] , int start) {
        this.array = array;
    }

    public MyThread(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for(int i = start;i<array.length;i++ ) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
