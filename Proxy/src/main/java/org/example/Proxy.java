package org.example;
import java.util.Random;
public class Proxy implements Standard{
    private StandardImpl1 target;
    @Override
    public void precess() {
        System.out.println("Vérification du context de sécurité");
        boolean b=new Random().nextBoolean();
        if(b){
            System.out.println("Avant l'appel");
            target=new StandardImpl1();
            target.precess();
            System.out.println("Après l'appel");
        } else {
            throw new RuntimeException("Forbidden 403");
        }
    }
}
