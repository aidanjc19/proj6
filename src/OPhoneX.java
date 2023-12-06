public class OPhoneX extends OPhone{
    private static final double screenSize = 6.7;
    private static final int vidRes = 1080;

    @Override
    public String getModel() {
        return super.getModel() + "X";
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.1;
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
        return super.getCameraCapacity() + 4;
    }

    @Override
    public int getVidRes() {
        return vidRes;
    }

}
