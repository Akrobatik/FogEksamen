    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Anders
 */
public class Ordre2 {
    private int ordreId;
    private double width;
    private double height;
    private int nails;
    private int planks;
    private String shed;
    
    public Ordre2() {
    }
    
    public Ordre2(int oid, double wi, double he, int na, int pl, String sh) {
        ordreId = oid;
        width = wi;
        height = he;
        nails = na;
        planks = pl;
        shed = sh;
    }
    
    public int getOrdreId() {
        return ordreId;
    }
    
    public void setOrdreId(int oid) {
        ordreId = oid;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWitdh(double wi) {
        width = wi;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight (double he) {
        height = he;
    }
    
    public int getNails() {
        return nails;
    }
    
    public void setNails(int na) {
        nails = na;
    }
    
    public int getPlanks() {
        return planks;
    }
    
    public void setPlanks(int pl) {
        planks = pl;
    }
    
    public String getShed() {
        return shed;
    }
    
    public void setShed(String sh) {
        shed = sh;
    }
    
    public String toString() {
        return "Ordre list{" + "Ordre ID: " + ordreId + "\nWidth: " + width + "\nHeight: " + height + "\nNails: " + nails + "Planks: " + planks + "\nShed: " + shed + '}';
    }
}
