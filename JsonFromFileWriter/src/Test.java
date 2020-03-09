import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String[] args) {
		try {
			//create object
			Customer m=new Customer();
			m.setCid(1);
			m.setCname("A");
			m.setCver(1.5);
			m.setCode("nit");
			//create FileReader Object
		FileWriter f=new FileWriter("E:/one.json");
		//Create gson object
		Gson g=new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.setPrettyPrinting()
				.create();
		g.toJson(m,f);
		System.out.println("done");
		f.close();
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
