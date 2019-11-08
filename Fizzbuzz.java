class Fizzbuzz {
  // I am on the testing branch
    // If x is multiple of 3, print "Fizz"
    // If x is multiple of 5, print "Buzz"
    // If it's multiple of both, print "FizzBuzz"
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
		
		if ((i % 3 == 0) && (i % 5 == 0)) {
    		System.out.println("FizzBuzz"); //Prints FizzBuzz if the number is both a multiple of 3 & 5
    	}
    	else if((i % 3) == 0) {
    		System.out.println("Fizz"); //Prints Fizz if the number is a multiple of 3
    	}
    	else if((i % 5) == 0) {
    		System.out.println("Buzz"); //Prints Buzz if the number is a multiple of 5
    	}
    	else {
    		System.out.println(i);
    	}
          
      }
    }

    public static void main(String[] args) {
        fizzBuzz(20); //methodCall
    }
}
