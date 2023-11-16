package org.example.state;

public class EtatAuGarage extends State {
    public EtatAuGarage(AvionImpl avion) {
        super(avion);
    }
    @Override
    void executeSortirDuGarage() {
        System.out.println("Transition d'etat de en Garage => Piste");
        avion.setState(new EtatEnPiste(avion));        }
    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible, je suis déjà au Garage");
    }
    @Override
    void executeDecoller() {
        System.out.println("Impossible de décoller, je suis au Garage");
    }
    @Override
    void executeAtterir() {
        System.out.println("Impossible d'atterir, je suis déjà au garage");
    }
    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état au Garage ....."+i);
        }
    }
}
