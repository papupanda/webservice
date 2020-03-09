
public class RestProgram {
	private int pid;
	private String name;
	private double num;
	public void setPid(int pid) {
		this.pid = pid;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setNum(double num) {
		this.num = num;
	}



	
	

	public int getPid() {
		return pid;
	}


	public String getName() {
		return name;
	}


	public double getNum() {
		return num;
	}
	


	@Override
	public String toString() {
		return "RestProgram [pid=" + pid + ", name=" + name + ", num=" + num + "]";
	}


	
}
