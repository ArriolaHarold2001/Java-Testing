public class Main {
  public static void main(String[] args){

    UnipedalRobots robot1 = new UnipedalRobots("Harold");
    BipedalRobots robot2 = new BipedalRobots("Perla");
    QuadrupedalRobots robot3 = new QuadrupedalRobots("Milo");
    ArachnidRobots robot4 = new ArachnidRobots("Carlee");
    RadialRobots robot5 = new RadialRobots("Peter");
    AeronauticalRobots robot6 = new AeronauticalRobots("Frank");

    //ALL TYPES OF ROBOTS HAVE ACCESS TO THIS METHOD FROM ROBOT CLASS
    robot1.cleanPlates();
    robot2.cleanPlates();
    robot3.cleanPlates();
    robot4.cleanPlates();
    robot5.cleanPlates();
    robot6.cleanPlates();
    
    
    //UNIQUE METHODS BASED ON TYPE OF ROBOT 
    robot1.rideUnicycle();
    robot2.rideBicycle();
    robot3.rideFourWheeler();
    robot4.makeSpider();
    robot5.makeCircle();
    robot6.flying();

    
  }
}