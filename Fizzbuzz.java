class Fizzbuzz {
    // I am on the testing branch - jesse

    // Method to check values at index for divisibility
    public static void fizzBuzz(int n){

      for (int i = 1; i <= n; i++) {

        // If it's divisible by both, print "FizzBuzz"
        if ((multXY(i, 3) == true) && (multXY(i, 5) == true)){
          // Prints FizzBuzz
          System.out.println("FizzBuzz");
        }

        // If x is divisible by 3, print "Buzz"
        else if (multXY(i, 5) == true){
          // Prints Buzz
          System.out.println("Buzz");
        }

        // If x is divisible by 2, print "Fizz"
        else if (multXY(i, 3)== true){
          //Prints Fizz
          System.out.println("Fizz"); 
        }

        // If neither, print index value
        else{
          // prints i
          System.out.println(i);
        }
      }
    }

    // Method to check divisibility 
    public static boolean multXY(int x, int y) {
        for (int i = 0; i <= x; i += y)
          if (i == x)
              return true;
        return false;
    }

    // Calls Fizzbuzz using given total index
    public static void main(String[] args) {
        fizzBuzz(69);
    }
}
