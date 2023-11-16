package org.example;
public class Client {
    private Standard standard;
    public void process(){
        standard.precess();
    }
    public void setStandard(Standard standard) {
        this.standard = standard;
    }
}
