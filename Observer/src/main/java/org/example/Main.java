package org.example;
public class Main {
    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();
        Observer o1=new ObserverImpl1();
        Observer o2=new ObserverImpl2();
        Observer o3=new ObserverImpl1();
        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.subscribe(o3);
        observable.setState(22);
        observable.setState(33);
        observable.unsubscribe(o1);
//        observable.subscribe(new Observer() {
//            @Override
//            public void update(Observable observable) {
//                System.out.println("Observateur anonyme ======>");
//            }
//        });
        observable.subscribe(new Observer() {
            @Override
            public void update(int state) {
                System.out.println("Observateur anonyme ======>");
            }
        });
        observable.subscribe(obs -> System.out.println("Observateur anonyme ======>"));
        observable.setState(77);
    }
}