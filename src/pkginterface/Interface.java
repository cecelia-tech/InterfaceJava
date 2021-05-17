/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author vita
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void pamirksek(Elektra e){
    e.ijunk();
    e.isjunk();
    e.ijunk();
    e.isjunk();
    }
    /*
    public void pamirksek(Palapine p){
    n.ijunk();
    n.isjunk();
    n.ijunk();
    n.isjunk();
    }
    public void pamirksek(SodoNamas sn){
    sn.ijunk();
    sn.isjunk();
    sn.ijunk();
    sn.isjunk();
    }*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Namas n = new Namas();
        Palapine p = new Palapine();
        SodoNamas sn = new SodoNamas();
        
        Object o = new SodoNamas();
        
        //reikia kastint, nes per objekto prizme elektros nsimato
        //ojekte elektra neimplementuota
        Elektra ee = (Elektra) o;
        Elektra e = p;
        e.ijunk();
        
        e = n;
        e.ijunk();
        
        Vanduo v = n;
        v.atsuk();
        v.uzsuk();
        //pamirksek(n);
        pamirksek(sn);
        
        Dangoraizis d = new Dangoraizis();
        System.out.println(d.kurYra());
        d.vaziuojam(5);
        System.out.println(d.kurYra());
        System.out.println("------");
        pamirksek(d);
    }
    
}
