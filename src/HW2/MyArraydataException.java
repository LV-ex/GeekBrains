package HW2;
//      Исключение типа данных
public class MyArraydataException extends Exception {
    public int i;
    public int j;

    MyArraydataException(int i, int j) {
        super("Проблема возникла в ячейке " + i + " " + j);
        this.i = i;
        this.j = j;
    }
}
