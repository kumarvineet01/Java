import java.util.*;
//import java.Scanner;

class twoDArray {
public static void main(String args[]) {
int [][] arr = new int[4][5];
int i, j, k=0;
//Scanner sc = new Scanner(System.in);
for(i=0; i<4; i++)
for(j=0; j<i+1; j++){

arr[i][j] = k;
k++;
}

for(i=0; i<4; i++) {
System.out.println();
for(j=0; j<i+1; j++) {
System.out.print(arr[i][j] + " ");
}
}

}
}