package driver;


import java.util.Scanner;

import model.Department;
import model.Employee;
import service.CredentialService;

public class DriverClass {
	public static void main(String[] args) {
		Employee employee= new Employee("shreyanssh","agrawal");
		System.out.println("Enter your department");
		System.out.print("1. Technical\n2. Legal\n3. Admin\n4. HR ");
		Scanner sc=new Scanner(System.in);
		int choice =sc.nextInt();
		Department department=new Department();
		CredentialService credentialService= new CredentialService();
		switch(choice) {
		case 1:
			department.setDeptName("Technical");
			String email=credentialService.generateEmail(employee, department);
			String password=credentialService.generatePassword();
			credentialService.showCredentials(email, password);
			break;
		case 2:
			department.setDeptName("Legal");
			email=credentialService.generateEmail(employee, department);
			password=credentialService.generatePassword();
			credentialService.showCredentials(email, password);
			break;
		case 3:
			department.setDeptName("HR");
			email=credentialService.generateEmail(employee, department);
			password=credentialService.generatePassword();
			credentialService.showCredentials(email, password);
			break;
		case 4:
			department.setDeptName("Admin");
			email=credentialService.generateEmail(employee, department);
			password=credentialService.generatePassword();
			credentialService.showCredentials(email, password);
			break;
		default:
			System.out.print("error");
			
		}

	}
	
}
