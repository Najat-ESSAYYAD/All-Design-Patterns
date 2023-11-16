package org.example.state;

public interface Avion {
    void sortirDuGarage(); // Operation de transition d'etat
    void entrerAuGarage(); // Operation de transition d'etat
    void decoller();       // Operation de transition d'etat
    void atterir();        // Operation de transition d'etat
    void doActivity();  // Activité
}
