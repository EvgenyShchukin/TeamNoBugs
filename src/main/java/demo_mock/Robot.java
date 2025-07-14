package demo_mock;

public interface Robot {
    boolean move();
}

class Test implements Robot {
    public static void main(String[] args) {
        Robot robot = new Test();

        climb(robot, 7);
    }

    public static void climb(Robot robot, int steps) {
        int countSteps = 0;
        for (int i = 1; i <= steps; i++) {
            if (robot.move()) {
                countSteps++;
            }
        }
        System.out.println("Робот сделал " + countSteps + " шагов вперед");
    }

    @Override
    public boolean move() {
        return true;
    }
}
