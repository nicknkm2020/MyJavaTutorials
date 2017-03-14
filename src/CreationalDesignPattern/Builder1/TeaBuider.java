package CreationalDesignPattern.Builder1;

/* 
 * TeaBuilder creates Tea by mixing the components[water,milk,sugar,tea powder]. 
 * It implements BeverageBuilder which is bluePrint for creating beverage objects.
 * */
public class TeaBuider extends BeverageBuilder {
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
		System.out.println("Step 4 : Adding 9 Grams of tea powder");
		getBeverage().setPowderQuantity(9);
	}

	@Override
	void setBeverageType() {
		System.out.println("Tea");
		getBeverage().setBeverageName("Tea");
	}

}