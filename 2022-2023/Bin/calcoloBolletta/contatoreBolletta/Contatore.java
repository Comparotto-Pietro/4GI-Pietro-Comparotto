package contatoreBolletta;

public class Contatore
{
    private static final double MAX_VAL = 99999.999;
    private double letturaPrec,letturaAtt;

    public Contatore()
    {
        letturaPrec=0.0;
        letturaAtt=0.0;
    }
    public Contatore(double i , double e)
    {
        letturaPrec=e;
        letturaAtt=i;
    }
    public Contatore(Contatore c)
    {
        if(c!=null){
            this.letturaPrec=c.letturaPrec;
            this.letturaAtt=c.letturaAtt;
        }else{
            this.letturaPrec=0.0;
            this.letturaAtt=0.0;
        }
    }
    public void setLetturaPrec(double g){
        if(g!=this.letturaPrec && g>=0){
            this.letturaPrec=g;
        }
    }
    public void setLetturaAtt(double g){
        if (g >= 0.0) {
        if (g > MAX_VAL) {
            this.letturaAtt = g - MAX_VAL;
               } else {
            this.letturaAtt = g;
                }
        }
    }
    public void eseguiLettura(double l){
        if(l>this.letturaAtt){
            this.letturaPrec=this.letturaAtt;
            this.letturaAtt=l;
        }       
    } 
    public double getLetturaPrec(){
        return this.letturaPrec;
    }
    public double getLetturaAtt(){
        return this.letturaAtt;
    }
    public double calcolaBolletta(){
        double consumo;
        consumo = this.letturaAtt - this.letturaPrec;
        if (consumo < 0.0) {
            consumo = (MAX_VAL - letturaPrec) + letturaAtt;
        }
        return (consumo);
    }
    public String toStrong(){
        String s;
        s="la lettura pecedente è"+this.getLetturaPrec()+"e al lettura attuale è"+this.getLetturaAtt();
        return s;
    }
}
