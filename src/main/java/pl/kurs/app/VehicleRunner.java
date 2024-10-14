package pl.kurs.app;

import pl.kurs.model.ElectricVehicle;
import pl.kurs.model.InternalCombustionVehicle;

public class VehicleRunner {
    public static void main(String[] args) {

        ElectricVehicle electricvehicle = new ElectricVehicle();
        electricvehicle.setName("Tesla");
        electricvehicle.setPower(450);
        electricvehicle.setElectricityConsumption(130);

        System.out.println(electricvehicle);

        InternalCombustionVehicle internalCombustionVehicle = new InternalCombustionVehicle("BMW",530,13);
        System.out.println(internalCombustionVehicle);

        electricvehicle.makeSound();
        internalCombustionVehicle.makeSound();

    }
}
