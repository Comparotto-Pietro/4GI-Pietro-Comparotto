package bagaglio;

public class Bagaglio {
    private static final double MAX_WEIGHT= 20.00;
    private double weight;
    public Bagaglio(){
        this.weight=0.0;
    }
    public Bagaglio(double w){
        setWeight(w);
    }
    public void setWeight(double w){
        if(w>0){
            this.weight=w;
        }
        else{
            this.weight=0;
        }
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean sovrappeso(){
        return(this.weight>MAX_WEIGHT);
    }
    public boolean equals(Bagaglio b){
        return (this.toString().equals(b));
    }
    public String toString(){
        String out="";
        out+=" il bagaglio pesa: "+this.weight+" kg";
        return out;
    }
}
