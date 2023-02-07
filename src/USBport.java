public class USBport {
    private String portType;
    private String IDport;

    public USBport(String porttype, String IDport) {
        this.portType = porttype;
        this.IDport = IDport;
    }

    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public String getIDport() {
        return IDport;
    }

    public void setIDport(String IDport) {
        this.IDport = IDport;
    }
    public String getInfo(){
        return "Port type: " + portType + "\n" +
                "ID port" + IDport;

    }
}
