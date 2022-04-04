public class BipedalRobots extends Robots{

  String type = "Bipedal";

  public BipedalRobots(String name){
    super(name);
  }

  public void rideBicycle() {
    System.out.println(this.name + " Is riding Bicycle " + this.type);
  }
  
}
