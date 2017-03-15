package BehavioralDesignPatterns.TemplatePattern2;
public class CoffeeClient
{

  public static void main( String[] args )
  {

    System.out.println("Bru coffee preparation\n");
    CoffeeTemplate bruCoffee = new BruCoffee();
    bruCoffee.prepareCoffee();

    System.out.println("*******************************************");

    System.out.println("Nescafe coffee preparation\n");
    CoffeeTemplate NescafeCoffee = new NescafeCoffee();
    NescafeCoffee.prepareCoffee();

  }

}

/*Bru coffee preparation

100 ml water boiled
100 ml milk Added
100 grams sugar Added
10 grams Bru coffee powder Added
Hot coffee ready.....
*******************************************
Nescafe coffee preparation

200 ml water boiled
200 ml milk Added
200 grams sugar Added
20 grams Nescafe coffee powder Added
Hot coffee ready.....*/