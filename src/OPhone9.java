public class OPhone9 extends OPhone {
    private static final double screenSize = 5.6;
    private static final int vidRes = 1080;

    @Override
    public String getModel() {
        return super.getModel() + "9";
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.8;
    }

    @Override
    public int getCommsTech() {
        return super.getCommsTech() + 1;
    }

    @Override
    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public int getCameraCapacity() {
        return super.getCameraCapacity() + 2;
    }

    @Override
    public int getVidRes() {
        return vidRes;
    }
}
