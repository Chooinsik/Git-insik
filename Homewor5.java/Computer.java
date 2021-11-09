public class Computer{
    private String cpu="Core i7";
    private String memory="16GB";
    private String hd="2TB";
    private String color="White";
    private String power="500W";
    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.println("CPU: "+cpu);
        System.out.println("Memory: "+memory);
        System.out.println("HDD: "+hd);
        System.out.println("Color: "+color);
        System.out.println("Power: "+power);
    }
}