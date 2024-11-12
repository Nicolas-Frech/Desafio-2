import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int informedNumber = input.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        List<Integer> fibonacci = new ArrayList();

        fibonacci.add(firstNumber);
        fibonacci.add(secondNumber);

        for(int i = 1; i <= informedNumber; i++) {
            int addedNumber = fibonacci.get(i) + fibonacci.get(i - 1);
            fibonacci.add(addedNumber);
        }

        if(fibonacci.contains(informedNumber)) {
            System.out.println("Esse número faz parte da sequência de fibonacci!");
        } else {
            System.out.println("Esse número não faz parte da sequência de fibonacci!");
        }
    }
}