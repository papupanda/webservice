import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String[] args) {
		//create json
		String json= "{\"cid\":10,\"cname\":\"A\",\"cver\":3.6,\"code\":\"NIT\"}";
		//create Gson object
		Gson g=new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.setPrettyPrinting()
				.create();
		//create customer object
		Customer c=new Customer();
		//call method fromjson
		c=g.fromJson(json, Customer.class);
		//print 
		System.out.println(c);
	}

}
