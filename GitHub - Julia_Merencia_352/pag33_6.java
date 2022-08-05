import java.util.Scanner;
import java.text.DecimalFormat;

public class pag33_6{ 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float peso, conv;
        String medida;
     DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.print("Digite um peso: ");
        peso = entrada.nextFloat();
        System.out.print("Digite a medida do peso, Lb para Libras e Kg para Quilos: ");
        medida = entrada.next();
        if(medida.equalsIgnoreCase("kg")){
         conv = (peso * 2.205f);
        System.out.println("Sua conversão de " + peso+" Kg deu: "+ df.format(conv) +" Libras");
    }else{
    	conv = (peso / 2.205f);
        System.out.printf("Sua conversão de " + peso+" Lb deu: "+ df.format(conv)+" Quilos");
}
}
}