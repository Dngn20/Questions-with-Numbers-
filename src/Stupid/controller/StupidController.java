package Stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private String myName;
	private Scanner readKeyBoardInput; 
	
	public StupidController()
	{
	myName = "Duncan Nguyen";
	readKeyBoardInput = new Scanner(System.in); 
	}
	public void start ()
	{
	System.out.println("This is slightly less stupid :D and Duncan is cool.");
	System.out.println(myName);
	askQuestions(); 
}

	private void askQuestions()
	{
		System.out.println("What is your name?");
		String userInput = readKeyBoardInput.nextLine();
		System.out.println("You said " + userInput);
	}
} 