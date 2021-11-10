//Printing prime numbers between two integers

import java.util.*;
import java.util.Scanner;

class prime {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

int n, m, i=2;
System.out.println("Enter the range of the numbers (m & n): ");
System.out.println("Enter the value of m: ");
m = sc.nextInt();
System.out.println("Enter the value of n: ");
n = sc.nextInt();
 
while(i<n) {
boolean flag = false;

for(i=2; i<=n/2; ++i) {
if( m%i == 0) {
flag = true;
break;
}
}

if(!flag && m !=1)
System.out.println(m + " ");
++m;
}
}
}