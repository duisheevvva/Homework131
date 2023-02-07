public class OperationalmemoryRAM {

    private String volume;
    private String manufactur;


    public OperationalmemoryRAM(String volume, String manufactur) {
        this.volume = volume;
        this.manufactur = manufactur;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getManufactur() {
        return manufactur;
    }

    public void setManufactur(String manufactur) {
        this.manufactur = manufactur;
    }
    public String getInfo(){
      return   "Volume: " + volume +"\n"+
                "Manufactur: " + manufactur;
    }
}
