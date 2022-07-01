package core_container;

public class Laptop {
	private String brand;
	private String processor;
	
	private Projector projector;
	
	public void display() {
		System.out.println(brand);
		System.out.println(processor);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public Projector getProjector() {
		return projector;
	}

	public void setProjector(Projector projector) {
		this.projector = projector;
	}
	
	

}
