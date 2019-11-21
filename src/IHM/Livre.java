package IHM;

public class Livre {
    private String titre;
    private String auteur;
    private String presentation;
    private int parution;
    private int colonne;
    private int rangee;



    public Livre(String titre, String auteur, String presentation, int parution, int colonne, int rangee) {
        this.titre = titre;
        this.auteur = auteur;
        this.presentation = presentation;
        this.colonne = colonne;
        this.rangee = rangee;
        this.parution = parution;
    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public int getColonne() {
        return colonne;
    }

    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    public int getRangee() {
        return rangee;
    }

    public void setRangee(int rangee) {
        this.rangee = rangee;
    }

    public int getParution() {
        return parution;
    }

    public void setParution(int parution) {
        this.parution = parution;
    }
}
