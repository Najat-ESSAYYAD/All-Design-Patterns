import Composants.Boisson;
import Composants.Espresso;
import Composants.Sumatra;
import Decorateur.Chocolat;
import Decorateur.Lait;

public class Test {
    public static void main(String[] args) {
        Boisson boisson;
        boisson=new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("------------------------------");
        boisson=new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("------------------------------");
        boisson=new Lait(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("\n******************************\n");

        Boisson boisson1;
        boisson1=new Espresso();
        System.out.println(boisson1.getDescription());
        System.out.println(boisson1.cout());
        System.out.println("------------------------------");
        boisson1=new Chocolat(boisson1);
        System.out.println(boisson1.getDescription());
        System.out.println(boisson1.cout());
        System.out.println("------------------------------");
        boisson1=new Lait(boisson1);
        System.out.println(boisson1.getDescription());
        System.out.println(boisson1.cout());
    }
}
