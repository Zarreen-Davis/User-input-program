import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner kybrd = new Scanner(System.in); 
    System.out.println("Enter a word: ");
    String inputOne = kybrd.nextLine (); 
    System.out.println("Enter a word: ");
    String inputTwo = kybrd.nextLine (); 
    System.out.println(inputOne + " " + inputTwo);
  }
}