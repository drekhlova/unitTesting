package seminar2HWTest;

import seminar2HW.Car;
import seminar2HW.Motorcycle;
import seminar2HW.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    @Test
    public void carInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2021);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void carHasFourWheels() {
        Car car = new Car("Toyota", "Camry", 2021);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Iron 883", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void carTestDriveSpeed() {
        Car car = new Car("Toyota", "Camry", 2021);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void motorcycleTestDriveSpeed() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Iron 883", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void carParkSpeed() {
        Car car = new Car("Toyota", "Camry", 2021);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void motorcycleParkSpeed() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Iron 883", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
