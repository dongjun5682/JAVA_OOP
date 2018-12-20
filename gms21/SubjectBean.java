package gms21;

public class SubjectBean {
	private String subjName ,profName;
	private int score;

	public void setSubjname(String subjName){
		this.subjName = subjName;
	}
	public String getSubjname(){
		return subjName;
	}
	public void setprofName(String profName){
		this.profName =profName;
	}
	public String getprofName(){
		return profName;
	}
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}

	public String toString() {
		return String.format("수강 과목: %s\n"
				+ "교수 이름: %s\n"
				+ "점수: %s",subjName,profName,score);
	}
}
