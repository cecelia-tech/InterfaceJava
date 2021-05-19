package pkginterface;

public class Interface {
/*
    
    
    public static void pamirksek(Elektra e){
    e.ijunk();
    e.isjunk();
    e.ijunk();
    e.isjunk();
    }*/
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
    
    public static void kasTu(Object o){
        System.out.println("Palapine: " + (o instanceof Palapine));
        System.out.println("SodoNamas: " + (o instanceof SodoNamas));
        System.out.println("Namas: " + (o instanceof Namas));
        System.out.println("Dangoraizis: " + (o instanceof Dangoraizis));
        //interface
        System.out.println("Elektra" + (o instanceof Elektra));
        System.out.println("Vanduo" + (o instanceof Vanduo));
        System.out.println("Ventiliacija" + (o instanceof Ventiliacija));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Namas n = new Namas();
        Palapine p = new Palapine();
        SodoNamas sn = new SodoNamas();
        
        Object o = new SodoNamas();
        
        //reikia kastint, nes per objekto prizme elektros nesimato
        //objekte elektra neimplementuota
        Elektra ee = (Elektra) o;
        Elektra e = p;
        e.ijunk();
        
        e = n;
        e.ijunk();
        
        Vanduo v = n;
        v.atsuk();
        v.uzsuk();
        //pamirksek(n);
        //pamirksek(sn);
        
        Dangoraizis d = new Dangoraizis();
        System.out.println(d.kurYra());
        d.vaziuojam(5);
        System.out.println(d.kurYra());
        System.out.println("------");
        //pamirksek(d);
        
        System.out.println("Palapine");
        kasTu(p);
        System.out.println("---Sodo namas---");
        kasTu(sn);
        System.out.println("---Namas---");
        kasTu(n);
        System.out.println("---Dangoraizis---");
        kasTu(d);
        
        /*
        Ventiliacija vv = n;
        
        Liftas l = (Liftas) vv;
        System.out.println(l);*/
        
        Ventiliacija vvv = n;
        vvv.pusk();
        Elektra eee = (Elektra) vvv;
        e.ijunk();
        
        if (e instanceof Liftas) {
            Liftas l = (Liftas) e;
            l.vaziuojam(3);
        }
        //su abstrakcia klase galim kurti normalu objekta
        //abstrakcios klases objekto kurti negalim
        //kaip pvz: NeirengtasNamas nin = new NeirengtasNamas();
        NeirengtasNamas nn = new Namas();
        NeirengtasNamas nn1 = new Dangoraizis();
        
    }
    
}
