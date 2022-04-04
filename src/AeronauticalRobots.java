public class AeronauticalRobots extends Robots {
  
  String type = "Aeronautical";

  public AeronauticalRobots (String name){
    super(name);
  }

  public void flying(){
    System.out.println(this.name + " Is Flying " + this.type);
  }
}
