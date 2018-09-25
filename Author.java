import java.lang.*;
import java.util.*;
 class Author
{
String firstName;
String lastName;
public Author(String firstName, String lastName)
{
this.firstName=firstName;
this.lastName=lastName;
System.out.println("firstName:"+this.firstName+"    lastName:"+this.lastName);
}
public void setFirstName(String firstName)
{
this.firstName=firstName;
}
public void setLastName(String lastName)
{
this.lastName=lastName;
}
public String getFirstName()
{
String a=this.firstName;
return a;
}
public String getLastName()
{
String b=this.lastName;
return b;
}
public String toString()
{
return "firstName:"+getFirstName()+"    LastName:"+getLastName();
}
}
public class Name
{
public static void main(String args[])
{
  Author m= new Author("JITHENDER","REDDY");
  Scanner s=new Scanner(System.in);
  System.out.println("enter first name");
  String fn=s.nextLine();
  System.out.println("enter Last name");
  String ln=s.nextLine();
  m.setFirstName(fn);
  m.setLastName(ln);
  System.out.println(m.toStr