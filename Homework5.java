class Monitor{
    private String monitorSize;
    private String color;
    private String power;
    public Monitor(String ms, String c, String p){
        monitorSize = ms;
        color = c;
        power = p;
    }
    public String getMonitorSize(){
        return monitorSize;
    }
    public String getColor(){
        return color;
    }
    public String getPower(){
        return power;
    }
    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.println(" Size: " + monitorSize);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}

class Computer{
    private String cpu;
    private String memory;
    private String hdd;
    private String color;
    private String power;
    public Computer(String cp, String m, String hd, String c,String p){
        cpu = cp;
        memory = m;
        hdd = hd;
        color = c;
        power = p;
    }
    public String getCpu(){
        return cpu;
    }
    public String getMemory(){
        return memory;
    }
    public String getHdd(){
        return hdd;
    }
    public String getColor(){
        return color;
    }
    public String getPower(){
        return power;
    }
    public void turnOn() {
        System.out.println("Turning on the computer.");
    }
    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.println(" CPU: " + cpu);
        System.out.println(" Memory: " + memory);
        System.out.println(" HDD: " + hdd);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}

class PersonalComputer{
    private Computer computer;
    private  Monitor monitor;
    PersonalComputer(Computer computer, Monitor monitor){
        this.computer = computer;
        this.monitor = monitor;
    }
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printInfo(){
        computer.printInfo();
        monitor.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer(
                new Computer("Core i7","32GB","2TB","White","700W"),
                new Monitor("32 inch","Black","45W"));
        pc.turnOn();
        pc.printInfo();
    }
}