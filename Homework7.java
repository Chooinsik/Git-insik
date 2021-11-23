public class Homework7 {
    public static void main(String[] args){
        InkjetPrinter inkjet=new InkjetPrinter("Brother DCP-T720DW",7500);
        LaserPrinter laser=new LaserPrinter("Cannon MFC643Cdw",1500);
        while(inkjet.print());
        while(laser.print());
    }
}

abstract class Printer{
    protected String model;
    protected int printedCount=1;
    protected int availableCount;
    public abstract boolean print();
    public void Printer(String model, int availableCount){
        this.model=model;
        this.availableCount=availableCount;
    }
}

class InkjetPrinter extends Printer{
    public InkjetPrinter(String model,int availableCount){
        this.model=model;
        this.availableCount=availableCount;
    }

    public boolean print(){
        availableCount--;

        if (availableCount==0){
            printedCount=printedCount+1;
            System.out.println(model+":"+printedCount+"매째 인쇄 실패 - 잉크 부족");
            return false;
        }
        else{
            printedCount++;
            return true;
        }
    }
}

class LaserPrinter extends Printer{
    public LaserPrinter(String model,int availableCount){
        this.model=model;
        this.availableCount=availableCount;
        this.printedCount=printedCount;
        availableCount=printedCount;
    }

    public boolean print(){
        availableCount--;
        if (availableCount==0){
            printedCount=printedCount+1;
            System.out.println(model+":"+printedCount+"매째 인쇄 실패 - 토너 부족");
            return false;
        }
        else{
            printedCount++;
            return true;
        }
    }
}