/*
Robert Plutchak
CIS 220
Class Project Main Class
*/

import java.util.Scanner;

public class  Main

{//opens class

//Methods
	
public static void DisplayMenu()
	{//opens DisplayMenu
	
	System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	System.out.println("Please select your action");
	System.out.println("Press 1 to search for an item");
	System.out.println("Press 2 to add an item");
	System.out.println("Press 3 to edit an existing item");
	System.out.println("Press 4 to delete an item");
	System.out.println("Press 0 to exit the program");
	System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}//closes DisplayMenu

public static void ProcessChoice(char pChoice)
	
{// 	opens ProcessChoice
//	pChoice = lchoice;
	

if (pChoice == '1')
System.out.println("This action will allow the user to search for an entry");
//NewChoice.AddItem();
else if (pChoice == '2')
System.out.println("This action will allow the user to add a new entry");
//NewChoice.Search();
else if (pChoice == '3')
System.out.println("This action will allow the user to edit an existing entry");
//newAcct.Withdrawl();
else if (pChoice == '4')
System.out.println("This action will allow the user to delete an existing entry");
if (pChoice > '4')
System.out.println("Invalid choice selected, please try again");
//	NewChoice.DeleteItem();
}// closes ProcessChoice

public static char GetChoice()
	{// opens GetChoice
	
Scanner keyboard = new Scanner(System.in);
	
String ldummy;
	char lchoice;
	ldummy = keyboard.next();
	
lchoice = ldummy.charAt(0); 
	return lchoice;
	
}// closes GetChoice

	

public static void main(String[] args)

		
{// opens main

	// local variables
	char choice;
	//Bank newAcct;

	// code

//newAcct = new Bank();

	do 
{
DisplayMenu();
choice = GetChoice();
//ProcessChoice(choice, newAcct);
ProcessChoice(choice);
}
while (choice != '0');

}// closes main
	
}// closes class
