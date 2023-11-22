import java.util.Scanner;
class av{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
 System.out.println("enter first number:");
 double a=s.nextDouble();
 System.out.println("enter an operator:+,-,/,%,*");
char op=s.next().charAt(0);
System.out.println("Enter 2nd number");
double b=s.nextDouble();
switch(op){
case '+':
System.out.println("ADDITION:" +(a+b));
break;
case '-':
System.out.println("SUBSTRACTION:" +(a-b));
break;
case '/':
{
if(b!=0){
System.out.println("DIVISION:" +(a/b));
}
else
{
System.out.println("can't divided by 0");
}
break;

}
case '%':
System.out.println("Modulus:" +(a%b));
break;

case '*':
System.out.println("Multiplication:" +(a*b));
break;






}




}


}