public class UnipedalRobots extends Robots {
  
  String type = "Unipedal";

  public UnipedalRobots(String name) {
    super(name);
  }
  
  public void rideUnicycle(){
    System.out.println(this.name + " Riding Unicycle " + this.type);
  }
}
