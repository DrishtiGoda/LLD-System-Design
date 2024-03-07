package WithStratergyPattern;

import WithStratergyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
