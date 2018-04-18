/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretestrategys;

import strategy.Compositor;

/**
 *
 * @author Win-7
 */
public class SimpleCompositor implements Compositor{

    @Override
    public void composer() {
        System.out.println("Quebras de linhas, uma por vez");
    }
    
}
