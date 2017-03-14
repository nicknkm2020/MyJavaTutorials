package CreationalDesignPattern.Builder1;

/* 
 * CoffeeBuilder creates coffee by mixing the components[water,milk,sugar,coffee powder]. 
 * CoffeeBuilder implements BeverageBuilder which is bluePrint for creating beverage objects.
 * */
public class CoffeeBuilder extends BeverageBuilder {

	@Override
	Beverage createBeverage() {
		return new Beverage();
	}

	@Override
	public void setWater() {
		System.out.println("Step 1 : Boiling water");
		getBeverage().setWater(40);
	}

	@Override
	public void setMilk() {
		System.out.println("Step 2 : Adding milk");
		getBeverage().setMilk(50);
	}

	@Override
	void setSugar() {
		System.out.println("Step 3 : Adding sugar");
		getBeverage().setSugar(10);
	}

	@Override
	void setPowderQuantity() {
		System.out.println("Step 4 : Adding 9 Grams of coffee powder");
		getBeverage().setPowderQuantity(9);
	}

	@Override
	void setBeverageType() {
		System.out.println("Coffee");
		getBeverage().setBeverageName("Coffee");
	}

}