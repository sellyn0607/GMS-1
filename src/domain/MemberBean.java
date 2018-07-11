package domain;

public class MemberBean {
	
	String userid,paaword,age,name,roll,teamId;

	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "MemberBean [userid=" + userid + ", paaword=" + paaword + ", age=" + age + ", name=" + name + ", roll="
				+ roll + ", teamId=" + teamId + "]";
	}

	public String getPaaword() {
		return paaword;
	}

	public void setPaaword(String paaword) {
		this.paaword = paaword;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
}
