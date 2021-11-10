import java.util.Scanner;

class evenOrOdd {
public static void main(String args[]) {
int x;
System.out.print("Enter an Integer: ");
Scanner in = new Scanner(System.in);
x=in.nextInt();

if(x%2==0) {
System.out.println("The number entered is EVEN.");
}
else {
System.out.println("The number entered is ODD.");
}

}
}