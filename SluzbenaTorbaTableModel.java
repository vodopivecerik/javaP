/*
Vaja: 35 
Izdelal: Erik Vodopivec
Ime Datoteke: SluzbenaTorbaTableModel.java
Opis: Razsirimo razred sluzbena torba na DeafultTable model in dodamo kontruktor
za doodajanje vrstic in zacetnih kolon.
Izhodi: program izpiše metode iz razred SluzbenaTorbaTableModel.
*/


import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class SluzbenaTorbaTableModel extends DefaultTableModel{

    private ArrayList<SluzbenaTorba>sluzbeneTorbe;

    // konstruktor
    public SluzbenaTorbaTableModel(){
        super();
        sluzbeneTorbe = new ArrayList<SluzbenaTorba>();
        addColumn("Znamka racunalnika v torbi: ");
        addColumn("Znamka slusalk v torbi : ");
    }
    public void addRow(SluzbenaTorba s){
        sluzbeneTorbe.add(s);
        Object[] vrstica = new Object[] {s.getZnamkaRacunalnika(),""+s.getZnamkaSlusalk()};
        addRow(vrstica);
    }
}