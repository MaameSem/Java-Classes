public class Laptop {

	private String brand;
	private String average price;
	private String operating system;
	
	
	public Laptop() {}
	
	public Laptop(String brand, String price) {
		this.brand = brand;
		this.price = price;
	}
	
	public Laptop(String brand, String price, String operating system) {
		this.brand = brand;
		this.price = price;
		this.operating system = operating system;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOperating system() {
		return operating system;
	}

	public void setOperating system(String operating system) {
		this.operating system = operating system;
	}

	
	public String getDetails() {
		return operating system + " is the operating system of " + brand + ". Brand " is sold at \"" + average price + ".\"";
	}
	
	public static boolean Sameoperating system(Laptop l1, Laptop l2) {
		return l1.operatingsystem.equals(l2.operatingsystem);
	}
	
}
