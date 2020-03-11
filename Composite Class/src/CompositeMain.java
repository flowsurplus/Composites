// Michael Jay Marajas Array Assignment 

// COP 2800C 

// 3/3/2020

// Purpose: To demonstrate the ability to create "Has A" relationship
//          To use setters and getters within a class
//          To demonstrate use of composite class
import java.util.Scanner;
import java.util.*; 
//I imported both of the external classes to this Main 
import NameComposite;
import PersonComposite;
public class CompositeMain {
	public static void main(String[] args) {
		
		// I declared the object from another class
		NameComposite obj = new NameComposite();
		PersonComposite obj2 = new PersonComposite();
		System.out.println("First Person's Attributes"); 
		obj.firstSet();
		obj.secondSet();
		obj.thirdSet();
		obj2.firstGen();
		obj2.firstAge();
		obj2.firstSal();
		System.out.println("\n");
		//I give the user the option to change the attributes with an IF statement
		Scanner fC = new Scanner(System.in);
		System.out.println("Would you like to change the First Person's Attributes? (Type yes or no)");
		String firstChange = fC.next();
		while (firstChange.equals("yes")) {
			
		//The setup for user interaction with external class for First Name
		Scanner userFirst = new Scanner(System.in);
		System.out.println("Please Type The First Name of Person 1"); 
		obj.setfirstNam(userFirst.next());
		
		//The setup for user interaction with external class for Middle Name
		Scanner userMid = new Scanner(System.in);
		System.out.println("Please Type The Middle Name of Person 1"); 
		obj.setmidNam(userMid.next());  
		
		//The setup for user interaction with external class for Last Name
				Scanner userLast = new Scanner(System.in);
				System.out.println("Please Type The Last Name of Person 1"); 
				obj.setlastNam(userLast.next());  
				
		//The setup for user interaction with external class for Gender (First Person) 
				Scanner userGen = new Scanner(System.in);
				System.out.println("Please Type The Gender of Person 1 (Please Type m, f, o)"); 
				obj2.setfirstGenSet(userGen.next()); 
				
		//The setup for user interaction with external class for Age (First Person) 
				Scanner userAge = new Scanner(System.in);
				System.out.println("Please Type The Age of the First Person (Please Type a Number Between 1-120)"); 
				obj2.setfirstAgeSet(userAge.nextInt()); 
				
			//The setup for user interaction with external class for Salary (First Person) 
				Scanner userSal = new Scanner(System.in);
				System.out.println("Please Type The Salary of the First Person (Must be a positive number)"); 
				obj2.setfirstSalSet(userSal.nextInt()); 
		
		System.out.println("\n");
		System.out.println("Updated Attributes of Person 1");    
		 System.out.println(obj.getfirstNam());
		 System.out.println(obj.getmidNam());
		 System.out.println(obj.getlastNam());
		 System.out.println("Gender: " + obj2.getfirstGenSet());
		 System.out.println("Age: " + obj2.getfirstAgeSet());
		 System.out.println("Salary: " + obj2.getfirstSalSet());
		 //Close the While Loop
		 firstChange = "no";
		}
		
	//Second Iteration for the Second Person
		System.out.println("\n");
		System.out.println("Second Person's Attributes"); 
		obj.firstbSet();
		obj.secondbSet();
		obj.thirdbSet();
		obj2.firstbGen();
		obj2.firstbAge();
		obj2.firstbSal();
		System.out.println("\n");
		
		Scanner fD = new Scanner(System.in);
		System.out.println("Would you like to change the Second Person's Attributes? (Type yes or no)");
		String secondChange = fD.next();
		while (secondChange.equals("yes")) {
			
		//The setup for user interaction with external class for First Name
		Scanner userbFirst = new Scanner(System.in);
		System.out.println("Please Type The First Name of Person 2"); 
		obj.setfirstbNam(userbFirst.next());
		
		//The setup for user interaction with external class for Middle Name
		Scanner userbMid = new Scanner(System.in);
		System.out.println("Please Type The Middle Name of Person 2"); 
		obj.setmidbNam(userbMid.next());  
		
		//The setup for user interaction with external class for Last Name
				Scanner userbLast = new Scanner(System.in);
				System.out.println("Please Type The Last Name of Person 2"); 
				obj.setlastbNam(userbLast.next());  
				
		//The setup for user interaction with external class for Gender (Second Person) 
				Scanner userbGen = new Scanner(System.in);
				System.out.println("Please Type The Gender of Person 2 (Please Type m, f, o)"); 
				obj2.setfirstbGenSet(userbGen.next()); 
				
		//The setup for user interaction with external class for Age (Second Person) 
				Scanner userbAge = new Scanner(System.in);
				System.out.println("Please Type The Age of the Second Person (Please Type a Number Between 1-120)"); 
				obj2.setfirstbAgeSet(userbAge.nextInt()); 
				
			//The setup for user interaction with external class for Salary (Second Person) 
				Scanner userbSal = new Scanner(System.in);
				System.out.println("Please Type The Salary of the Second Person (Must be a positive number)"); 
				obj2.setfirstbSalSet(userbSal.nextInt()); 
		
		System.out.println("\n");
		System.out.println("Updated Attributes of Person 2");    
		 System.out.println(obj.getfirstbNam());
		 System.out.println(obj.getmidbNam());
		 System.out.println(obj.getlastbNam());
		 System.out.println("Gender: " + obj2.getfirstbGenSet());
		 System.out.println("Age: " + obj2.getfirstbAgeSet());
		 System.out.println("Salary: " + obj2.getfirstbSalSet());
		 //Close the While Loop
		 secondChange = "no";
		}
		
		//Third Iteration for the Third Person
		System.out.println("\n");
		System.out.println("Third Person's Attributes"); 
		obj.firstcSet();
		obj.secondcSet();
		obj.thirdcSet();
		obj2.firstcGen();
		obj2.firstcAge();
		obj2.firstcSal();
		System.out.println("\n");
		Scanner fE = new Scanner(System.in);
		System.out.println("Would you like to change the Third Person's Attributes? (Type yes or no)");
		String thirdChange = fE.next();
		while (thirdChange.equals("yes")) {
			
		//The setup for user interaction with external class for First Name
		Scanner usercFirst = new Scanner(System.in);
		System.out.println("Please Type The First Name of Person 3"); 
		obj.setfirstcNam(usercFirst.next());
		
		//The setup for user interaction with external class for Middle Name
		Scanner usercMid = new Scanner(System.in);
		System.out.println("Please Type The Middle Name of Person 3"); 
		obj.setmidcNam(usercMid.next());  
		
		//The setup for user interaction with external class for Last Name
				Scanner usercLast = new Scanner(System.in);
				System.out.println("Please Type The Last Name of Person 3"); 
				obj.setlastcNam(usercLast.next());  
				
		//The setup for user interaction with external class for Gender (Third Person) 
				Scanner usercGen = new Scanner(System.in);
				System.out.println("Please Type The Gender of Person 3 (Please Type m, f, o)"); 
				obj2.setfirstcGenSet(usercGen.next()); 
				
		//The setup for user interaction with external class for Age (Third Person) 
				Scanner usercAge = new Scanner(System.in);
				System.out.println("Please Type The Age of the Third Person (Please Type a Number Between 1-120)"); 
				obj2.setfirstcAgeSet(usercAge.nextInt()); 
				
			//The setup for user interaction with external class for Salary (Third Person) 
				Scanner usercSal = new Scanner(System.in);
				System.out.println("Please Type The Salary of the Third Person (Must be a positive number)"); 
				obj2.setfirstcSalSet(usercSal.nextInt()); 
		
		System.out.println("\n");
		System.out.println("Updated Attributes of Person 3");    
		 System.out.println(obj.getfirstcNam());
		 System.out.println(obj.getmidcNam());
		 System.out.println(obj.getlastcNam());
		 System.out.println("Gender: " + obj2.getfirstcGenSet());
		 System.out.println("Age: " + obj2.getfirstcAgeSet());
		 System.out.println("Salary: " + obj2.getfirstcSalSet());
		 //Close the While Loop
		 thirdChange = "no";
		}
	}
}
