package HW1;

public class Robot implements ObstaclesToDo {

    public String name;
    private int heightOfJump = 3;
    private int distanceOfRun = 10;
    private boolean flag = true;

    public Robot(String name) {
        this.name = name;
    }


    @Override
    public int dojump() {
        return heightOfJump;
    }

    @Override
    public int doRun() {
        return distanceOfRun;
    }
    public String getName() {
        return name;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    @Override
    public boolean setFlag() {
        return false;
    }
}


