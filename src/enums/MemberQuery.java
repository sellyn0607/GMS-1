package enums;

public enum MemberQuery {
	LOGIN,INSERT_MEMBAER,SSN_LIST,TEST,TEST2;
	@Override
	public String toString() {
		String query = "";
		switch (this) {
		case LOGIN: 
			query="SELECT MEM_ID userid, TEAM_ID, NAME, SSN,ROLL"+
					"  , PASSWORD FROM MEMBER WHERE MEM_ID LIKE '%s' and PASSWORD LIKE '%s'";
			break;
		case INSERT_MEMBAER:
			query="insert into member(mem_id,password,name,ssn) values('%s','%s','%s','%s') ";
			break;
		case SSN_LIST:
			query="select mem_age from teamw "; break;
			
		case TEST:
			query="update member set SSN='%s' where mem_id like '%s'"; break;
		case TEST2:
			query="update member set AGE='%s' where mem_id like '%s'"; break;
		}
		return query;
	}
	

}
