package WithStratergyPattern.Strategy;

import WithStratergyPattern.Strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
