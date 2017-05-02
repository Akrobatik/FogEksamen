/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author Anders
 */
public class Materials {
    private int planks;
    private int nails;
    private int rope;
    
    public Materials() {
    }
    
    public Materials(int pl, int na, int ro) {
        planks = pl;
        nails = na;
        rope = ro;
    }
    
    public int getPlanks() {
        return planks;
    }
    
    public void setPlanks(int pl) {
        planks = pl;
    }
    
    public int getNails() {
        return nails;
    }
    
    public void setNails(int na) {
        nails = na;
    }
    
    public int getRope() {
        return rope;
    }
    
    public void setRope(int ro) {
        rope = ro;
    }
    
    public String toString() {
        return "Materials{" + "Planks: " + planks + "\nNails: " + nails + "\nRope: " + rope + '}';
    }
}
