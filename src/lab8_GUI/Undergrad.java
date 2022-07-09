/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_GUI;

/**
 *
 * @author THIS PC
 */
public class Undergrad extends Student{
    private double minGpa;
    public Undergrad(String name,double gpa){
        super(name,gpa);
    }
    public void setMinGpa(double minGpa){
        this.minGpa=minGpa;
    }
    public double getMinGpa(){
        return minGpa;
    }
    public boolean checkGpa(double stGpa){
        if (minGpa>= stGpa){
           return true;
        }else {
           return false;
        }
    }
}
