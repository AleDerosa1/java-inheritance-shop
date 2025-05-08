import org.lessons.java.shop.Prodotto;
import org.lessons.java.shop.Smartphone;

public class Main {
    public static void main(String[] args) {

        Smartphone Iphone = new Smartphone("Iphone", "Apple", 1200, 22, 3784600, 128);

        System.out.println(Iphone.getNome());




        Prodotto gioco = new Prodotto("FC24", "EA", 79.9f, 22);
        System.out.println("Codice: " + gioco.getCodice());
        System.out.println("Nome Gioco: " + gioco.getNome());
        System.out.println("Marca: " + gioco.getMarca());
        System.out.println("Prezzo: " + gioco.getPrezzo() + "$");
        System.out.println("Prezzo con IVA: " + gioco.getPrezzoIva() + "$");
        System.out.println(gioco.getNomeCodice());

    }

}
