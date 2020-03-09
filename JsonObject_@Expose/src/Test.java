import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setCid(1);
		c.setCname("papu");
		c.setCver(1.5);
		c.setCode("nit");
		Gson g=new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.setPrettyPrinting()
				.create();
		String json=g.toJson(c);
		System.out.println(json);

	}

}
