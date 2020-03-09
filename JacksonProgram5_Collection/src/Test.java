import java.util.Arrays;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		Product p=new Product();
		/*p.setPid(1);
		p.setPcode("pen");
		p.setModel(Arrays.asList("A","B","C"));*/
		String json="{""\pid\":10,\"pcode\":\"AB\""}";"
		ObjectMapper m=new ObjectMapper();
		try {
		String s=m.writeValueAsString(p);
		System.out.println(s);
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
