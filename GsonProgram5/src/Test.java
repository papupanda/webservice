import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String[] args) {
		try {
			//create product class object
			Product p=new Product();
			p.setPid(10);
			p.setPcode("A");
			p.setCost(9.9);
			//create gson object
			//Gson g=new Gson();
			Gson g=new GsonBuilder().serializeNulls().setPrettyPrinting().create();
			//call gson object
			String json=g.toJson(p);
			//print data
			System.out.println(json);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch

	}//main

}//class
