package Decorateur;

import Composants.Boisson;

public abstract class Decorateur extends Boisson {

    protected Boisson boisson;
    public Decorateur(Boisson boisson) {
    this.boisson=boisson ;
    }
    // pour forcer les autres classes  qui hérite de cette
    // classe de redéfinir la méthode getDescription
    public abstract String getDescription();

}
