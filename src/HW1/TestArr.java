package HW1;

import java.util.Scanner;

public class TestArr {

    public static void main(String[] args) {
        System.out.println("Введите поочередно кол-во стен, а после - кол-во беговых дорожек");
        Scanner in = new Scanner(System.in);
        //Создаем препядствия и заполняем ими массив
        Wall wall = new Wall(2);
        Track track = new Track(8);
        int numberOfObstacles = 5;
        Object Obstacles[] = new Object[numberOfObstacles];
        for (int i = 0; i < Obstacles.length; i++) {
            if (i % 2 == 0) {
                Obstacles[i] = wall;
            } else Obstacles[i] = track;
        }
        for (int i = 0; i < Obstacles.length; i++) {
            System.out.println();
        }
        //Создаем испытуемых и заполняем ими массив
        boolean flag = true;
        Human human = new Human("Тесла");
        Cat cat = new Cat("Шредингер");
        Robot robot = new Robot("Алиса");
        Object Contestments[] = new Object[3];
        human.dojump();
        Contestments[0] = human;
        Contestments[1] = cat;
        Contestments[2] = robot;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (Obstacles[j] == wall) {
                    if (Contestments[i] == human) {
                        if ((human.dojump() < wall.getHeight()) && human.isFlag()) {
                            System.out.println(human.getName() + " не перепрыгнул стену и не может продолжать испытание дальше.");
                            System.out.println(human.getName() + " прыганет на : " + human.dojump() + " ,а высота стены - " + wall.getHeight());
                            System.out.println();
                            human.setFlag();
                            j = -1;
                            i++;
                        } else if (human.dojump() >= wall.getHeight()&& human.isFlag()){
                            System.out.println(human.getName() + " перепрыгнул стену и может продолжать испытание дальше.");
                            System.out.println();
                        }
                    } else if (Contestments[i] == cat) {
                        if (cat.dojump() < wall.getHeight() && cat.isFlag()) {
                            System.out.println(cat.getName() + " не перепрыгнул стену и не может продолжать испытание дальше.");
                            System.out.println(cat.getName() + " прыганет на : " + cat.dojump() + " ,а высота стены - " + wall.getHeight());
                            System.out.println();
                            cat.setFlag();
                            j = -1;
                            i++;
                        } else if (cat.dojump() >= wall.getHeight()&& cat.isFlag()){
                            System.out.println(cat.getName() + " перепрыгнул стену и может продолжать испытание дальше.");
                            System.out.println();
                        }

                    } else {
                        if (robot.dojump() < wall.getHeight() && robot.isFlag()) {
                            System.out.println(robot.getName() + " не перепрыгнул стену и не может продолжать испытание дальше.");
                            System.out.println(robot.getName() + " прыганет на : " + robot.dojump() + " ,а высота стены - " + wall.getHeight());
                            System.out.println();
                            robot.setFlag();
                            j = -1;
                            i++;
                        } else if (robot.dojump() >= wall.getHeight() && robot.isFlag()) {
                            System.out.println(robot.getName() + " перепрыгнул стену и может продолжать испытание дальше.");
                            System.out.println();
                        }
                    }

                } else {
                    if (Contestments[i] == human) {
                        if (human.doRun()< track.getDistance() && human.isFlag()) {
                            System.out.println(human.getName() + " не пробежал дорожку и не может продолжать испытание дальше.");
                            System.out.println(human.getName() + " бегает на: " + human.doRun() + " ,а длина дорожки - " + track.getDistance());
                            System.out.println();
                            human.setFlag();
                            j = -1;
                            i++;
                        } else if (human.doRun()>= track.getDistance() && human.isFlag()) {
                            System.out.println(human.getName() + " пробежал дорожку  и может продолжать испытание дальше.");
                            System.out.println();
                        }
                    } else if (Contestments[i] == cat) {
                        if (cat.doRun() < track.getDistance()&& cat.isFlag()) {
                            System.out.println(cat.getName() + " не пробежал дорожку  и не может продолжать испытание дальше.");
                            System.out.println(cat.getName() + " бегает на: : " + cat.doRun() + " ,а длина дорожки - " + track.getDistance());
                            System.out.println();
                            cat.setFlag();
                            j = -1;
                            i++;
                        } else if (cat.doRun() >= track.getDistance()&& cat.isFlag()){
                            System.out.println(cat.getName() + " пробежал дорожку  и может продолжать испытание дальше.");
                            System.out.println();
                        }

                    } else {
                        if (robot.doRun() < track.getDistance()&& robot.isFlag()) {
                            System.out.println(robot.getName() + " не пробежал дорожку  и не может продолжать испытание дальше.");
                            System.out.println(robot.getName() + " бегает на:  : " + robot.doRun() + " ,а длина дорожки - " + track.getDistance());
                            System.out.println();
                            robot.setFlag();
                            j = -1;
                            i++;
                        } else if (robot.doRun() >= track.getDistance()&& robot.isFlag()) {
                            System.out.println(robot.getName() + " пробежал дорожку  и может продолжать испытание дальше.");
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
