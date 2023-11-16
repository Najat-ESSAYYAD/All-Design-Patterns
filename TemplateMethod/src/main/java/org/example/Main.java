package org.example;

public class Main {
    public static void main(String[] args) {
        TemplateClass templateClass=new TemplateImpl1();
        System.out.println(templateClass.TemplateMethod());
        System.out.println("***************************");
        templateClass=new TemplateImpl2();
        System.out.println(templateClass.TemplateMethod());
    }
}