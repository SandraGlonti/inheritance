package pl.kurs.model;

public class InternalCombustionVehicle extends Vehicle {
    private int fuelConsumption;

    public InternalCombustionVehicle() {
    }

    public InternalCombustionVehicle(String name, int power, int fuelConsumption) {
        super(name, power);
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void makeSound() {
        //super.makeSound(); <----- nadpisujac metode, mamy mozliwosc wywolania metody klasy nadrzednej
        System.out.println("Brum Brum");
    }
}
