package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		List<Question> addQuestion = new LinkedList<>();
			
			
		Question question1 = new Question();	
		question1.setQuestionText(" What is the capital of France? ");
	
		question1.setOptionsA("A. BERLIN");
		question1.setOptionsB("B. MADRID");
		question1.setOptionsC("C. PARIS");
		question1.setOptionsD("D. ROME");
		question1.setCorrectAnswers("C");
		
		addQuestion.add(question1);
		
		
		Question question2 = new Question();
		question2.setQuestionText(" Which planet is known as the Red Planet? ");
		
		question2.setOptionsA("A. EARTH");
		question2.setOptionsB("B. MARS");
		question2.setOptionsC("C. JUPITER");
		question2.setOptionsD("D. SATURN");
		question2.setCorrectAnswers("B");
		
		addQuestion.add(question2);
		
		
		Question question3 = new Question();
		question3.setQuestionText(" Who wrote the play Romeo and Juliet? ");
		
		question3.setOptionsA("A. CHARLES");
		question3.setOptionsB("B. ROLLING");
		question3.setOptionsC("C. WILLIAM");
		question3.setOptionsD("D. MARK");
		question3.setCorrectAnswers("C");
		
		addQuestion.add(question3);
		
		Question question4 = new Question();
		question4.setQuestionText(" What is the largest ocean on Earth? ");

		question4.setOptionsA("A. ATLANTIC OCEAN");
		question4.setOptionsB("B. INDIAN OCEAN");
		question4.setOptionsC("C. ARTIC OCEAN");
		question4.setOptionsD("D. PACIFIC OCEAN");
		question4.setCorrectAnswers("D");
		
		addQuestion.add(question4);
		
		
		Question question5 = new Question();
		question5.setQuestionText(" Which element has the chemical symbol 'O'? ");

		question5.setOptionsA("A. OXYGEN");
		question5.setOptionsB("B. HYDROGEN");
		question5.setOptionsC("C. NITROGEN");
		question5.setOptionsD("D. CARBON");
		question5.setCorrectAnswers("A");
		
		addQuestion.add(question5);
		Collections.shuffle(addQuestion);
		Scanner chooseOption = new Scanner(System.in);
		int rightAnswer = 0;
		for(int i = 0 ; i < addQuestion.size() ; i++) {
			
			System.out.println(addQuestion.get(i).getQuestionText());
			System.out.println();
			System.out.println(addQuestion.get(i).getOptionsA());
			System.out.println(addQuestion.get(i).getOptionsB());
			System.out.println(addQuestion.get(i).getOptionsC());
			System.out.println(addQuestion.get(i).getOptionsD());
			System.out.println();
			
			System.out.println(" Choose an option ");
			String userAnswer = chooseOption.nextLine();
			
			if(userAnswer.equalsIgnoreCase(addQuestion.get(i).getCorrectAnswers())) {
				System.out.println(" Correct Answer ");
		
				rightAnswer++ ;
				
			} else {
				System.out.println("Incorrect! The correct answer was: " + addQuestion.get(i).getCorrectAnswers());
			}
			
		}
		
		System.out.println("You answered "+ rightAnswer + " question correctly out of " + addQuestion.size());
		chooseOption.close();
	}

}
