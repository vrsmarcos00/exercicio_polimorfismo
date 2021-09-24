package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int N = sc.nextInt();
		
		System.out.println();
		
		for(int i=0; i<N; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced (y/n) ?: " );
			char outsourced = sc.next().charAt(0);
			
			if(outsourced == 'n') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.println();
				
				Employee employee = new Employee(name, hours, valuePerHour);
				list.add(employee);
			}
			
			if(outsourced == 'y') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				System.out.println();
				
				Employee outsource = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(outsource);
			}
		}
		
		System.out.println("PAYMENTS: ");
		for(Employee e : list) {
			System.out.println(e);
		}
		
		sc.close();

	}

}
