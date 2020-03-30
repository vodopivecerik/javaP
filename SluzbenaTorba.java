/*
Vaja: 35 
Izdelal: Erik Vodopivec
Ime Datoteke: SluzbenaTorba.java
Opis: razsirimo  nadrazred torba z Sluzbeno torbo. ki prejme parametre iz nadrazreda
in implementira še dva elementa. Znamko racunalnika in znamko slusalk
ki jih nosim v sluzbeni torbi kot programer :)!
Izhodi: konstrultor in dve metodi da dobimo lastnosti torbe.

*/


//definiramo razred ki razsiri razred Torba
public class SluzbenaTorba extends Torba{
    //lastnosti deklarirane v nadrazredu so prenesene
    //deklariramo nove oz. dodatne lastnosti
    private String znamkaRacunalnika;
    private String znamkaSlusalk;

    //konstruktor - deklariramo
    public SluzbenaTorba(String r,String s){

        //poklicemo in vnesemo parametre nadrazreda Torba
        super("crna", "Lenovo","racunalnik");
        
        //dolocimo lastnosti GorniskeTorbe - po super
        znamkaRacunalnika= r;
        znamkaSlusalk= s;
    }
    //definiramo metode specificne za SluzbenoTorbo
    public String getZnamkaRacunalnika(){
        return znamkaRacunalnika;
    }
    public String getZnamkaSlusalk() {
        return znamkaSlusalk;
    }
}