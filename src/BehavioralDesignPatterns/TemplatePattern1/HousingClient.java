package BehavioralDesignPatterns.TemplatePattern1;
public class HousingClient
{

  public static void main( String[] args )
  {

    System.out.println("Build a WoodenHouse\n");
    HouseTemplate houseType = new WoodenHouse();

    // using template method
    houseType.buildHouse();
    System.out.println("************************************************************");

    System.out.println("Build a GlassHouse\n");
    houseType = new GlassHouse();

    houseType.buildHouse();
  }

}


/*Build a WoodenHouse

Building foundation with cement,iron rods,sand and wood
Building Pillars with Wood coating
Building Wooden Walls
Building Wooden Windows
House is built.
************************************************************
Build a GlassHouse

Building foundation with cement,iron rods and sand
Building Pillars with glass coating
Building Glass Walls
Building Glass Windows
House is built.*/