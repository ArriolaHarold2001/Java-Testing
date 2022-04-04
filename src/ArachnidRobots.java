public class ArachnidRobots extends Robots {
  
  String type = "Arachnid";

  public ArachnidRobots(String name){
    super(name);
  }

  public void makeSpider(){
    System.out.println(this.name + " Is making Spiders " + this.type);
  }
}
