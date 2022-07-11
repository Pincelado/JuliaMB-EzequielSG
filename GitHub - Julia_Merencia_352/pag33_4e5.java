
import java.util.Scanner; 
public class pag33_4e5 {
    public static void main(String[] args) {
     float hora, horat, sal; 
    Scanner entrada = new Scanner(System.in); 

     System.out.print("Digite o valor de horas de trabalho: ");
     hora = entrada.nextFloat();
     System.out.print("Digite as horas trabalhadas: ");
     horat = entrada.nextFloat();
     sal = (horat * hora); 
        
        if (sal < 50){ 
            System.out.println("Seu salário vai ser infeiror a R$ 50,00");
            System.out.println("Atenção  dirija-se em direção ao Hotel!");
        }else{
        System.out.println("Seu salário é: " + sal); 
        }
        entrada.close();
}}  