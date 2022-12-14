package televisore;
import java.util.*;
import televisore.Televisore;
/**
 * Aggiungi qui una descrizione della classe Televisore2
 * 
 * @author (Pietro Comparotto) 
 * @version (1)
 */
public class Test
{
    public static void main(String[]args){
        boolean acc;
        int vol;
        int pol;
        int can;
        int lum;
        String col;
        String sch;
        Televisore t1 =new Televisore();
        Scanner in = new Scanner(System.in);
        System.out.println("dimmi il colore: ");
        col = in.nextLine();
        System.out.println("dimmi il tipo di schermo: ");
        sch = in.nextLine();
        System.out.println("dimmi i pollici: ");
        pol= in.nextInt();
        Televisore t2 =new Televisore(pol,col,sch);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        
        in.skip("\n");
        
        System.out.println("dimmi il colore attualmente il colore è "+t1.getColore()+": ");
        col= in.nextLine();
        t1.setColore(col);
        System.out.println("dimmi il tipo di schermo attualmente è  "+t1.getSchermo()+": ");
        sch= in.nextLine();
        t1.setSchermo(sch);
        System.out.println("dimmi i pollici attualmente sono "+t1.getPollici()+": ");
        pol= in.nextInt();
        t1.setPollici(pol);
        
        
        System.out.println("la tv è acchesa? attuamente è  "+t1.getAccesa()+" ");
        acc= in.nextBoolean();
        t1.setAccesa(acc);      
        if(acc==true){
            System.out.println("dimmi il volume attualmente è  "+t1.getVolume()+" : ");
            vol= in.nextInt();
            t1.setVolume(vol);
            
            System.out.println("dimmi il canale attualmente è  "+t1.getCanale()+": ");
            can= in.nextInt();
            t1.setCanale(can);
            
            System.out.println("dimmi la luminosita attualmente è  "+t1.getLuminus()+": ");
            lum= in.nextInt();
            t1.setLuminus(lum);
        }       
        System.out.println(t1.toString());
        System.out.println("aumento il Volume il Canale e la luminosita di 1 e accendo la tv");
        t1.aumentaVolume();
        t1.aumentaCanale();
        t1.aumentaLuminus();
        t1.accendi();
        System.out.println(t1.toString());
        System.out.println("diminuisco il Volume il Canale e la luminosita di 1 e spengo la tv");
        t1.diminuisciVolume();
        t1.diminuisciCanale();
        t1.diminuisciLuminus();
        t1.spegni();
        System.out.println(t1.toString());
        }
}
