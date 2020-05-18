import java.util.*;
class InputMoney{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input a Salary :");
		int salary = input.nextInt();
		System.out.println("Salary : " + salary);
		
		int r5000, r2000, r1000, r500, r100, r50, r20, r10, r5, r2, r1;
		r5000 = salary/5000;
		salary = salary%5000;
		
		r2000 = salary/2000;
		salary = salary%2000;
		
		r1000 = salary/1000;
		salary = salary%1000;
		
		r500 = salary/500;
		salary = salary%500;
		
		r100 = salary/100;
		salary = salary%100;
		
		r50 = salary/50;
		salary = salary%50;
		
		r20 = salary/20;
		salary = salary%20;
		
		r10 = salary/10;
		salary = salary%10;
		
		r5 = salary/5;
		salary = salary%5;
		
		r2 = salary/2;
		salary = salary%2;
		
		r1 = salary/1;
		salary = salary%1;
		
		System.out.println("Rs 5000 : " + r5000);
		System.out.println("Rs 2000 : " + r2000);
		System.out.println("Rs 1000 : " + r1000);
		System.out.println("Rs 500 : " + r500);
		System.out.println("Rs 100 : " + r100);
		System.out.println("Rs 50 : " + r50);
		System.out.println("Rs 20 : " + r20);
		System.out.println("Rs 10 : " + r10);
		System.out.println("Rs 5 : " + r5);
		System.out.println("Rs 2 : " + r2);
		System.out.println("Rs 1 : " + r1);
		
	}
}
