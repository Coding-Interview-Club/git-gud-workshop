class Fizzbuzz {
    // If x is divisible by 2, print "fizz"
    // If x is divisible by 3, print "buzz"
    // If it's divisible by both, print fizzbuzz
    public void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) {
              System.out.println("Fizz");
            }

            if (i % 5 == 0) {
              System.out.println("Buzz");
            }

            if ((i % 3 != 0) && (i % 5 !=)) {
              System.out.println(i);
            }
        }
    }
}
