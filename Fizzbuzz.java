class Fizzbuzz {
  // I am on the testing branch
    // If x is divisible by 3, print "fizz"
    // If x is divisible by 5, print "buzz"
    // If it's divisible by both, print "fizzBuzz"
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {

          if(isXMultipleOfY(i, 3) && isXMultipleOfY(i, 5))
          {
            // Prints fizzbuzz
            System.out.println("FizzBuzz");
          }

          else if(isXMultipleOfY(i, 5))
          {
            // Prints buzz
            System.out.println("Buzz");
          }

          else if(isXMultipleOfY(i, 3))
          {
                // Prints Fizz
            System.out.println("Fizz");
          }

          else
          {
            // prints i
            System.out.println(i);
          }
        }
    }

    public static boolean isXMultipleOfY(int x, int y) {
          if (x % y == 0){
              return true;
          }
        return false;
    }

    public static void main(String[] args) {
        fizzBuzz(20);
    }
}
