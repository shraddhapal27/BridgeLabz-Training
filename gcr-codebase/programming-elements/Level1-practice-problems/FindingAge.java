// Create a class named 'finding age' where there is a person "Harry" and we need to find his age

class FindingAge{
  public static void main(String args[]){
    // Create a string variable name and assign it a value Harry
	String name = "Harry";
	
	// Create an integer variable birth year and assign it a value 2000
	int birth_year = 2000;
	
	// Create an integer variable current year and assign it a value 2024
	int curr_year = 2024;
	
	// Create a variable named age and calculating its value
	int age = curr_year - birth_year;
	
	System.out.print("Harrys's age in 2024 is " + age);
  }
}