import java.util.Scanner;
class input {
public static void main(String args[]) 
{
int a;
float b;
String c;

Scanner in = new Scanner(System.in);

System.out.println("Enter an Integer: ");
a=in.nextInt();
System.out.println("Integer: " + a);

System.out.println("Enter a float number: ");
b=in.nextFloat();
System.out.println("Float Number: " + b);

System.out.println("Enter a string: ");
c=in.next();
System.out.println("String: " + c);
}
}