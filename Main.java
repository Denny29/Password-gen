import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int cont = 1;
    System.out.println("Password generator");
    while(cont == 1){
      System.out.println("How many characters do you want in the password?");
      int len = scan.nextInt();
      System.out.println("Generating now...");

      String[] letterBank = {"a" , "b" , "c" , "d" , "e", "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n", "o", "p", "q", "r", "s" , "t" , "u" , "v" , "w", "x", "y", "z"};

      String[] specialChar = {"!", "@" , "#", "$" , "%", "^", "&", "*", "_"};

      String password = "";

      for(int i = 0; i < len; i++){
        // 30% chance for a special character or number to be chosen
        if((double) Math.random() <= 0.3){
          //60% chance for number
          if(Math.random() <= 0.6){
            password += (int) (Math.random() * 9);
          }
          else{
            // Special character chosen
            password += specialChar[(int) (Math.random() * 9)];}
        }
        else{
          //70% chance for normal character to be chosen
          //50% chance for the normal character to be uppercase
          if((double) Math.random() <= 0.5)
            password += letterBank[(int)(Math.random() * 26)];
          else{
            password += letterBank[(int)(Math.random() * 25)].toUpperCase();
          }
        }
      }

      System.out.println("Your password is: " + password);
      System.out.println("Would you like another password?(1 for yes, 0 for no)");

      cont = scan.nextInt();
    }
    
  }
}