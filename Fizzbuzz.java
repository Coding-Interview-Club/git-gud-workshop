class Fizzbuzz {
  // I am on the testing branch
    // If x is divisible by 2, print "fizz"
    // If x is divisible by 3, print "buzz"
    // If it's divisible by both, print x
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {

          if (isXMultipleOfY(i, 3) == true)
          {
            // Prints fizz
            System.out.print("Fizz");
          }

              if(isXMultipleOfY(i, 5) == true){
                // Prints buzz
                System.out.print("Buzz");
              }

          if ((isXMultipleOfY(i, 3) == true) && (isXMultipleOfY(i, 5) == true)) {
            System.out.println(i); // prints i
          }
          System.out.println();
        }
    }

    public static boolean isXMultipleOfY(int x, int y) {
        for (int i = 0; i <= x; i += y)
          if (i == x)
              return true;
        return false;
    }

    public static void main(String[] args) {
        fizzBuzz(20);
    }
}
