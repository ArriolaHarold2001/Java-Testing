public class RadialRobots extends Robots{
  
  String type = "Radial";

  public RadialRobots(String name){
    super(name);
  }

  public void makeCircle(){
    System.out.println(this.name + " Is making a circle " + this.type);
  }
}
