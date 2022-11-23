package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public final class Kayak extends Vehicle implements IWaterVehicle {


    private String hullType;


    public Kayak(float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
        this.hullType = "Wood";

    }

    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hull) throws Exception {
        throw new Exception("Cannot change hull type of Kayak");
    }
}
