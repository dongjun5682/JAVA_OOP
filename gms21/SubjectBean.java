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
		return String.format("���� ����: %s\n"
				+ "���� �̸�: %s\n"
				+ "����: %s",subjName,profName,score);
	}
}
