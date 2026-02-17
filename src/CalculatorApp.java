import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class CalculatorApp {
    public static void main(String[] args){
        double valueOne, valueTwo;
        String operation = "";
        boolean continuacao;

        Scanner scan = new Scanner(System.in);



        do {

            valueOne = lerDouble(scan);
            valueTwo = lerDouble(scan);

            while(!operation.equals("+") && !operation.equals("-") &&
                    !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Insira a operação (+ - * /): ");
                operation = scan.nextLine();
            }



            calculo(valueOne, valueTwo, operation);
            continuacao = verificarNovaOperacao(scan);
        }while(!continuacao);

        scan.close();
    }

    public static void calculo(double valueOne, double valueTwo, String operation){

        switch (operation){
            case "+" ->
                System.out.println("Resultado: " + (valueOne + valueTwo));
            case "-" ->
                    System.out.println("Resultado: " + (valueOne - valueTwo));
            case "*" ->
                    System.out.println("Resultado: " + (valueOne * valueTwo));
            case "/" -> {
                if (valueTwo == 0) {
                    System.out.println("Não é possivel dividir por Zero!");
                } else {
                    System.out.println("Resultado: " + (valueOne / valueTwo));
                }
            }
            default ->
                    System.out.println("Insira uma operação válida!");
        }
    }

    public static boolean verificarNovaOperacao(Scanner sc){

        System.out.println("Deseja realizar outra operação? S / N");
        return sc.nextLine().toUpperCase(Locale.ROOT).equals("S");
    }

    public static double lerDouble(Scanner sc){
        while(true) {
            try {
                System.out.println("Insira um número: ");
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido!");
                sc.nextLine();
            }
        }
    }
}
