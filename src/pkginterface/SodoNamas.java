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
public class SodoNamas implements Elektra, Vanduo{

    @Override
    public void ijunk() {
        System.out.println("ijungiam sviesa");
    }

    @Override
    public void isjunk() {
        System.out.println("isjunk sviesa");
    }

    @Override
    public void uzsuk() {
        System.out.println("uzsukam sviesa");
    }

    @Override
    public void atsuk() {
        System.out.println("atsukam vandeni");
    }
    
}
