import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String[] args) {
		try {
			
			//create FileReader Object
		FileReader f=new FileReader("E:/one.json");
		//Create gson object
		Gson g=new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.setPrettyPrinting()
				.create();
		Customer c=g.fromJson(f, Customer.class);
		System.out.println(c);
		f.close();
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
