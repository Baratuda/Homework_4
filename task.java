import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayDeque;
public class task{
    static String input_method(Scanner sc, String message){
       System.out.println(message);
       return sc.nextLine();
    }
    static Deque<Character> dequeCreator(String number, boolean isReverse){
       Deque<Character> deque = new ArrayDeque<>();
       char[] numbersChars = number.toCharArray();
       for(char i: numbersChars){
         if(isReverse) deque.addFirst(i);
         else deque.addLast(i);
       } 
       return deque;
    }
    static int parseToInt(Deque<Character> charDeque){
      String number = "";
      for(int i = charDeque.size();i>0;i--) number+=charDeque.pollLast();
      return Integer.parseInt(number);
    }
    
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String first_number = input_method(sc, "Please input first number: ");
      String second_number = input_method(sc, "Please input second number: ");  
      Deque<Character> firstNumberDeque = dequeCreator(first_number,true);
      Deque<Character> secondNumberDeque = dequeCreator(second_number,true);
      int firstNumber = parseToInt(firstNumberDeque); 
      int secondNumber = parseToInt(secondNumberDeque);
      Integer sumResult = firstNumber+secondNumber;
      Integer compositionResult = firstNumber*secondNumber;
      System.out.println("Sum of first number  and second number is ");
      System.out.println(dequeCreator(sumResult.toString(),false));
      System.out.printf("Сomposition of first number  and second number  is  ");
      System.out.println(dequeCreator(compositionResult.toString(),false));
   }
}