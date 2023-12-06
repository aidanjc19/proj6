public class OPhoneXFilm extends OPhoneX {
    private static final String extraFeatures = "slow motion";
    private static final int vidRes = 4;
    @Override
    public String getModel() {
        return super.getModel() + "Film";
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.25;
    }

    @Override
    public int getVidRes() {
        return vidRes;
    }

    public String getExtraFeatures() {
        return extraFeatures;
    }


    @Override
    public String toString() {
        return String.format("%s: Price: $%.2f, Comm: %dG, Camera: %dMP, Screen Size: %.1f\", Vid Res: %dK, Extra Features: %s",
                getModel(), getPrice(), getCommsTech(), getCameraCapacity(), getScreenSize(), getVidRes(), getExtraFeatures());
    }

}
