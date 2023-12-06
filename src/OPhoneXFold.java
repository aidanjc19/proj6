public class OPhoneXFold extends OPhoneX {
    private static final String extraFeatures = "foldable";

    @Override
    public String getModel() {
        return super.getModel() + "Fold";
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.15;
    }

    @Override
    public double getScreenSize() {
        return super.getScreenSize() + 0.8;
    }

    public String getExtraFeatures() {
        return extraFeatures;
    }

    @Override
    public String toString() {
        return String.format("%s: Price: $%.2f, Comm: %dG, Camera: %dMP, Screen Size: %.1f\", Vid Res: %dP, Extra Features: %s",
                getModel(), getPrice(), getCommsTech(), getCameraCapacity(), getScreenSize(), getVidRes(), getExtraFeatures());
    }
}
