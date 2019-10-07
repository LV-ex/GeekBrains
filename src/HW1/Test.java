package HW1;

public class Test {

    public static void main(String[] args){
        Wall wall = new Wall(3);
        Track track = new Track(6);
        Human human = new Human("Илья");
        Cat cat = new Cat("Мурзик");
        Robot robot = new Robot("Атлас");
        Wall.isJumped(human);
        Wall.isJumped(cat);
        Wall.isJumped(robot);
        Track.isRan(human);
        Track.isRan(cat);
        Track.isRan(robot);
        }
}
