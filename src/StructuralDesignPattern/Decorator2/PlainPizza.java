package StructuralDesignPattern.Decorator2;

public class PlainPizza implements Pizza {

	@Override
	public String makePizza() {
		return "Plain Pizza ";
	}
}