/*
Vaja: 35 
Izdelal: Erik Vodopivec
Ime Datoteke: MainGUI.java
Opis: Preberi podatke iz JTextField in jih dodaj na tabelo preko SLuzbenaTorbaTableModel
Izhodi: program izpiše metode iz razredov Torba in razredov, ki sta dedovala:
SluzbenaTorbaTableModel.
*/

//vključimo paket za delo z I/O
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;

//paket za delo z dogodki
import java.awt.event.*;
//deklariramo javni razred Miza in implementiramo vmesni Action LIstener
public class MainGUI implements ActionListener{
    private JFrame okno;
    private JPanel povrsina;
    private JLabel besedilo;
    private JLabel besedilo2;
    private JButton  gumb;
    private JTextField vnosnoPolje;
    private JTextField vnosnoPolje2;
    private JTable tabela;
    private SluzbenaTorbaTableModel modelTabele;  //moramo povedati kaj bomo milei notr(naredi table model)


    public static void main (String[] args) {
        if(args.length > 0) {
            System.out.println("1. argument je"+ args[0]);
        //objekt lokalna spremenljivka
            MainGUI m = new MainGUI(args[0]);
    }
        else {
        System.out.println("Program je bil zagnan brez argumentov!!");
        }
    }
        //konstruktor
        public MainGUI(String naslov){
            //inicializiramo okon
            okno = new JFrame(naslov);
            //povrsina
            povrsina = new JPanel();
            //ustvarimo okence z besedilom
            besedilo =new JLabel("Znamka racunalnika v sluzbeni torbi:");
            besedilo2 =new JLabel("Znamka slusalk v sluzbeni torbi:");
            //dodamo kence na površino
            povrsina.add(besedilo);
            // ustvarimo gumb
            gumb = new JButton("Dodaj torbo!");
            //gumbu določimo poslušalca dogodkov
            gumb.addActionListener(this);
            
            //vnosno polje
            vnosnoPolje= new JTextField(32);
            vnosnoPolje2= new JTextField(32);
            //ustvarimo tabelo in model tabele
            modelTabele = new SluzbenaTorbaTableModel();
            //modelu dodamo stolpec
            //modelTabele.addColumn("Znamka pive:");
            //ustvarimo tabelo na podlagi tabele ki smo ga ustvarili zgoraj
            tabela = new JTable(modelTabele); 
            //dodamo vnosno polje na površino
            povrsina.add(vnosnoPolje);
            povrsina.add(besedilo2);
            povrsina.add(vnosnoPolje2);
            //dodamo površino v okno
            //add ne gumb
            povrsina.add(gumb);
            okno.add(povrsina);
            //dodamo tabelo na površino
            povrsina.add(tabela);
            //metoda za prikaz okna
            okno.setVisible(true);
            //nastavimo velikost okna 
            okno.setSize(600,600);
            //nastavimo tako da ko zapremo okno ustavimo aplikacijo
            okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    //implementiramo metodo ki jo predpisuje
    public void actionPerformed(ActionEvent e){
            //DEBUG System.out.print("Dogodek: "+ e.toString());
            System.out.println("Vsebina vnosnega polja: "+ vnosnoPolje.getText()+" "+vnosnoPolje2.getText()+".");
            //pripravimo seznam objektov za vnos vrstice (lokalna spremenljivka)
            //Object[] vrstica = new Object [] {vnosnoPolje.getText()};
            //dodamo vrstico v model tabele
            modelTabele.addRow(new SluzbenaTorba(vnosnoPolje.getText(), vnosnoPolje2.getText()));
            //pocistimo vnosno polje
            vnosnoPolje.setText("");
            vnosnoPolje2.setText("");
    }
}