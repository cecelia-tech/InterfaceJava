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
public class Namas implements Elektra, Vanduo, Ventiliacija{
    //SITAS METODAS PRIVALOMAS
    public void ijunk(){
        System.out.println("Ijungiam sviesa");
    }
    // IR SITAS METODAS PRIVALOMAS
    public void isjunk(){
        System.out.println("isjungiam sviesa");
    }
    //SITAS JAU PASIRINKTINAI
    public void atidaromLanga(){
        System.out.println("atidarom langa");
    }
    //SITAS METODAS PRIVALOMAS
    public void uzsuk(){
        System.out.println("uzsukam vandeni");
    }
    // IR SITAS METODAS PRIVALOMAS
    public void atsuk(){
        System.out.println("atsukam vandeni"); 
    }

    @Override
    public void pusk() {
        System.out.println("pusk");
    }

    @Override
    public void stiprumas() {
        System.out.println("koks stiprumas?");
    }
}
