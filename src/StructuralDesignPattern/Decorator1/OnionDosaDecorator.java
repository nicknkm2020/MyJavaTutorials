package StructuralDesignPattern.Decorator1;

public class OnionDosaDecorator extends DosaDecorator {

	public OnionDosaDecorator(Dosa dosa) {
		super(dosa);
	}

	@Override
	public String makeDosa() {
		return dosa.makeDosa() + addOnion();

	}

	private String addOnion() {
		return ",Onion added";
	}
}