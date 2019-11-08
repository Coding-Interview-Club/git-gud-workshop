class Fizzbuzz {
    // I am on the testing branch
    // If x is divisible by 2, print "fizz"
    public static void fizzBuzz(int n){
        for (int i = 1; i <= n; i++) {
            // If it's divisible by both, print FizzBuzz
          if((isXMultipleOfY(i, 3)) && (isXMultipleOfY(i, 5)))
          {
            // Prints fizz
            System.out.println("FizzBuzz");
          }
          // If x is divisible by 5, print "Buzz"
          else if(isXMultipleOfY(i, 5)){
                // Prints buzz
                System.out.println("Buzz");
              }
          // If x is divisible by 3, print "Fuzz"
          else if(isXMultipleOfY(i, 3)){
            System.out.println("Fizz"); // prints i
          }
          else{
            System.out.println(i);
          }
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
