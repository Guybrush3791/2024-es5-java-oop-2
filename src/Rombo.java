public class Rombo {

    /**
     * TODO:
     * 
     * definire variabili private per:
     * - lato
     * - diagonale maggiore
     * - diagonale minore
     * 
     * definire costruttore per inizializzare
     * le variabili tramite le proprieta'
     * 
     * definire proprietà getter/setter
     * 
     * definire metodo per calcolare
     * - perimetro: 4 * lato
     * - area: (diagonale maggiore * diagonale minore) / 2
     * 
     * definire metodo per stampare i dettagli
     * 
     * definire il metodo toString
     * 
     * BONUS:
     * - nel caso in cui vengano assegnati valori <= 0 alle
     * variabili, assegnare il valore 1 per evitare errori
     * 
     */

    int lato;
    int diag1;
    int diag2;

    public Rombo(int lato, int diag1, int diag2) {

        setLato(lato);
        setDiag1(diag1);
        setDiag2(diag2);
    }

    public int getLato() {

        return lato;
    }

    public void setLato(int lato) {

        // if (lato <= 0) {
        // this.lato = 1;
        // } else
        // this.lato = lato;

        this.lato = lato <= 0 ? 1 : lato;
    }

    public int getDiag1() {

        return diag1;
    }

    public void setDiag1(int diag1) {

        this.diag1 = diag1 <= 0 ? 1 : diag1;
    }

    public int getDiag2() {

        return diag2;
    }

    public void setDiag2(int diag2) {

        this.diag2 = diag2 <= 0 ? 1 : diag2;
    }

    public int getPerimetro() {

        return 4 * getLato();
    }

    public int getArea() {

        return (getDiag1() * getDiag2()) / 2;
    }

    public String getDetails() {

        return "Lato: " + getLato() +
                "\nDiagonale 1: " + getDiag1() +
                "\nDiagonale 2: " + getDiag2() +
                "\nPerimetro: " + getPerimetro() +
                "\nArea: " + getArea();
    }

    @Override
    public String toString() {

        return "Rombo:\n" + getDetails();
    }
}
