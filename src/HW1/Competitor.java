package HW1;

public class Competitor implements ObstaclesToDo {


    public Competitor() {

    }
        @Override
        public int dojump() {
            int heightOfJump = 2;
            System.out.println("Человек " +  " прыгнул на " + heightOfJump);
            boolean flag = true;
            return heightOfJump;
        }

        @Override
        public int doRun() {
            int distanceOfRun = 5;
            System.out.println("Человек " +  " пробежал " + distanceOfRun);
            boolean flag = true;
            return distanceOfRun;

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isFlag() {
        return false;
    }

    @Override
    public boolean setFlag() {
        return false;
    }
}
