
class Fizzbuzz {
    // If x is divisible by 3, print "Fizz"
    // If x is divisible by 5, print "Buzz"
    // If it's divisible by both, print "FizzBuzz"
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
          if(i%3 == 0 && i%5 == 0)       
            System.out.println("FizzBuzz"); // Prints FizzBuzz
          else if(i%5 == 0)                
            System.out.println("Buzz"); // Prints Buzz
          else if(i%3 == 0)
            System.out.println("Fizz"); // Prints Fizz
          else
            System.out.println(i); // Prints the current number
        }
    }
    public static void main(String[] args) {
        fizzBuzz(1000);
    }
}