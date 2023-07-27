package trabalhando.arrays;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TrabalhandoArrays {

    //utilizando o array list, pegar quantos inteiros que o usuario quiser digitar
    //ou final indique qual é o menor, qual é o maior numero e qual a média dos inteiros
    
    
    public static void main(String[] args) {
      
        // para o array (10, -7, 18, 34
        
        
        }
    
    public static void minMaxMedia(){
        ArrayList<Integer> numbers = new ArrayList<>();
        
        String resp = "";
        
        while(!resp.equals("x")){
            resp = JOptionPane.showInputDialog("Digite um número ou x para sair:");
            if(!resp.equals("x")){
            numbers.add(Integer.valueOf(resp));
            }
        }
        //System.out.println(numbers);
        
        Integer menor = numbers.get(0);
        Integer maior = numbers.get(0);
        Integer soma = numbers.get(0);
        
        for (int i = 1; i < numbers.size(); i++){
           if (numbers.get(i) < menor){
               menor = numbers.get(i);
               
           if (numbers.get(i) > maior){
               maior = numbers.get(i);             
           }
            soma+= numbers.get(i);
        
        }
        
        Double media = (double) soma / numbers.size();
        JOptionPane.showInputDialog (null, " o menor numero foi " + menor 
                + "\n O Maior numero foi " + maior
                + "\n A média foi " + media);
        
        
     }  
  }






    public static void media(){
        Double[] notas = new Double[3];
    
       for (int i = 0; i <= 3; i++ ){
           notas[i] = Double.valueOf(JOptionPane.showInputDialog("Digite a " +(i+1)+"º notas: "));
       }
       
       double media = (notas[0]+ notas[1]+notas[2])/3;
       JOptionPane.showMessageDialog(null,"A media media do aluno foi de "+media+".");
    }
    
    public static void pedirVariasNotas(){
        Double[] notas = new Double[1];
        String resp = "";
        
        int contador =0;
        while (!resp.equals("-1")){
            resp = (JOptionPane.showInputDialog("Digite a nota ou -1 oara encerrar:"));
            if (!resp.equals("-1")){
                if(notas.length == contador){
                    Double[] newNotas = new Double[contador+1];
                    for (int i = 0; i < notas.length; i++){
                        newNotas[i] = notas[i];
                    }
                    notas = newNotas;
                }
            }
            notas[contador] = Double.valueOf(resp);
                contador++;
        }
        
    }

    









}






    