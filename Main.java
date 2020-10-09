import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);
    //create an array for the first list of numbers
    int [] list = new int[5];
    //create an array for the second list of numbers
    int [] list2 = new int[5];
    //ask user for first list values
    System.out.println("Please enter the values for the first array:");
    //put integers that are in array into a for loop
    for(int i = 0; i < 5; i++){
      list[i] = input.nextInt();
    }
    //ask user for second list values
    System.out.println("Please enter the values for the second array:");
    //put integers that are in array into a for loop
    for(int i = 0; i < 5; i++){
      list2[i] = input.nextInt();
    }
      //create a variable for total
      int total = 0;
      //create for loop for if the arrays are the same
      for(int i = 0; i < list.length; i++){
        //create a variable for the sum
        int sum = list2[i] - list[i];
        total = sum + total;
      
      
    }
    //if statement if the total is equal to 0 or not.
      if(total != 0){
      System.out.println("These arrays are not the same");
    }else if (total == 0){
      System.out.println("These arrays are the same");
    }
    
    
  }
}
