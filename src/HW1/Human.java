package HW1;

public class Human implements ObstaclesToDo{

    private final String name;
    private int heightOfJump = 2;
    private int distanceOfRun = 5;
    private boolean flag = true;
    public Human (String name){
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

