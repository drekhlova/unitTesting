package seminar2HWTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import seminar2HW.Car;
import seminar2HW.Motorcycle;
import seminar2HW.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;
    @BeforeEach
    public void setUp() {
        car = new Car("Lada", "Vesta", 2023);
        motorcycle = new Motorcycle("Ducati", "Streetfighter V4 S", 2023);
    }

    //Проверка, что экземпляр объекта Car также является экземпляром транспортного средства
    @Test
    @DisplayName("Car является транспортным средством")
    public void carInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    //Проверка, что объект Car создается с 4-мя колесами
    @Test
    @DisplayName("Car создается с 4-мя колесами")
    public void carHasFourWheels() {
        assertEquals(4, car.getNumWheels());
    }

    //Проверка, что объект Motorcycle создается с 2-мя колесами
    @Test
    @DisplayName("Motorcycle создается с 2-мя колесами")
        public void motorcycleHasTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    //Проверка, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive())
    @Test
    @DisplayName("Car развивает скорость 60 в режиме тестового вождения")
    public void carTestDriveSpeed() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    //Проверка, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive())
    @Test
    @DisplayName("Motorcycle развивает скорость 75 в режиме тестового вождения")
    public void motorcycleTestDriveSpeed() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    /* Проверка, что в режиме парковки
    (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    машина останавливается (speed = 0) */
    @Test
    @DisplayName("В режиме парковки машина останавливается (speed = 0)")
    public void carParkSpeed() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    /* Проверка, что в режиме парковки
    (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    мотоцикл останавливается (speed = 0) */
    @Test
    @DisplayName("В режиме парковки мотоцикл останавливается (speed = 0)")
    public void motorcycleParkSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
