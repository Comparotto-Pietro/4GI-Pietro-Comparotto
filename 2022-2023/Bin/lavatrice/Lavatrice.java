package lavatrice;


/**
 * Aggiungi qui una descrizione della classe Lavatrice
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Lavatrice
{
    private String marca;
    private String modello;
    private double prezzo;
    private int programma;
    private int temperatura;
    private int giriCentrifuga;
    private int kg;
    private boolean acceso;
    private double tempo;
    public Lavatrice(){
        this.marca="anonimo";
        this.modello="anonimo";
        this.prezzo=0;
        this.programma=0;
        this.temperatura=0;
        this.giriCentrifuga=0;
        this.kg=0;
        this.acceso=false;
        this.tempo=0.0;
    }
    public Lavatrice(Lavatrice l){
        this.marca=l.marca;
        this.modello=l.modello;
        this.prezzo=l.prezzo;
        this.programma=l.programma;
        this.temperatura=l.temperatura;
        this.giriCentrifuga=l.giriCentrifuga;
        this.kg=l.kg;
        this.acceso=l.acceso;
        this.tempo=l.tempo;
    }
    public Lavatrice(String mar, String mod, double pre){
        if(mar!=null){
            this.marca=mar;
        }
        if(mod!=null){
            this.modello=mod;
        }
        if(pre>0.0){
            this.prezzo=pre;
        }else{
            this.prezzo=0.0;
        }
        this.programma=0;
        this.temperatura=0;
        this.giriCentrifuga=0;
        this.kg=0;
        this.acceso=false;
        this.tempo=0.0;
    }
    public String toString(){
                String out="la lavatrice: "+"\n";
        out+="marca "+this.marca+"\n";
        out+="modello "+this.modello+"\n";
        out+="prezzo "+this.prezzo+"\n";
        if(this.acceso){
            out+="è accesa "+"\n";
        }else{
            out+="è spenta "+"\n";
        }
        out+="il ptogramma impostato è "+this.programma+"\n";
        out+="la temperatura impostata è "+this.temperatura+"\n";
        out+="i giri impostati sono "+this.giriCentrifuga+"\n";
        out+="i kg impostati sono "+this.kg+"\n";
        out+="il tempo impostato è "+this.tempo+"\n";
        return out;
    }
    public void setMarca(String mar){
        if(mar!=null){
            this.marca=mar;
        }
    }
    public void setModello(String mod){
        if(mod!=null){
            this.modello=mod;
        }
    }
    public void setPrezzo(double pre){
        if(pre>=0){
            this.prezzo=pre;
        }
    }
    public void setProgramma(int pro){
        if(pro>=0){
            this.programma=pro;
        }
    }
    public void setTemperatura(int tem){
        if(tem>=0){
            this.temperatura=tem;
        }
    }
    public void setGiriCentrifuga(int gir){
        if(gir>=0){
            this.giriCentrifuga=gir;
        }
    }
    public void setKg(int k){
        if(k>=0){
            this.kg=k;
        }
    }
    public void setAcceso(boolean acc){
        if(acc!=this.acceso){
            this.acceso=acc;
        }
    }
    public void setTempo(double t){
        if(t>=0){
            this.tempo=t;
        }
    }
    public String getMarca(){
        
        return this.marca;
    
    }
    public String getModello(){
        return this.modello;
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public int getProgramma(){
        return this.programma;
    }
    public int getTemperatura(){
        return this.temperatura;
    }
    public int getGiriCentrifuga(){
        return this.giriCentrifuga;
    }
    public int getKg(){
        return this.kg;
    }
    public boolean getAcceso(){
        return this.acceso;
    }
    public double getTempo(){
        return this.tempo;
    }
    public void incrementaKg(int i){
        this.kg=(this.kg+i)%10;
    }
}
