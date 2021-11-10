//Student Details

import java.util.*;
class Student {
public static void main(String[] args) {
 String name;
 String usn;
 int[] credits= new int[10];
 int[] marks = new int[50];
 int i, n;


void input()
{	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Name of the Student: ");
	name = sc.nextLine();
	System.out.println("Enter the USN of the Student: ");
	usn = sc.nextLine();
	System.out.println("Enter number of Subjects: ");
	n = sc.nextInt();
	//Inserting credits in the Array 
	System.out.println("Enter the Credits of the Student: ");
	for(i=0; i<n; i++) {
		credits[i] = sc.nextInt(); 
	}
	//Inserting Marks in the Array
	System.out.println("Enter the Marks obtained in Subjects: ");
	for(i=0; i<n; i++) {
		marks[i] = sc.nextInt();
	}
}

/*void sgpa() 
{
	int marks[];
	int[] gradePoint = marks[i] / 10;
	float[] Sgpa = (gradePoint[i]*credits[i]) / totalCredit;
	total
*/

void display()
{
	System.out.println("Displaying the Student Details: ");
	System.out.println("NAME: " + name);
	System.out.println("USN: " + usn);
	for(i=0; i<n; i++)
	{
		System.out.println("CREDITS: " + credits[i]);
		System.out.println("CREDITS: " + marks[i]);
	}
}

}
}	


