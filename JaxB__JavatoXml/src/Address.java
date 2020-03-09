import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {
	private String hno;
	private String ioc;
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getIoc() {
		return ioc;
	}
	public void setIoc(String ioc) {
		this.ioc = ioc;
	}
	

}
