import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int total = 0;
    int counter = 0;
    try{
    
      File theFile = new File("numbers.txt");
      Scanner fileScanner = new Scanner(theFile);
      while(fileScanner.hasNextLine()){
        int x = fileScanner.nextInt();
        total += x;
        counter++;
        fileScanner.nextLine();
        System.out.println(x);
      }
      System.out.println("running");
    }catch(Exception e){}
    int average = total/counter;
    System.out.println(average + " average");
  }
}