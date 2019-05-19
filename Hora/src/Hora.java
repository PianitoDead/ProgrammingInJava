public class Hora {
   int modo,h, m,s;

    int getmodo(){

    return modo;

    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }


    

   public  Hora(){
    modo=24; /*por defecto ponemos 24horas*/
    h=0;
    m=0;
    s=0;


    }

    public Hora( int h, int m, int s){
        this.modo=24;
        this.h=h %24;
        this.m=m % 60;
        this.s=s % 60;

    }


   public void ponerEnHora(int md, int hh, int mm, int ss){
      modo=md;
      h=hh % 24;
      m=mm % 60;
      s=ss % 60;
   }

   public void incrementar(){
    s++;
    if (s==60){
    s=0;
    m++;
    if(m==60){
    m=0;
    h=(h+1)%24;
    }

    }

    }

   public void decrementa(){
    s--;
    if(s<00){
        s=59;
        m--;
        if(m<00){
        m=59;
        h=(h-1) %24;

        }
    }
   }
   public String verHora(){

       String hms="Son las ";

       if (modo==12){//modo 12 horas    
           hms+=(h>12)?h-12:h;
           hms+= ":"+m+":"+s;
           hms+=(h>=12)?"pm":"am";

       }else{//modo 24h
       hms+=h+":"+m+":"+s;
       }
   return (hms);
   }
}