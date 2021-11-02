/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.saikrishna04lab;

/**
 *
 * @author Saikrishna Vuppala
 */
public class StringRay extends Animal {
    /**
     * 
     * @param name 
     */

    public StringRay(String name) {
        super(name);
    }

   // @Override
    public void swim() {
        System.out.println("Generic animal swim");
    }

    @Override
    public void move() {
        System.out.println("Generic animal movement");
    }
 @Override
    public void speak() {
        System.out.println("Generic animal voice");
    }
}
