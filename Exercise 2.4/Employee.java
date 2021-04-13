package Exercise2_4;

public class Employee {
	
	String name;
	int ID;
	int age;
	char gender;
	String department;
	String position;
	double salary;

	// Create Setter Method
	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  public void setAge(int age) {
		  this.age = age;
	  }
	  
	  public void setID(int ID) {
		  this.ID = ID;
	  }
	  
	  public void setGender(char gender) {
		  this.gender = gender;
	  }
	  
	  public void setDepartment(String department) {
		  this.department = department;
	  }
	  
	  public void setPosition(String position) {
		  this.position = position;
	  }
	  
	  public void setSalary(double salary) {
		  this.salary = salary;
	  }

	// Create Getter Method
	  public String getName() {
		  return this.name;
	  }
	  
	  public int getID() {
		  return this.ID;
	  }
	  
	  public int getAge() {
		  return this.age;
	  }
	  
	  public char getGender() {
		  return this.gender;
	  }
	  
	  public String getDepartment() {
	 	  return this.department;
 	  }
	  
	  public String getPosition() {
		  return this.position;
	  }
	  
	  public double getSalary() {
		  return this.salary;
	  }

}
