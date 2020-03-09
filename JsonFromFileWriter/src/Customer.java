import com.google.gson.annotations.Expose;

public class Customer {
	@Expose(serialize =true,deserialize = true)
	private int cid;
	@Expose(serialize = true,deserialize = true)
	private String cname;
	@Expose(serialize = true,deserialize = true)
	private double cver;
	@Expose(serialize = true,deserialize = true)
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
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cver=" + cver + ", code=" + code + "]";
	}
	
	

}
