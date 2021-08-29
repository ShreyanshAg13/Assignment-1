package service;

import java.util.Random;

import model.Department;
import model.Employee;

public class CredentialService {
	public String generateEmail(Employee employee,Department department) {
		String email= employee.getFirstname().toLowerCase()+employee.getLastname().toLowerCase()+"@"+department.getDeptName()+".company.com";
		return email;
	}
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random objRandom= new Random();
		char password[]=new char[8];
		for(int i=0;i<7;i++) {
		password[i] = values.charAt(objRandom.nextInt(values.length()));
		}
		return password.toString();
	}
	
	public void showCredentials(String email,String password) {
		
		System.out.print(email+""+password);
	}
}
