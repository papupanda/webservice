import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private int cid;
	private String cname;
	private Address addr;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}

}
