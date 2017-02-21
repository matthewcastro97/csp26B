import java.util.Scanner;
import java.io.*;

public class lab4
{
public static void main(String[] args) throws IOException

{ 

double sum = 0.0;
double lines = 0.0;

Scanner keyboard = new Scanner(System.in);

File file = new File("C:\\Users\\S237-Student\\Downloads\\ListOfNumbers.txt");

Scanner inputFile = new Scanner(file);

while (inputFile.hasNext())
{
String str = inputFile.nextLine();
System.out.println(str);
lines = lines++;

double number = inputFile.nextDouble();
sum = sum + number;

}


inputFile.close();

System.out.println("2. The sum of the numbers in " + 
                     "ListOfNumbers.txt is " + sum);
                    
FileWriter fw1 =
         new FileWriter("ListOfNumbers.txt", true);
         
PrintWriter fw = new PrintWriter(new FileWriter("C:\\Users\\S237-Student\\Downloads\\ListOfNumbers.txt", true));
                     
}
}
