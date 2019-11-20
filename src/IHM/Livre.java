package IHM;

import Bridge.Bibliotheque;

public class Livre {
    private String nom;
    private String auteur;
    private String resume;
    private int colonne;
    private int rangee;
    private int parution;


    public Livre(String nom, String auteur, String resume, int colonne, int rangee, int parution) {
        this.nom = nom;
        this.auteur = auteur;
        this.resume = resume;
        this.colonne = colonne;
        this.rangee = rangee;
        this.parution = parution;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
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
