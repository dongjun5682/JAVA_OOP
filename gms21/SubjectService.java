package gms21;

public class SubjectService {

	public String toString(String name,String hakbun,String subjName,String profName,int score) {
		return String.format("이름 : %s\n"
						+ "학번 : %s\n"
						+ "수강 과목: %s\n"
						+ "교수 이름: %s\n"
						+ "점수: %s",name,hakbun,subjName,profName,score);
	}
}
