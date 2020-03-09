import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private int eid;
	private String ename;
	private double empsal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", empsal=" + empsal + "]";
	}
	

}
