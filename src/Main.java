public class Main {
    public static void main(String[] args) {


        System.out.println("      Characreristic laptop     ");

         Macbook macbook=new Macbook(" Macbook Pro M1","silver","no internal card readers"," No extra keys");
        System.out.println(macbook.getInfo());

        System.out.println("~~~~~~~~~~~Displei~~~~~~~~~~~");

        Displei displei = new Displei("13,3-дюймовый (2560 × 1600)","M1 Pro и M1 Max: 18 октября 2021 года","IPS");
        System.out.println(displei.getInfo());

        System.out.println("~~~~~~~~~~~SSD~~~~~~~~~~~~");

        SSD ssd = new SSD("256gb","3");
        System.out.println(ssd.getInfo());

        System.out.println("~~~~~~~~~~Operational memory RAM~~~~~~~~~~~");
        OperationalmemoryRAM operationalmemoryRAM = new OperationalmemoryRAM("16GB","M1 Pro и M1 Max: 18 октября 2021 года");
        System.out.println(operationalmemoryRAM.getInfo());

        System.out.println("~~~~~~~~~~~~USB port~~~~~~~~~~~~~~~");

        USBport usBport = new USBport("512 GB SSD","12L");
        System.out.println(usBport.getInfo());
















    }
}