
package lab8_GUI;

public class Student {
    private String name;
    protected double gpa;
    public Student(){};
    public Student(String name, double gpa){
        this.name =name;
        this.gpa = gpa;  
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
}
