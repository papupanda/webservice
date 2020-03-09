import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		RestProgram r=new RestProgram();
		r.setPid(1);
		r.setName("satya");
		r.setNum(1.5);
		ObjectMapper m=new ObjectMapper();
		try {
		String json=m.writeValueAsString(r);
		System.out.println(json);

	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
