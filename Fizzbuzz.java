import java.util.Scanner;

class Fizzbuzz{
  public static void fizzBuzz(int n) {
    for (int i = 1; i <= n; i++) {

      if(((i % 3) == 0) && ((i % 5) == 0)){
        System.out.println("FizzBuzz");
      }else if((i % 5) == 0){
        System.out.println("Buzz");
      }else if((i % 3)== 0){
        System.out.println("Fizz");
      }else{
        System.out.println(i);
      }
    }
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Hello!");
    System.out.println("Up to which number you want to play?");
    int n = scan.nextInt();
    fizzBuzz(n);
  }
}
