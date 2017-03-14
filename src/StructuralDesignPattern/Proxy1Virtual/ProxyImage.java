package StructuralDesignPattern.Proxy1Virtual;

//on System B 
class ProxyImage implements Image {

	private RealImage image = null;
	private String filename = null;

	/**
	 * Constructor
	 * 
	 * @param FILENAME
	 */
	public ProxyImage(final String FILENAME) {
		filename = FILENAME;
	}

	/**
	 * Displays the image
	 */
	@Override
	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename);
		}
		image.displayImage();
	}

}