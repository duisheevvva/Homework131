public class Macbook {

    private String marka;
    private String color;
    private String vidiocard;

    private String keyboard;


    public Macbook(String marka, String color, String vidiocard, String keyboard) {
        this.marka = marka;
        this.color = color;
        this.vidiocard = vidiocard;
        this.keyboard = keyboard;

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVidiocard() {
        return vidiocard;
    }

    public void setVidiocard(String vidiocard) {
        this.vidiocard = vidiocard;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getInfo() {
        return "Marka: " + marka + "\n" +
                "Color: " + color + "\n" +
                "Vidiocard: " + vidiocard + "\n" +
                "keyboard: " + keyboard;
    }
}
