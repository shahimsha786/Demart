
public class Product {
	private String name;
	private String sku;
	private int id;
	
	
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", sku=" + sku + ", id=" + id + "]";
	}




	public static void main(String[] args) {
		Product pr=new Product();
		pr.id=666;
		pr.name="shirt";
		pr.sku="remotegit1";
		System.out.println(pr);
		
		
		
	}

}
