/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import strategy.Compositor;
import strategy.Compositor;



/**
 *
 * @author Win-7
 */
public class Composition{
    
    private Compositor compositor;

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }
    
    public void traverse(){
        
    }
    
    public void repair(){
        compositor.composer();
    }
}
