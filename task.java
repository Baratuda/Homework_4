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
    static Deque<Character> dequeCreator(String number){
       Deque<Character> deque = new ArrayDeque<>();
       char[] numbersChars = number.toCharArray();
       for(char i: numbersChars) deque.addFirst(i);
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
      Deque<Character> firstNumberDeque = dequeCreator(first_number);
      Deque<Character> secondNumberDeque = dequeCreator(second_number);
      int firstNumber = parseToInt(firstNumberDeque); 
      int secondNumber = parseToInt(secondNumberDeque);
      System.out.printf("Sum of first number %d and second number %d is %d. \n", firstNumber,secondNumber,firstNumber+secondNumber);
      System.out.printf("Сomposition of first number %d and second number %d is %d. ", firstNumber,secondNumber,firstNumber*secondNumber);
   }
}