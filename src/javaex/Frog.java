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
public class Frog extends Creature implements livableInW, liveableAir{

    public Frog(String id) {
        super(id);
    }

    @Override
    public void brearthInW() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void breathInA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
