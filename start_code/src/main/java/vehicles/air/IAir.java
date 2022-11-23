package vehicles.air;

import vehicles.IVehicle;

public interface IAir extends IVehicle {

    public int getMaximumAltitude();
    public void setMaximumAltitude(int count) throws Exception;



}
