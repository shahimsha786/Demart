
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
		pr.id=786;
		pr.name="pant";
		pr.sku="lenein-sleeve";
		System.out.println(pr);
		
		
		
	}

}
