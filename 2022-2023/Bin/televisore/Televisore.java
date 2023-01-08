package televisore;
/**
 * Aggiungi qui una descrizione della classe Televisore2
 * 
 * @author (Pietro Comparotto) 
 * @version (1)
 */
public class Televisore
{
    private int pollici;
    private int canale;
    private int volume;
    private int luminus;
    private String colore;
    private String schermo;
    private boolean accesa;
    public Televisore()
    {
        this.pollici=0;
        this.canale=0;
        this.volume=0;
        this.luminus=0;
        this.colore="anonimo";
        this.schermo="anonimo";
        this.accesa=false;
    }
    public Televisore(int pol ,String col , String sch){
        if(pol>=0){
            this.pollici=pol;
        }else{
            this.pollici=0;
        }
               //
        this.canale=0;
        
        this.volume=0;
        
        this.luminus=0;
       
        if(col!=null){
            this.colore=col;
        }else{
            this.colore="anonimo";
        }
        
        if(sch!=null){
            this.schermo=sch;
        }else{
            this.schermo="anonimo";
        }
        
        this.accesa=false;
        }
    public String toString(){
        String out="";
        out+="il televisore a "+this.pollici+" pollici";
        out+=" il tipo di colori è "+this.colore;
        out+=" lo schermo è "+this.schermo;
        out+=" il volume è "+this.volume;
        out+=" è sul canale "+this.canale;
        out+=" la luminosita è "+this.luminus;
        if(accesa!=false){
            out+=" ed è accesa";
        }else{
            out+=" ed è spenta";
        }
        return out;
    }
    public void setPollici(int pol){
        if(pol>0 && pol!=this.pollici){
            this.pollici=pol;
        }
    }
    public void setVolume(int vol){
         if(vol>0 && vol!=this.volume){
             this.volume=vol;
        }
    }
    public void setCanale(int can){
         if(can>0 && can!=this.canale){
             this.canale=can;
         }
    }
    public void setLuminus(int lum){
         if(lum>0 && lum!=this.luminus){
             this.luminus=lum;
         }
    }
    public void setColore(String col){
         if(col!=null){
            this.colore=col;
         }
    }
    public void setSchermo(String sch){
         if(sch!=null){
             this.schermo=sch;
         }
    }
    public void setAccesa(boolean acc){
        this.accesa=acc;
    }
    public int getPollici(){
        return this.pollici;
    }
    public int getVolume(){
         return this.volume;
    }
    public int getCanale(){
         return this.canale;
    }
    public int getLuminus(){
         return this.luminus;
    }
    public String getColore(){
         return this.colore;
    }
    public String getSchermo(){
         return this.schermo;
    }
    public boolean getAccesa(){
        return this.accesa;
    }
    public void aumentaVolume(){
        this.volume+=1;
    }
    public void aumentaCanale(){
        this.canale+=1;
    }
    public void aumentaLuminus(){
        this.luminus+=1;
    }
    public void diminuisciVolume(){
        this.volume-=1;
    }
    public void diminuisciCanale(){
        this.canale-=1;
    }
    public void diminuisciLuminus(){
        this.luminus-=1;
    }
    public void accendi(){
        this.accesa=true;
    }
    public void spegni(){
        this.accesa=false;
    }
}
