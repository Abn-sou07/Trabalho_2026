//calculando o fatorial de 1 a 10
public class Questao04Exercicio01 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) { // j = i;
           long fatorial = 1;
           for (int j = 1; j <= i; j++) {
               fatorial *= j;
           }
            System.out.println("Fatorial de " + i + " é: " + fatorial);
        }
        }
    }

