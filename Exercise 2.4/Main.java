package Exercise2_4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee a = new Employee();
		Employee j = new Employee();
		Employee m = new Employee();
		Employee z = new Employee();
		
		a.setName("Andrew");
		a.setID(89062811);
		a.setAge(32);
		a.setGender('M');
		a.setDepartment("Accounting");
		a.setPosition("Accountant");
		a.setSalary(4500);
		
		System.out.println("1.");
		System.out.println("Name\t\t: " + a.getName());
		System.out.println("ID\t\t: " + a.getID());
		System.out.println("Age\t\t: " + a.getAge());
		System.out.println("Gender\t\t: " + a.getGender());
		System.out.println("Department\t: " + a.getDepartment());
		System.out.println("Position\t: " + a.getPosition());
		System.out.printf("Salary\t\t: RM%.2f" , a.getSalary());
		
		System.out.println("\n__________________________________________");
		System.out.println();
		
		j.setName("Jessie");
		j.setID(90073110);
		j.setAge(31);
		j.setGender('F');
		j.setDepartment("Marketing");
		j.setPosition("Marketing specialist");
		j.setSalary(4200);
		
		System.out.println("2.");
		System.out.println("Name\t\t: " + j.getName());
		System.out.println("ID\t\t: " + j.getID());
		System.out.println("Age\t\t: " + j.getAge());
		System.out.println("Gender\t\t: " + j.getGender());
		System.out.println("Department\t: " + j.getDepartment());
		System.out.println("Position\t: " + j.getPosition());
		System.out.printf("Salary\t\t: RM%.2f" , j.getSalary());
		
		System.out.println("\n__________________________________________");
		System.out.println();
		
		m.setName("Melissa");
		m.setID(93022007);
		m.setAge(28);
		m.setGender('F');
		m.setDepartment("Human Resources");
		m.setPosition("Manager");
		m.setSalary(5000);
		
		System.out.println("3.");
		System.out.println("Name\t\t: " + m.getName());
		System.out.println("ID\t\t: " + m.getID());
		System.out.println("Age\t\t: " + m.getAge());
		System.out.println("Gender\t\t: " + m.getGender());
		System.out.println("Department\t: " + m.getDepartment());
		System.out.println("Position\t: " + m.getPosition());
		System.out.printf("Salary\t\t: RM%.2f" , m.getSalary());
		
		System.out.println("\n__________________________________________");
		System.out.println();
		
		z.setName("Zayn");
		z.setID(92081906);
		z.setAge(29);
		z.setGender('M');
		z.setDepartment("IT");
		z.setPosition("Programmer");
		z.setSalary(4700);
		
		System.out.println("4.");
		System.out.println("Name\t\t: " + z.getName());
		System.out.println("ID\t\t: " + z.getID());
		System.out.println("Age\t\t: " + z.getAge());
		System.out.println("Gender\t\t: " + z.getGender());
		System.out.println("Department\t: " + z.getDepartment());
		System.out.println("Position\t: " + z.getPosition());
		System.out.printf("Salary\t\t: RM%.2f" , z.getSalary());
		
		System.out.println("\n__________________________________________");

	}

}
