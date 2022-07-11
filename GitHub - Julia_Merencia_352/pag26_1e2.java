import java.util.Scanner;

public class pag26_1e2 {
    public static void main(String[] agrs) {
        Scanner entrada1 = new Scanner(System.in); // novo scanner
        Float h, B, b, a; // declaração das variáveis!!! var
        System.out.println("Altura do trapézio: ");
        h = entrada1.nextFloat(); // h= o que o usuário digitar.
        System.out.println("Base menor do trapézio: ");
        b = entrada1.nextFloat();
        System.out.println("Base maior do trapézio: ");
        B = entrada1.nextFloat();
        a = (h * (b + B)) / 2;
        System.out.println("A área do trapézio é: " + a);
        entrada1.close();
        // exercicio 2 (usar numeros inteiros) arredondar para inteiro! >
        System.out.println("Valor da área arredondado: " + Math.round(a));
    }
}