//To find greater number
import java.util.scanner;
public class  Greater{
publi static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter first number");
int first=sc.nextInt();
System.out.println("Enter second number");
int second=sc.nextInt();
if(first>second){
System.out.println(first+"is greater");
}
else{
System.out.println(second+"is greater");
}
}
