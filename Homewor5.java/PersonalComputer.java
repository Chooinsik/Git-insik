public class PersonalComputer {
    public static void main(String args[]){
        PersonalComputer pc=new PersonalComputer();
        pc.turnOn();
        pc.printInfo();
    }
    public void turnOn(){
        Computer com=new Computer();
        Monitor mon=new Monitor();
        com.turnOn();
        mon.turnOn();
    }
    public void printInfo(){
        Computer com=new Computer();
        Monitor mon=new Monitor();
        com.printInfo();
        mon.printInfo();
    }
}