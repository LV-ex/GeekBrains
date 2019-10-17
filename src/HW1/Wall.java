package HW1;

public class Wall {

    private static int height;

    public Wall(int height) {
        this.height = height;
    }

    public static int getHeight() {
        return height;
    }

    public static void isJumped(ObstaclesToDo Competitors){
    if (height>Competitors.dojump()){
        System.out.println(Competitors.getName() + " не перепрыгнул");
    } else System.out.println(Competitors.getName() + " перепрыгнул ");
        System.out.println();
    }

    public static boolean isJumpable(){
        return true;
    }

}
