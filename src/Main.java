public class Main {
    public static void main(String[] args) {
        Car car = new Car("car", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        CheckService[] transports = {
                car, car2, truck, truck2, bicycle, bicycle2
        };
        ServiceStation station = new ServiceStation();
        for (CheckService checkService : transports) {
            station.check(checkService);
        }
    }
}