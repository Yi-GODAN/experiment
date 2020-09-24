package setup6.HomeWork.OOP.ClassroomPractice;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/13 11:30
 */
public class CarRental {

    public static void main(String[] args) {
        Car car1 = new Car("别克商务舱GL8", 600L);
        Car car2 = new Car("宝马550i", 500L);
        Car car3 = new Car("别克林荫大道", 300L);

        Bus bus1 = new Bus(16, 800L);
        Bus bus2 = new Bus(12, 1500);

        System.out.println(rentalCar(car1, 2));
        System.out.println(rentalCar(car2, 5));
        System.out.println(rentalCar(car3, 8));
        System.out.println(rentalBus(bus1, 4));
        System.out.println(rentalBus(bus2, 5));
    }

    public static Long rentalCar(Car car, int num) {
        return car.getCost() * num;
    }

    public static Long rentalBus(Bus bus, int num) {
        return bus.getCost() * num;
    }
}
