package org.example.state;

public abstract class State {
    protected AvionImpl avion;
    public State(AvionImpl avion){
        this.avion=avion;
    }
    abstract void executeSortirDuGarage(); // Operation de transition d'etat
    abstract void executeEntrerAuGarage(); // Operation de transition d'etat
    abstract void executeDecoller();       // Operation de transition d'etat
    abstract void executeAtterir();        // Operation de transition d'etat
    abstract void executeDoActivity();  // Activité

}
