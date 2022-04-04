public class QuadrupedalRobots extends Robots {
  
  String type = "Quadrupedal";

  public QuadrupedalRobots (String name){
    super(name);
  }

  public void rideFourWheeler(){
    System.out.println(this.name + " Is riding a 4 wheeler " + this.type);
  }

}
