/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcheggioauto;

import java.util.concurrent.Semaphore;

/**
 *
 * @author cerba
 */
public class Parcheggio {
    
    protected static int  postiDisponibili=10;
    
    protected static Semaphore semIngresso= new Semaphore(1);
    protected static Semaphore semUscita= new Semaphore(1);
   
    
}
