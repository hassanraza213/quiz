

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import model.Question;
import utils.GetQuestions;

public class Main {
	
	public static void main(String[] args) {
		
		List<Question> addQuestionsArray = GetQuestions.DisplayQuestions();
		Collections.shuffle(addQuestionsArray);
		Scanner chooseOption = new Scanner(System.in);
		int rightAnswer = 0;
		int obtainedMarks = 0;
		int totalMarks = 0;
		boolean isValid = false;
		for(int i = 0 ; i < addQuestionsArray.size() ; i++) {
			
			System.out.println(addQuestionsArray.get(i).getQuestionText());
			System.out.println();
			System.out.println(addQuestionsArray.get(i).getOptionsA());
			System.out.println(addQuestionsArray.get(i).getOptionsB());
			System.out.println(addQuestionsArray.get(i).getOptionsC());
			System.out.println(addQuestionsArray.get(i).getOptionsD());
			System.out.println();
			
			System.out.println(" Choose an option ");
			String userAnswer = chooseOption.nextLine();
			
			while(isValid != true) {
				if(userAnswer.equalsIgnoreCase("a") || userAnswer.equalsIgnoreCase("b") || userAnswer.equalsIgnoreCase("c") || userAnswer.equalsIgnoreCase("d")) {
					isValid = true;
				} else {
					System.out.println(" Enter a valid option ");
					userAnswer = chooseOption.nextLine();
					isValid = false ;
					
				}
			}
			
			if(userAnswer.equalsIgnoreCase(addQuestionsArray.get(i).getCorrectAnswers())) {
				System.out.println(" Correct Answer ");
				obtainedMarks += addQuestionsArray.get(i).getMarks();
				rightAnswer++ ;
				
			} else {
				System.out.println("Incorrect! The correct answer was: " + addQuestionsArray.get(i).getCorrectAnswers());
			}
			
			totalMarks += addQuestionsArray.get(i).getMarks();
			
		}
		
		System.out.println("You answered "+ rightAnswer + " question correctly out of " + addQuestionsArray.size());
		System.out.println();
		System.out.println("You Scored "+ obtainedMarks + " marks out of " + totalMarks);
		
		chooseOption.close();
	}

}
