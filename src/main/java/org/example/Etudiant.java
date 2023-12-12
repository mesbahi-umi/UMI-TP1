package org.example;

public class Etudiant {
    private String nom;
    private String prenom;
    private int cne;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    Etudiant(String nom, String prenom, int cne) {
        this(nom, prenom);
        this.cne = cne;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getCne() {
        return cne;
    }

    public void setCne(int cne) {
        this.cne = cne;
    }

    @Override
    public String toString() {
        return getPrenom() + " " + getNom() + " " + getCne();
    }
}
