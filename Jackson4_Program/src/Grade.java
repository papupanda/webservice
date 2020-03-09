import java.util.Map;

public class Grade {
	int gid;
	Map<String,String>score;
	Model mob;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public Map<String, String> getScore() {
		return score;
	}
	public void setScore(Map<String, String> score) {
		this.score = score;
	}
	public Model getMob() {
		return mob;
	}
	public void setMob(Model mob) {
		this.mob = mob;
	}
	

}
