import java.util.Scanner;
public class pag33_3{

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Integer n1;

    System.out.print("Digite um número: ");
    n1 = entrada.nextInt();
    
    if (n1 % 2 == 0){
     System.out.println("Esse número é par");

    }else{
     System.out.println("É ímpar");

    }
}

}
