package HW1;

public class Track {

    private static int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    public static int getDistance() {
        return distance;
    }

    public static void isRan(ObstaclesToDo Competitors) {
        if (distance > Competitors.doRun()) {
            System.out.println(Competitors.getName() + " не пробежал");
        } else System.out.println(Competitors.getName() + " пробежал");
        System.out.println();
    }

    public static boolean isRunable() {
        return true;
    }
}
