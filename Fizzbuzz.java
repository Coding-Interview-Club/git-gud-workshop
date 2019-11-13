class Fizzbuzz {
       // I am on the testing branch - jesse

    
    public static void fizzBuzz(int n){
      // Iterate through all values up to highest number given
      for (int i = 1; i <= n; i++) {

        // If it's divisible by both 3 and 5, print "FizzBuzz"
        if(i % 3 == 0 && i % 5 == 0){
          System.out.println("FizzBuzz");
        }
        // If divisible by 3, print "Fizz"
        else if(i % 3 == 0){
          System.out.println("Fizz");
        }
        // If divisible by 5, print "Buzz"
        else if(i % 5 == 0){
          System.out.println("Buzz");
        }
        // All other cases, print i
        else{
          System.out.println(i);
        }
      }
    }
    // Calls Fizzbuzz using given total index
    public static void main(String[] args) {
        fizzBuzz(69);
    }

}
