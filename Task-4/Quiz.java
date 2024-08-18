package Task4;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz {

	 private static final int time_limit = 10; 
	    private static int score = 0;             
	    private static boolean timeEnd = false;  
	    private static int questionIndex = 0;     
	    private static char[] userAnswers = new char[5];  

	   
	    static String[] questions = {
	            "1. What is the capital of India?",
	            "2. Who wrote 'Shyam chi Aai'?",
	            "3. What is the chemical symbol for water?",
	            "4. What is part of a database that holds only one type of information?",
	            "5. Who is the founder of Microsoft?"};

	    static String[][] options = {
	            {"A. Paris", "B. London", "C. New Delhi", "D. Mumbai"},
	            {"A. Sane Guruji ", "B. Charles Dickens", "C. William Shakespeare", "D. George Orwell"},
	            {"A. H2O", "B. CO2", "C. O2", "D. NaCl"},
	            {"A. Report", "B. Field", "C. Record", "D. File"},
	            {"A. Bill Gates", "B. Steve Jobs", "C. Elon Musk", "D. Larry Page"}};
	   
	    
	    
	    static char[] correctAnswers = {'C', 'A', 'A', 'B', 'A'};

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Quiz Game!  \n");

	     
	        for (questionIndex = 0; questionIndex < questions.length; questionIndex++)
	        {
	        	askQuestion(scanner, questionIndex);
	        }

	        
	        displayResults();
	        scanner.close();
	    }

	  
	    private static void askQuestion(Scanner scanner, int questionIndex) {
	        timeEnd = false; 

	     
	        System.out.println(questions[questionIndex]);
	        for (String option : options[questionIndex]) {
	            System.out.println(option);
	        }

	       
	        Timer timer = new Timer();
	        timer.schedule(new TimerTask() {
	            @Override
	            public void run() {
	                timeEnd = true;
	                System.out.println("\nTime's up! Moving to the next question.\n");
	                userAnswers[questionIndex] = ' '; // No answer recorded if time is up
	                timer.cancel();
	            }
	        }, time_limit * 1000); 

	       
	        char userAnswer = getUserAnswer(scanner);
	        timer.cancel(); 

	        
	        if (!timeEnd) {
	            userAnswers[questionIndex] = userAnswer;
	            if (userAnswer == correctAnswers[questionIndex]) {
	                score++;
	            }
	        }
	    }

	    
	    private static char getUserAnswer(Scanner scanner) {
	        char answer = ' ';
	        long startTime = System.currentTimeMillis();

	        
	        while (System.currentTimeMillis() - startTime < time_limit* 1000 && !timeEnd) {
	            System.out.print("Enter your answer (A/B/C/D): ");
	            answer = scanner.next().toUpperCase().charAt(0);
	            if (answer >= 'A' && answer <= 'D') {
	                break;
	            } else {
	                System.out.println("Invalid input. Please enter A, B, C, or D.");
	            }
	        }

	        return answer;
	    }
 
	    private static void displayResults() {
	        System.out.println("\nQuiz Completed!");
	        System.out.println("Your Score: " + score + "/" + questions.length);
	        System.out.println("\nSummary of Correct and Incorrect Answers:");
	        for (int i = 0; i < questions.length; i++) {
	            System.out.println(questions[i]);
	            System.out.println("Your answer: " + (userAnswers[i] == ' ' ? "No Answer" : userAnswers[i]));
	            System.out.println("Correct answer: " + correctAnswers[i]);
	            System.out.println();
	        }
	    }
	}
