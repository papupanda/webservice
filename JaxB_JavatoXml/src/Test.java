import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Test {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("satya");
		e.setEmpsal(1000);
		try {
			JAXBContext context= JAXBContext.newInstance(Employee.class);
			Marshaller m=context.createMarshaller();
			m.marshal(e, new File("E:/xml and webservice/prod.xml"));
			System.out.println("done");
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}
