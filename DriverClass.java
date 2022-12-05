package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {
	
	public static void main(String[]args) {
		
		
		Employee employee = new Employee("Harshit", "Choudhary");
		
		ICredentials cs = new CredentialService(); 
		
		System.out.println(" Please enter the department from the following :  ");
		System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal ");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		String generatedEmail = null;
		String generatedPassword = null;
		
		
	
		switch (option) {
		
		case 1: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.geLastName().toLowerCase(), "tech");
			generatedPassword = cs.generatePassword();
			break;
		}
		
		case 2: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.geLastName().toLowerCase(), "adm");
			generatedPassword = cs.generatePassword();
			break;
		}
		
		case 3: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.geLastName().toLowerCase(), "hr");
			generatedPassword = cs.generatePassword();
			break;
		}
		
		case 4: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.geLastName().toLowerCase(), "lg");
			generatedPassword = cs.generatePassword();
			break;
		}
		default: {
			System.out.println(" Enter a valid option : ");
		}
		
		}
		
		employee.setEmail(generatedEmail);
		employee.setPassword(generatedPassword);
		cs.showCredentials(employee);
		sc.close();
		
	}
	
}
		
		

		
	

