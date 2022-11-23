package vehicles;

public final class Radar implements IRadar{

    public Radar(){
    }

    @Override
    public void startScan() {
        System.out.println("Scan started");
    }

    @Override
    public void stopScan() {
        System.out.println("Scan stopped");
    }

}
