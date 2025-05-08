import org.lessons.java.shop.Prodotto;

public class Main {
    public static void main(String[] args) {

        
        Prodotto gioco = new Prodotto("FC24", "EA", 79.9f, 22);
        System.out.println("Codice: " + gioco.getCodice());
        System.out.println("Nome Gioco: " + gioco.getNome());
        System.out.println("Marca: " + gioco.getMarca());
        System.out.println("Prezzo: " + gioco.getPrezzo() + "$");
        System.out.println("Prezzo con IVA: " + gioco.getPrezzoIva() + "$");

        System.out.println(gioco.getNomeCodice());
        

    }
        

    }

