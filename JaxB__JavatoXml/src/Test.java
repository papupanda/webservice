import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Test {

	public static void main(String[] args) {
		try {
		Address ad=new Address();
		ad.setHno("5-88");
		ad.setIoc("Hyd");
		Customer c=new Customer();
		c.setCid(1);
		c.setCname("satya");
		c.setAddr(ad);
		JAXBContext jb=JAXBContext.newInstance(Customer.class);
		Marshaller m=jb.createMarshaller();
		m.marshal(c, new File("E:/xml and webservice/emp.xml"));
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
