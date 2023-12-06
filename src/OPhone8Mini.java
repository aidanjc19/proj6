public class OPhone8Mini extends OPhone8 {
    public String getModel() {
        return super.getModel() + "Mini";
    }

    public double getPrice() {
        return super.getPrice() * 1.1;
    }

    public double getScreenSize() {
        return super.getScreenSize() - 0.9;
    }

}
