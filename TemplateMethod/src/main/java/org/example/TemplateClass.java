package org.example;

public abstract class TemplateClass {
    public double TemplateMethod(){
        int n=operation1();
        double somme=0;
        for (int i = 0; i < n; i++) {
            somme+=operation2(i);
        }
        return  somme;
    }

    protected abstract double operation2(int i);
    protected abstract int operation1() ;
}
