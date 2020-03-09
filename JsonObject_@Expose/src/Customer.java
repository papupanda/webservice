import com.google.gson.annotations.Expose;

public class Customer {
	@Expose(serialize =true)
	private int cid;
	@Expose(serialize = false)
	private String cname;
	@Expose(serialize = true)
	private double cver;
	@Expose(serialize = true)
	private String code;
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
	public double getCver() {
		return cver;
	}
	public void setCver(double cver) {
		this.cver = cver;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}
