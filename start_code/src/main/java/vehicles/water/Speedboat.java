package vehicles.water;

import products.IProduct;
import products.Product;
import vehicles.IMotorised;
import vehicles.Vehicle;

public final class Speedboat extends Vehicle implements IWaterVehicle, IMotorised {

    private String hullType;
    private IMotorised motor;

    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, IMotorised motor){
        super(weight, maxSpeed, baseProduct);
        this.hullType = "Plastic";
        this.motor = motor;


}

    // getters and setters
    @Override
    public void startEngine() {
        this.motor.startEngine();
    }

    @Override
    public void stopEngine() {
        this.motor.stopEngine();
    }

    @Override
    public int getHp() {
        return this.motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.motor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.motor.setFuel(fuel);
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String hull) throws Exception {
        throw new Exception("Cannot change wheelCount for Car");
    }

}
