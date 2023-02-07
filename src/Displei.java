public class Displei {
    private String dioganal;
    private String manufacture;
    private String matrixtype;


    public Displei(String dioganal, String manufacture, String matrixtype) {
        this.dioganal = dioganal;
        this.manufacture = manufacture;
        this.matrixtype = matrixtype;
    }

    public String getDioganal() {
        return dioganal;
    }

    public void setDioganal(String dioganal) {
        this.dioganal = dioganal;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getMatrixtype() {
        return matrixtype;
    }

    public void setMatrixtype(String matrixtype) {
        this.matrixtype = matrixtype;
    }

    public  String getInfo(){
        return "Dioganal" + dioganal + "\n" +
                "Manufacture" + manufacture + "\n" +
                "Matrixtype" + matrixtype;
    }
}
