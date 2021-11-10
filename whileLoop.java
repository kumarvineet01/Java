import java.util.Scanner;

class whileLoop {
public static void main(String args[]) {
int n;
Scanner in = new Scanner(System.in);
System.out.println("Enter an integer: ");
n=in.nextInt();

while(n!=0) {
System.out.println("You entered " + n);
System.out.println("Input an integer: ");
n=in.nextInt();

}
System.out.println("Out of the loop.");
}
}