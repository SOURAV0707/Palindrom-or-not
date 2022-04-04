import java.util.*;
class Pali
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the number:");
String reverse="";
String num=obj.nextLine();
int length=num.length();
for(int i=length-1;i>=0;i--)
reverse=reverse+num.charAt(i);
if(num.equals(reverse))
System.out.println("palindrom");
else
System.out.println("not");
}
}