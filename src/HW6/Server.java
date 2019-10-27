package HW6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {


    public static void main(String[] args) {
        Server server = new Server();
    }

    public Server() {

        ServerSocket server = null;
        Socket socket = null;

        try {
            server = new ServerSocket(8189);
            System.out.println("Cервер включен");
            socket = server.accept();
            System.out.println("Клиент подключился");
            Scanner in =  new Scanner(socket.getInputStream());
            // Исходящий поток с дополнительным "смывом"
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); //или пишем внизу метод
            Scanner consoleWrite = new Scanner(System.in);

            // Отправка сообщений клиенту через дополнительный поток
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String msg = consoleWrite.nextLine();
                        out.println(msg);
                    }
                }
            }).start();


            // Обработка полученных сообщений в главном потоке и отправка "эхо"
            while (true) {
                String msg = in.nextLine();
                if (msg.equals("/end")) break;
                System.out.println("Сообщение от клиента :\n\t" + msg +"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
//            Закрытие сокетов
        } finally {
            try {
                socket.close();
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}