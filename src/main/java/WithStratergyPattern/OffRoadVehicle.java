package WithStratergyPattern;

import WithStratergyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
