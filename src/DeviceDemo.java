public class DeviceDemo {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120.0f, "AB1234567CD");
        System.out.println(device); // Device: manufacturer=Samsung, price=120.0, serialNumber=AB1234567CD

        Monitor monitor = new Monitor("Samsung", 120.0f, "AB1234567CD", 1280, 1024);
        System.out.println(monitor); // Monitor: manufacturer=Samsung, price=120.0, serialNumber=AB1234567CD, X=1280, Y=1024
    }
}
