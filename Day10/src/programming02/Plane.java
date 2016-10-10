package programming02;

public class Plane {
	private String product;
	private String model;
	private int customer;
	private int plane;
	private int passport;
	private final static int maxCustomer = 500;
	private static int planes = 1;

	public Plane(String product, String model, int customer) {
		this.product = product; 
		this.model = model;
		this.customer = customer;
	}

	// set start
	public void setProduct(String product) {
		product = product;
	}

	public void setModel(String model) {
		model = model;
	}

	public void setCustomer(int customer) {
		customer = customer;
	}
	
	public void setPlane(int plane) {
		plane = plane;
	}

	// set end

	// get start
	public String getProduct() {
		return product;
	}

	public String getModel() {
		return model;
	}

	public int getCustomer() {
		return customer;
	}

	public int getPlane() {
		return plane;
	}

	public static int getMaxCustomer() {
		return maxCustomer;
	}

	public static int getplaens() {
		return planes;
	}

	// get end

	public void plan() {
		passport = ++plane;
	}

	public void plane(String product, String model) {
		this.product = product;
		this.model = model;
		this.passport = ++planes;
	}

	public void plane(String product, String model, int customer) {
		this.product = product;
		this.model = model;
		this.customer = customer;
		this.passport = ++planes;
	}

	public String toString() {
		return "Á¦ÀÛ»ç :" + getProduct() + " " + "½Â°´¼ö :" + getModel() + " " + "°í°´¼ö : " + getCustomer() +" ÃÖ´ë°ª" +getMaxCustomer() +"°èÈ¹" + getplaens() ;
	}
}
