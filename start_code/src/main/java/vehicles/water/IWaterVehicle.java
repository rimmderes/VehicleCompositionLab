package vehicles.water;

import vehicles.IVehicle;

public interface IWaterVehicle extends IVehicle {

    public String getHullType();
    public void setHullType(String hull)throws Exception;



}