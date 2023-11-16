package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Context context=new Context() ;
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl1());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl2());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl3());
        context.effectuerOperation();

//        Context context=new Context() ;
//        Scanner scanner=new Scanner(System.in);
//        while (true){
//            System.out.println("Quelle stratégie ? : ");
//            String str=scanner.nextLine();
//            Strategy strategy=(Strategy) Class.forName("org.example.StrategyImpl"+str).newInstance(); // throws Exception
//            context.setStrategy(strategy);
//            context.effectuerOperation();
//        }


    }
}