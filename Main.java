import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try{
      File theFile = new File("numbers.txt");
      Scanner fileScanner = new Scanner(theFile);
      while(fileScanner.hasNextLine()){
        int x = fileScanner.nextInt();
        fileScanner.nextLine();
        System.out.println(x);
      }
      System.out.println("running");
    }catch(Exception e){}
  }
}