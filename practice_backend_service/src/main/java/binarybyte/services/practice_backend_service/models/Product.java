package binarybyte.services.practice_backend_service.models;

public class Product {

	private int id;
	private String name;
	
	protected Product() {}
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
