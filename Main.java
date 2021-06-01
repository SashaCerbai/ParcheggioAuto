/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcheggioauto;

/**
 *
 * @author cerba
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Auto a1=new Auto("Porsche Pollo");
        Auto a2=new Auto("Ferrari Gallina");
        Auto a3=new Auto("Lotus Gallo");
        Auto a4=new Auto("Bentley Galletto");
        
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        
        
        
    }
    
}
