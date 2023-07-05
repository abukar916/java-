public class Droid{
  String name;
  int batteryLevel = 100;
  public Droid (String droidName){  
    name = droidName;
  }
  public String toString(){
    return "Hello, I'm the droid:"+ name;
  }
  public void performTask (String task){
    System.out.println(name +" is :" + task);
  }
  public void drain(){
    batteryLevel -= 10;
  }
  public void energyReport(){
    System.out.println(name + " is now at " + batteryLevel + "% charge");
  }
  public void energyTransfer (Droid droid){
    System.out.println("Exchanging battery level between droids:");
    int oldBatteryLevel = this.batteryLevel;
    this.batteryLevel = droid.batteryLevel;
    droid.batteryLevel = oldBatteryLevel;
  }
  public static void main(String[] args){
    Droid robot = new Droid("Codey");
    System.out.println(robot);
    robot.performTask("doing calculations");
    robot.drain();
    System.out.println(robot.batteryLevel);
    robot.performTask("singing");
    robot.drain();
    robot.performTask("running");
    robot.drain();
    robot.performTask("cleaning");
    robot.drain();
    robot.energyReport();
    Droid mechanic = new Droid ("Lewis");
    System.out.println(mechanic);
    mechanic.performTask("changing tyres");
    mechanic.drain();
    mechanic.performTask("changing oil");
    mechanic.drain();
    mechanic.performTask("washing cars");
    mechanic.drain();
    mechanic.energyReport();
    mechanic.energyTransfer(robot);
    mechanic.energyReport();
    robot.energyReport();


    
  }
}
