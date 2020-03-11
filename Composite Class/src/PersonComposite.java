// Michael Jay Marajas Array Assignment 

// COP 2800C 

// 3/3/2020

// Purpose: To demonstrate the ability to create "Has A" relationship
//          To use setters and getters within a class
//          To demonstrate use of composite class
import java.util.Scanner;
import java.util.*; 
import NameComposite;
public class PersonComposite {
	// First Person's Set Attributes
	public void firstGen() {
        System.out.println("Gender: M");
    }  
	public void firstAge() {
        System.out.println("Age: 23");
    }  
	public void firstSal() {
        System.out.println("Salary: 100,000");
    } 
	
    // Second Person's Set Attributes
	public void firstbGen() {
        System.out.println("Gender: F");
    }  
	public void firstbAge() {
        System.out.println("Age: 22");
    }  
	public void firstbSal() {
        System.out.println("Salary: 10,000");
    } 
	// Third Person's Set Attributes
		public void firstcGen() {
	        System.out.println("Gender: M");
	    }  
		public void firstcAge() {
	        System.out.println("Age: 30");
	    }  
		public void firstcSal() {
	        System.out.println("Salary: 60,000");
	    } 
		//Setter and Getter for First Person's Gender
		//I set a string restriction using the .equals tool and if statement
		public String firstGenSet;
		public String getfirstGenSet() {
			return firstGenSet;
		}
		public void setfirstGenSet(String Male) {
			if (Male.equals("m") || Male.equals("f") || Male.equals("o")) {
				this.firstGenSet = Male;
			}
			else {
				throw new IllegalArgumentException();
			  }
		}
		//Setter and Getter for First Person's Age
		// I set a restriction using the if statement and exception
				public Integer firstAgeSet;
				public Integer getfirstAgeSet() {
					return firstAgeSet;
				}
				public void setfirstAgeSet(int num) {
					if (num < 1 || num > 120) {
				        throw new IllegalArgumentException();
				    }
					  this.firstAgeSet = num;
					  }
		//Setter and Getter for First Person's Salary
				public Integer firstSalSet;
				public Integer getfirstSalSet() {
					return firstSalSet;
				}
				public void setfirstSalSet(int num) {
					if (num < 0) {
				        throw new IllegalArgumentException();
				    }
					  this.firstSalSet = num;
					  }
		//Setter and Getter for Second Person's Gender
				public String firstbGenSet;
				public String getfirstbGenSet() {
					return firstbGenSet;
				}
				public void setfirstbGenSet(String Male) {
					if (Male.equals("m") || Male.equals("f") || Male.equals("o")) {
						this.firstbGenSet = Male;
					}
					else {
						throw new IllegalArgumentException();
					  }
				}
		//Setter and Getter for Second Person's Age
				public Integer firstbAgeSet;
				public Integer getfirstbAgeSet() {
					return firstbAgeSet;
				}
				public void setfirstbAgeSet(int num) {
					if (num < 1 || num > 120) {
				        throw new IllegalArgumentException();
				    }
					  this.firstbAgeSet = num;
					  }
		//Setter and Getter for Second Person's Salary
				public Integer firstbSalSet;
				public Integer getfirstbSalSet() {
					return firstbSalSet;
				}
				public void setfirstbSalSet(int num) {
					if (num < 0) {
				        throw new IllegalArgumentException();
				    }
					  this.firstbSalSet = num;
					  }
		//Setter and Getter for Third Person's Gender
				public String firstcGenSet;
				public String getfirstcGenSet() {
					return firstcGenSet;
				}
				public void setfirstcGenSet(String Male) {
					if (Male.equals("m") || Male.equals("f") || Male.equals("o")) {
						this.firstcGenSet = Male;
					}
					else {
						throw new IllegalArgumentException();
					  }
				}
		//Setter and Getter for Third Person's Age
						public Integer firstcAgeSet;
						public Integer getfirstcAgeSet() {
							return firstcAgeSet;
						}
						public void setfirstcAgeSet(int num) {
							if (num < 1 || num > 120) {
						        throw new IllegalArgumentException();
						    }
							  this.firstcAgeSet = num;
							  }
		//Setter and Getter for Third Person's Salary
						public Integer firstcSalSet;
						public Integer getfirstcSalSet() {
							return firstcSalSet;
						}
						public void setfirstcSalSet(int num) {
							if (num < 0) {
						        throw new IllegalArgumentException();
						    }
							  this.firstcSalSet = num;
							  }		
}
