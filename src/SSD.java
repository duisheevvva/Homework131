public class SSD {
    private String memory;
    private String howmanydisks;

    public SSD(String memory, String howmanydisks) {
        this.memory = memory;
        this.howmanydisks = howmanydisks;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHowmanydisks() {
        return howmanydisks;
    }

    public void setHowmanydisks(String howmanydisks) {
        this.howmanydisks = howmanydisks;
    }
    public String getInfo(){
        return "memory: " + memory + "\n" +
                "Howmanydisks: "+ howmanydisks;
    }
}
