import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		Address ad=new Address();
		ad.setAid(1);
		ad.setIoc("java");
		Employee e=new Employee();
		e.setEid(2);
		e.setEname("java1");
		e.setAddrs(ad);
		ObjectMapper m=new ObjectMapper();
		try {
		String json=m.writeValueAsString(e);
		System.out.println(json);

	}
		catch(Exception w) {
			w.printStackTrace();
		}
	}

}
