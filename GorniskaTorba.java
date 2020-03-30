//definiramo razred ki razsiri razred Torba
public class GorniskaTorba extends Torba{
    //lastnosti deklarirane v nadrazredu so prenesene
    //deklariramo nove oz. dodatne lastnosti
    private Boolean imaCepin;
    private int kolicinaMeha;   //kolicina vode v Mehu za pitje

    //konstruktor - deklariramo
    public GorniskaTorba(Boolean c,int m){

        //poklicemo in vnesemo parametre nadrazreda Torba
        super("vijolicna", "Berghaus","bunda");
        
        //dolocimo lastnosti GorniskeTorbe - po super
        imaCepin= c;
        kolicinaMeha= m;
    }
    //definiramo metode specificne za GorniskoTorbo
    public int getKolicinaMeha(){
        return kolicinaMeha;
    }
}