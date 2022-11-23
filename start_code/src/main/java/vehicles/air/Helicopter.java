package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.IRadar;
import vehicles.Vehicle;

public final class Helicopter extends Vehicle implements IAir, IMotorised, IRadar {

    private int maximumAltitude;
    private IMotorised engine;
    private IRadar radar;


    public Helicopter(float weight, int maxSpeed, IProduct baseProduct, IMotorised engine, IRadar radar) {
        super(weight, maxSpeed, baseProduct);
        this.maximumAltitude = 10000;
        this.engine = engine;
        this.radar = radar;
    }

    @Override
    public void startScan() {
        this.radar.startScan();
    }

    @Override
    public void stopScan() {
        this.radar.stopScan();
    }


    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }

    @Override
    public int getMaximumAltitude() {
        return this.maximumAltitude;
    }

    @Override
    public void setMaximumAltitude(int count) throws Exception {
        throw new Exception("Cannot change maximum Altitude for Plane");
    }



}
