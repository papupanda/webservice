import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Test {

	public static void main(String[] args) {
		try {
			JAXBContext jb=JAXBContext.newInstance(Employee.class);
			Unmarshaller um=jb.createUnmarshaller();
			Employee em=(Employee) um.unmarshal(new File("E:/xml and webservice/prod.xml"));
			System.out.println(em);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
