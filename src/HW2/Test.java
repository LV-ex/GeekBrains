package HW2;
//      Спасибо, что дали возможность сдать работу на день позже. Надеюсь, что все сделал проавильно .
        import java.util.Scanner;

    public class Test {

        public static void main(String[] args) throws MyArraySizeException, MyArraydataException {
//      Создаем массив
            System.out.println("Введите размерность массива .");
            Scanner in = new Scanner(System.in);
            int v = in.nextInt();
            int t = in.nextInt();
            String[][] Matrix = new String[v][t];
            System.out.println("Введите элементы массива с клавиатуры.");
            for (int i = 0; i < Matrix.length; ++i) {
                for (int j = 0; j < Matrix.length; ++j) {
                    Matrix[i][j] = in.next();
                }
            }

            method(Matrix);
        }

        //  Создаем метод для обработки массива
        public static int method(String[][] arr) throws MyArraySizeException, MyArraydataException {
            int sum = 0;
            if (arr.length != 4) {
                throw new MyArraySizeException();
            } else {
                for (int i = 0; i < arr.length; ++i) {
                    if (arr[i].length != 4) {
                        throw new MyArraySizeException();
                    }

                    for (int j = 0; j < arr.length; ++j) {
                        try {
                            sum += Integer.parseInt(arr[i][j]);
                        } catch (NumberFormatException var5) {
                            throw new MyArraydataException(i, j);
                        }
                    }
                }

                System.out.println("Сумма равняется = " + sum);
                System.out.println("Ошибки не наблюдаются.");
                return sum;
            }
        }
    }
