import java.util.Scanner;
class code3
{
public static void main(String[ ] args)
{
Scanner s=new Scanner(System.in);
String str1=s.next();
String str2=s.next();
if(Integer.parseInt(str1)>Integer.parseInt(str2))
{
System.out.println(str1+" "+"has bigger length.");
}
else
{
System.out.println(str2+" "+"has bigger length.");
}
}
}
