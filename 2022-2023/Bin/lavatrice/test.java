package lavatrice;
import lavatrice.Lavatrice;
import java.util.*;
/**
 * Aggiungi qui una descrizione della classe test
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class test
{
   
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Lavatrice l1= new Lavatrice ();
        Lavatrice l2= new Lavatrice ("Marca","Modello",100.02);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        l1.setMarca("banana");
        System.out.println("la marca è stata settata a "+l1.getMarca());
        l1.setModello("siumm-z5");
        System.out.println("il modello è stato settato a "+l1.getModello());
        l1.setPrezzo(553);
        System.out.println("il prezzo è stato settato a "+l1.getPrezzo());
        l1.setProgramma(4);
        System.out.println("il Programma è stato settato a "+l1.getProgramma());
        l1.setTemperatura(34);
        System.out.println("la temparatura è stata settata a "+l1.getTemperatura());
        l1.setGiriCentrifuga(6);
        System.out.println("i Giri della Centrifuga sono stati settati a "+l1.getGiriCentrifuga());
        l1.setKg(4);
        System.out.println("i kg sono stati settati a "+l1.getKg());
        l1.setAcceso(true);
        if (l1.getAcceso()==true){
            System.out.println("la lavatrice è accesa");
        }else{
            System.out.println("la lavatrice è spenta");
        }
        l1.setTempo(9);
        System.out.println("il tempo è stato settato a "+l1.getTempo());
        System.out.println(l1.toString());
        
        Lavatrice l3=new Lavatrice(l1);
        System.out.println(l3.toString());
    }
}
