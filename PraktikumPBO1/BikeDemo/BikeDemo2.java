public class BikeDemo2 {
    public static void main(String[] args) {
        Bike mountaBike1 = new Bike();
        Bike mountaBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        mountaBike1.setBrand("Trek");
        mountaBike1.speedAcceleration(10);
        mountaBike1.gearChange(2);
        mountaBike1.printInfo();

        mountaBike2.setBrand("Giant");
        mountaBike2.speedAcceleration(20);
        mountaBike2.gearChange(3);
        mountaBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChange(4);
        roadBike1.printInfo();
    }
}
