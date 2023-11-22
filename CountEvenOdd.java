import java.util.Scanner;
class CountEvenOdd{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int CountEven=0;
int CountOdd=0;
System.out.println("Enter 10 numbers:");
for(int i=1;i<=10;i++){
int value=s.nextInt();
if(value%2==0){
CountEven++;
}
else if(value%2!=0){
CountOdd++;
}
else{
//its not even not odd it will be zero

}
}
System.out.println("Even numbers: " +CountEven);
System.out.println("Odd numbers: " +CountOdd);

























}


}