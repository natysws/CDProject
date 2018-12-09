/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdproject;

/**
 *
 * @author natalie
 */
public class CDProject {
    private int principal;
    private int maturity;
    private double IR;
    private double CM;
    
    public void commonData(int p, int m, double Interest, double Comp)
    {
        principal= p;
        maturity = m;
        IR = Interest;
        CM = Comp;
    }
    
    public void setVars(int p, int m, double Interest, double Comp)
    {
        principal = p;
        maturity = m; 
        IR = Interest; 
        CM = Comp; 
    }
}
