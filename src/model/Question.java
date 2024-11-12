package model;

public class Question {
	
	private String questionText;
	private String optionsA;
	private String optionsB;
	private String optionsC;
	private String optionsD;
	private String correctAnswers;
	private int marks;
	
	
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getOptionsA() {
		return optionsA;
	}
	public void setOptionsA(String optionsA) {
		this.optionsA = optionsA;
	}
	public String getOptionsB() {
		return optionsB;
	}
	public void setOptionsB(String optionsB) {
		this.optionsB = optionsB;
	}
	public String getOptionsC() {
		return optionsC;
	}
	public void setOptionsC(String optionsC) {
		this.optionsC = optionsC;
	}
	public String getOptionsD() {
		return optionsD;
	}
	public void setOptionsD(String optionsD) {
		this.optionsD = optionsD;
	}
	public String getCorrectAnswers() {
		return correctAnswers;
	}
	public void setCorrectAnswers(String correctAnswers) {
		this.correctAnswers = correctAnswers;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
