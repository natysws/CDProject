/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdproject;
import java.lang.Math;
/**
 *
 * @author natalie
 */
public class CDProject {
    private int principal;
    private int maturity;
    private double IR;
    private String CM;
    
    public void commonData(int p, int m, double Interest, String Comp)
    {
        principal= p;
        maturity = m;
        IR = Interest;
        CM = Comp;
    }
    
    public void setVars()
    {
        principal = p;
        maturity = m; 
        IR = Interest; 
        CM = Comp; 
    }
    public double accumulated()
    {
        num = 1;
        if (CM = "daily")
        {
            num = num*365;
        }
        else if(CM = "monthly")
        {
            num = num*12;
        }
        else if(CM = "quarterly")
        {
            num = num*4;
        }
        double this = principal(1+(IR/num));
        double acc = this.pow(num*CM);
        return acc;
    }
    
}
