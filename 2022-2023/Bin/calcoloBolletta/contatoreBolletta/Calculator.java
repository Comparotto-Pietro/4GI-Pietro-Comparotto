package contatoreBolletta;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.*;


public class Calculator
{
    private ArrayList<Contatore> listaContatori;
    public Scanner in = new Scanner(System.in);
    private static final double PREZZO = 3.00;
    public Calculator()
    {
        this.listaContatori = new ArrayList<Contatore>();
    }
    public Calculator(ArrayList<Contatore> lis)
    {
            listaContatori = new ArrayList<Contatore>();
            if (lis != null) {
                for( Contatore c : lis){
                    listaContatori.add(new Contatore(c));
                    }
            }
    }

    public void start()
    {

        descrizioneApp();
        prendiInput();
        visualizzaBolletta();
        scriviFile();
    }       
    public void descrizioneApp(){
       System.out.println("sono il porgrama calcolaBolleta");
    }
    public void prendiInput(){
        System.out.println("dammi il nome del file: ");
        String fileN;
        fileN = in.nextLine();
        if (fileN != null) {
            leggiFile(fileN);
             }
    }
    
    public void visualizzaBolletta(){
        System.out.println("calcolo bolletta");
        double ris;
        for (Contatore c : listaContatori) {
            ris = c.calcolaBolletta();
            System.out.println("\n Le informazzione di questo contatore: \n" + c.toString() + 
            "\n");
            System.out.println("il consumo risulta di questa lettura risulta: " + ris + "\n");
            System.out.println("L'importo del gas a mq : " + PREZZO + "\n");
            System.out.println("L'importo della bolletta è: " + ris * PREZZO);

        }        
    }
    public void leggiFile(String fileName) {
        String data;
        String[] valori;
            File myObj;
        if (fileName != null) {
            try {
                    myObj = new File(fileName);
                                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNext()) {
                                     data = myReader.next();
                                     valori = data.split(";");
                     memorizzaContatoreNellaLista(valori);
                            }
                System.out.println("File trovato con successo");
                    } catch (FileNotFoundException e) {
                System.err.println("Errore");
                    }
                }else{System.err.println("non hai inserito nulla");}
    
        }
    public void memorizzaContatoreNellaLista(String[] v) {
            Contatore c = new Contatore();
            if (v != null) {
                c.setLetturaPrec(Double.parseDouble(v[0]));
                c.setLetturaAtt(Double.parseDouble(v[1]));
                this.listaContatori.add(c);
            }
    }
    public void scriviFile() {
                Scanner s = new Scanner(System.in);
        FileWriter fileOut = null;
                double inp;
        System.out.println("dammi il nome del file con i dati storici");
        String fileN;
        fileN = s.next();
        if (fileN != null) {
            try {
                        // apre il file in scrittura
                fileOut = new FileWriter(fileN);    
                    String  str;
                        for (Contatore c : this.listaContatori) {
                             str = "" + c.getLetturaPrec() + ";" + c.getLetturaAtt() + ";";
                                             str += +c.calcolaBolletta()+'\n';
                             fileOut.write(str);
                            }
                fileOut.close(); // chiude il file
                    } catch (Exception e) {
                System.out.println("An erroroccurred.");
                    }
            }
    
        System.out.println("\n fine programma");

    }
}
