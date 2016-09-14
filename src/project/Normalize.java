/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author manish
 */
public class Normalize {
    
    public static double Ndata(double max, double min, double data)
    {
     double  normalized = (double) (data-min)/(max-min);
     return normalized;
    }      
    
   
}
