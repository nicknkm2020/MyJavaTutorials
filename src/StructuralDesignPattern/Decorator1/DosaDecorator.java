package StructuralDesignPattern.Decorator1;

abstract class DosaDecorator implements Dosa {

	protected Dosa dosa;

	public DosaDecorator(Dosa dosa) {
		this.dosa = dosa;
	}

	@Override
	public String makeDosa() {
		return dosa.makeDosa();
	}
}
