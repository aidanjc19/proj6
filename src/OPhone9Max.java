public class OPhone9Max extends OPhone9{
    @Override
    public String getModel() {
        return super.getModel() + "Max";
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.2;
    }

    @Override
    public double getScreenSize() {
        return super.getScreenSize() + 0.9;
    }
}
