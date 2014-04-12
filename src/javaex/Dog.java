/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaex;

/**
 *
 * @author alex
 */
public class Dog extends Walk{
    private Colors c;

    public Dog() {
        c = Colors.RED;
    }

    @Override
    public String toString() {
        return c.toString();
    }
    
    public int noLegs(){
        return 4;
    }
    
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void walkSlow() {
        super.walkSlow(); //To change body of generated methods, choose Tools | Templates.
    }
     
}
