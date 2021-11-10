import java.util.*;
//import java.util.Scanner;

class arrScanner {
public static void main(String args[]) {
int [][]arr = new int[4][5];
int i, j;
System.out.println("Enter the elements of the array: ");


Scanner sc = new Scanner(System.in);
for(i=0; i<4; i++){
for(j=0; j<i+1; j++){

arr[i][j] = sc.nextInt();
}
}
for(i=0; i<4; i++) {

for(j=0; j<i+1; j++) {
System.out.print(arr[i][j] + " ");
}
System.out.println();
}

}
}