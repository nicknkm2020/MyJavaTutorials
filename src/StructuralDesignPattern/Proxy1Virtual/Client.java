package StructuralDesignPattern.Proxy1Virtual;

class Client {

	/**
	 * Test method
	 */
	public static void main(String[] args) {
		final Image IMAGE1 = new ProxyImage("HiResolution_100MB_Dog Photo");
		final Image IMAGE2 = new ProxyImage("HiResolution_100MB_Lion photo");

		System.out.println("IMAGE1[" + IMAGE1 + "] calling displayImage first time :");
		IMAGE1.displayImage(); // loading necessary

		System.out.println("IMAGE1[" + IMAGE1 + "] calling displayImage second time :");
		IMAGE1.displayImage(); // loading unnecessary

		System.out.println("IMAGE1[" + IMAGE1 + "] calling displayImage third time :");
		IMAGE1.displayImage(); // loading unnecessary

		System.out.println("###############################################################\n");

		System.out.println("IMAGE2[" + IMAGE2 + "] calling displayImage first time :");
		IMAGE2.displayImage(); // loading necessary

		System.out.println("IMAGE2[" + IMAGE2 + "] calling displayImage second time :");
		IMAGE2.displayImage(); // loading unnecessary

	}

}

/*IMAGE1[StructuralDesignPattern.Proxy1Virtual.ProxyImage@15db9742] calling displayImage first time :
	   Loading   HiResolution_100MB_Dog Photo
	   Displaying HiResolution_100MB_Dog Photo

	IMAGE1[StructuralDesignPattern.Proxy1Virtual.ProxyImage@15db9742] calling displayImage second time :
	   Displaying HiResolution_100MB_Dog Photo

	IMAGE1[StructuralDesignPattern.Proxy1Virtual.ProxyImage@15db9742] calling displayImage third time :
	   Displaying HiResolution_100MB_Dog Photo

	###############################################################

	IMAGE2[StructuralDesignPattern.Proxy1Virtual.ProxyImage@6d06d69c] calling displayImage first time :
	   Loading   HiResolution_100MB_Lion photo
	   Displaying HiResolution_100MB_Lion photo

	IMAGE2[StructuralDesignPattern.Proxy1Virtual.ProxyImage@6d06d69c] calling displayImage second time :
	   Displaying HiResolution_100MB_Lion photo
*/
