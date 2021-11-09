public class Monitor{
    private String monitorSize="24 inch";
    private String color="Black";
    private String power="45W";
    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.println("Size: "+monitorSize);
        System.out.println("Color: "+color);
        System.out.println("Power: "+power);
    }
}
