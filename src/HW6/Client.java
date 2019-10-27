package HW6;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) {

        Socket socket = null;

        try {
            socket = new Socket("localhost", 8189);
            Scanner in =  new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner consoleWrite = new Scanner(System.in);
            System.out.println("Клиент подключен.");

            // В дополнительном потоке "слушаем" сервер
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String msg = in.nextLine();
                        System.out.printf("Ответ сервера : \n\t" + msg +"\n");
                    }
                }
            }).start();

            // В основном потоке отправляем сообщения серверу
            while (true) {
                String msg = consoleWrite.nextLine();
                out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
//            Закрываем сокеты
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
