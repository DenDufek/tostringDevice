public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: manufacturer=" + getManufacturer() + ", price=" + getPrice() +
                ", serialNumber=" + getSerialNumber() + ", X=" + resolutionX + ", Y=" + resolutionY;
    }
}
