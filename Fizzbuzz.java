class Fizzbuzz {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0 || i%5 == 0){
                if (i%3 == 0)
                  System.out.print("Fizz");
                if (i%5 == 0)
                  System.out.print("Buzz");
                System.out.println();
            }
            else
              System.out.println(i);
        }
    }

    public static void main(String[] args) {
        fizzBuzz(30);
    }
}
