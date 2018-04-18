/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import concretestrategys.ArrayCompositor;
import concretestrategys.SimpleCompositor;
import concretestrategys.TeXCompositor;
import context.Composition;
import strategy.Compositor;

/**
 *
 * @author Win-7
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compositor simpleCompositor = new SimpleCompositor();
        Compositor texCompositor = new TeXCompositor();
        Compositor arrayCompositor = new ArrayCompositor();
        
        
        Composition composition = new Composition();
        composition.setCompositor(texCompositor);
        composition.repair();
    }
    
}
