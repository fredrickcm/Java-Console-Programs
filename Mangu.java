import java.util.Scanner;
class Mangu
{ private String adm_no, name; private double marks;
public void check()
{ if(marks >= 50)
System.out.println("This Student has passed."); else
System.out.println("This student has failed.");
}
public void dataout()

{
System.out.println("Adm No :> " + adm_no);
System.out.println("Name   :> " + name);
System.out.println("Marks  :> " + marks);
}
public void set(String adm,String the_name,double mks)
{ adm_no = adm; name = the_name; marks = mks; }
public void datain()
{
Scanner myScanner = new Scanner(System.in);
System.out.print("Enter the student's admission number: ");
adm_no = myScanner.nextLine(); System.out.print("Enter his/her name: "); name = myScanner.nextLine();
System.out.print("Enter the marks he/she scored: ");
marks = myScanner.nextDouble();
}
}
