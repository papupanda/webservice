import java.io.File;
import java.util.Arrays;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		Product p=new Product();
		try {
		p.setPid(1);
		p.setPcode("pen");
		p.setModel(Arrays.asList("A","B","C"));
		ObjectMapper m=new ObjectMapper();
		File f=new File("E:/abc.json");
		m.writeValue(f, p);
		System.out.println("done");
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
