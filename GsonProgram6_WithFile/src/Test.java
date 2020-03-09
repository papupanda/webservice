import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String[] args) {
	try {
		//create product object
		Product p=new Product();
		p.setPid(12);
		p.setPcode("A");
		p.setCost(9.8);
		//cretae gson object
		Gson g=new GsonBuilder().serializeNulls().setPrettyPrinting().create();
		
		FileWriter f=new FileWriter("E:/prod.json");
		g.toJson(p,f);
		f.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
