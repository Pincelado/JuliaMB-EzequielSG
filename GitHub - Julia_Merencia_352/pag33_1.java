public class pag33_1 {
    public static void main(String[] args){
    Integer Impartotal = 0;
    Integer num;
    long Partotal = 1; 
   
        
    for(num = 0; num <= 30; num++) { 
        if((num % 2 == 1)){ 
        Impartotal += num;}
        else{
        Partotal *= num;
    }
    }        
        System.out.println("Multiplicação: " + Partotal);       System.out.println("Soma dos ímpares: " + Impartotal);       
    }
  }