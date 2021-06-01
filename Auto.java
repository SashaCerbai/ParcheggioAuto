/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcheggioauto;

import java.util.Random;

/**
 *
 * @author cerba
 */
public class Auto extends Thread{

    public Auto(String name) {
        super(name);
    }

    @Override
    public void run() {
        
         try{
    
            System.out.println("La macchina " + getName() + " prova ad entrare nel parcheggio con " + Parcheggio.postiDisponibili + " posti disponibili");
            Parcheggio.semIngresso.acquire();
            
            Parcheggio.postiDisponibili--;
            
            System.out.println("La macchina " + getName() + " è entrata nel parcheggio con adesso " + Parcheggio.postiDisponibili + " posti disponibili");
            Parcheggio.semIngresso.release();
            
            this.sleep(new Random().nextInt(10));
            
            System.out.println("La macchina " + getName() + " prova ad uscire dal parcheggio con " + Parcheggio.postiDisponibili + " posti disponibili");
            Parcheggio.semUscita.acquire();
            
            Parcheggio.postiDisponibili++; 
            
            Parcheggio.semUscita.release();
            System.out.println("La macchina " + getName() + " è uscita dal parcheggio con " + Parcheggio.postiDisponibili + " posti disponibili");
            
    }catch(InterruptedException e){}
        
    } 
    
}
