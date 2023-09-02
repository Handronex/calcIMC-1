/**
 * IMC
 */
import java.util.Scanner;
import java.lang.Math;

public class calcIMC {

    public static void main(String[] args) {
     
        double altura = 0, peso = 0, imc = 0;
        String descIMC = "";

        Scanner leia = new Scanner(System.in);

        System.out.println("");

        System.out.println("=========== CALCULADORA DE IMC ===========");

        System.out.print("Informe sua Altura: ");
        altura = leia.nextDouble();

        System.out.print("Informe seu Peso: ");
        peso = leia.nextDouble();

        imc = peso / (Math.pow(altura,2));

        if (imc < 18.5) {
            
            descIMC = "Magreza";

        } else if (imc >= 18.5 && imc < 25) {
             
            descIMC = "Normal";        
        
        } else if (imc >= 25 && imc < 30) {
                
            descIMC = "Sobrepeso";

        } else if (imc >= 30 && imc < 35) {
                
            descIMC = "Obesidade Grau I";
                    
        } else if (imc >= 35 && imc < 40){

            descIMC = "Obesidade Grau II";
                    
        } else if (imc > 40){

            descIMC = "Obesidade Grau III";

        }
            
        System.out.println("------------------------------------------");

        System.out.println("Seu IMC: " + String.format("%.2f", imc));
    
        System.out.println("Classificação do IMC: " + descIMC);

        System.out.println("==========================================");

        System.out.println("");

        leia.close();
    }
}