public class OPhone {
    private static final String model = "OPhone";
    private static final double price = 790;
    private static final int commsTech = 4;
    private static final int cameraCapacity = 8;
    private static final double screenSize = 0;
    private static final int vidRes = 0;

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getCommsTech() {
        return commsTech;
    }

    public int getCameraCapacity() {
        return cameraCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getVidRes() {
        return vidRes;
    }


    @Override
    public String toString() {
        return String.format("%s: Price $%.2f, Comm: %dG, Camera: %dMP, Screen Size: %.1f\", Vid Res: %dP",
                getModel(), getPrice(), getCommsTech(), getCameraCapacity(), getScreenSize(), getVidRes());
    }
}
