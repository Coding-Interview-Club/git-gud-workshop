public class FizzBuzz1{
    public static void fizzBuzz(int n){
        for(int i = 1; i <= n ; i++){
            //If the number is a multiple of 3 and 5 prints "FizzBuzz"
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            //If the number is a multiple of 3 prints "Fizz"     
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            //If the number is a multiple 5 prints "Buzz"
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            //If the number is not a multiple of 3 or 5 orints the number
            }else{
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        fizzBuzz(20);
    }
}