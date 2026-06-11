public class AumentaFrase {
  

    public static void main(String[] args) {
        String novaFrase = null;
        String frase = null;
        try{
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("A frase é nula. Por favor, inicialize a frase antes de usar.");
        }
        
        System.out.println(novaFrase);
        System.out.println(frase);
    }

}
