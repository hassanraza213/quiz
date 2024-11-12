package utils;

import java.util.ArrayList;
import java.util.List;
import model.Question;

public class GetQuestions {
	
	
	public static List<Question> DisplayQuestions() {
	
		List<Question> addQuestionsArrayList = new ArrayList<>();
		
		Question question1 = new Question();	
		question1.setQuestionText(" What is the capital of France? ");
	
		question1.setOptionsA("A. BERLIN");
		question1.setOptionsB("B. MADRID");
		question1.setOptionsC("C. PARIS");
		question1.setOptionsD("D. ROME");
		question1.setCorrectAnswers("C");
		question1.setMarks(10);
		
		addQuestionsArrayList.add(question1);
		
		
		Question question2 = new Question();
		question2.setQuestionText(" Which planet is known as the Red Planet? ");
		
		question2.setOptionsA("A. EARTH");
		question2.setOptionsB("B. MARS");
		question2.setOptionsC("C. JUPITER");
		question2.setOptionsD("D. SATURN");
		question2.setCorrectAnswers("B");
		question2.setMarks(10);
		
		addQuestionsArrayList.add(question2);
		
		
		Question question3 = new Question();
		question3.setQuestionText(" Who wrote the play Romeo and Juliet? ");
		
		question3.setOptionsA("A. CHARLES");
		question3.setOptionsB("B. ROLLING");
		question3.setOptionsC("C. WILLIAM");
		question3.setOptionsD("D. MARK");
		question3.setCorrectAnswers("C");
		question3.setMarks(10);
		
		addQuestionsArrayList.add(question3);
		
		Question question4 = new Question();
		question4.setQuestionText(" What is the largest ocean on Earth? ");

		question4.setOptionsA("A. ATLANTIC OCEAN");
		question4.setOptionsB("B. INDIAN OCEAN");
		question4.setOptionsC("C. ARTIC OCEAN");
		question4.setOptionsD("D. PACIFIC OCEAN");
		question4.setCorrectAnswers("D");
		question4.setMarks(10);
		
		addQuestionsArrayList.add(question4);
		
		
		Question question5 = new Question();
		question5.setQuestionText(" Which element has the chemical symbol 'O'? ");

		question5.setOptionsA("A. OXYGEN");
		question5.setOptionsB("B. HYDROGEN");
		question5.setOptionsC("C. NITROGEN");
		question5.setOptionsD("D. CARBON");
		question5.setCorrectAnswers("A");
		question5.setMarks(10);
		
		addQuestionsArrayList.add(question5);

		return addQuestionsArrayList;
	}

}
