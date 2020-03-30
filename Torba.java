public class Torba {
    //definiram privatne spremenljivke v razredu Torba
    private String barva;
    private String znamka;
    private String vsebina;

    //definiramo osnovno predlogo objekta Torba
    public Torba (String b, String z, String v){
        znamka = z;
        barva = b;
        vsebina = v;
    }
    //definiramo metode za vsako privatno lastnost/spremenljivko
    public String getZnamka(){
        return znamka;
    }
    public String getBarva(){
        return barva;
    }
    public String getVsebina(){
        return vsebina;
    }

    //definiramo metodo ODPRI TORBO
}