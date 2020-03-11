// Michael Jay Marajas Array Assignment 

// COP 2800C 

// 3/3/2020

// Purpose: To demonstrate the ability to create "Has A" relationship
//          To use setters and getters within a class
//          To demonstrate use of composite class
import java.util.Scanner;
import java.util.*; 

public class NameComposite {
	//The First Person's Set Attributes
	public void firstSet() {
        System.out.println("Michael");
    }  
	public void secondSet() {
        System.out.println("Jay");
    }  
	public void thirdSet() {
        System.out.println("Marajas");
    }  
	//The Second Person's Set Attributes
	public void firstbSet() {
        System.out.println("Maria");
    }  
	public void secondbSet() {
        System.out.println("Louise");
    }  
	public void thirdbSet() {
        System.out.println("Gonzales");
    }  
	//The Third Person's Set Attributes
		public void firstcSet() {
	        System.out.println("Kenny");
	    }  
		public void secondcSet() {
	        System.out.println("David");
	    }  
		public void thirdcSet() {
	        System.out.println("Smith");
	    } 
	//Setter and Getter for the First Name for First Person
	public String firstNam;
	public String getfirstNam() {
		return firstNam;
	}
	public void setfirstNam(String Michael) {
		  this.firstNam = Michael;
		  }
	//Setter and Getter for the Middle Name
	private String midNam;
	public String getmidNam() {
		return midNam;
	}
	public void setmidNam(String d) {
		  this.midNam = d;
		  }
	//Setter and Getter for the Last Name
		private String lastNam;
		public String getlastNam() {
			return lastNam;
		}
		public void setlastNam(String e) {
			  this.lastNam = e;
			  }
		
	//Setter and Getter for the First Name for Second Person
		public String firstbNam;
		public String getfirstbNam() {
			return firstbNam;
		}
		public void setfirstbNam(String Michael) {
			  this.firstbNam = Michael;
			  }
	//Setter and Getter for the Middle Name
		private String midbNam;
		public String getmidbNam() {
			return midbNam;
		}
		public void setmidbNam(String d) {
			  this.midbNam = d;
			  }
	//Setter and Getter for the Last Name
			private String lastbNam;
			public String getlastbNam() {
				return lastbNam;
			}
			public void setlastbNam(String e) {
				  this.lastbNam = e;
				  }
			
		//Setter and Getter for the First Name for Third Person
			public String firstcNam;
			public String getfirstcNam() {
				return firstcNam;
			}
			public void setfirstcNam(String Michael) {
				  this.firstcNam = Michael;
				  }
		//Setter and Getter for the Middle Name
			private String midcNam;
			public String getmidcNam() {
				return midcNam;
			}
			public void setmidcNam(String d) {
				  this.midcNam = d;
				  }
		//Setter and Getter for the Last Name
				private String lastcNam;
				public String getlastcNam() {
					return lastcNam;
				}
				public void setlastcNam(String e) {
					  this.lastcNam = e;
					  }
}
