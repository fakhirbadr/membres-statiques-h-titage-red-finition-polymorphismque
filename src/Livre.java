// Classe Livre
public class Livre {
    // Attributs privés
    private int ISBN;
    private String titre;
    private Auteur auteur;

    // Constructeur avec paramètres
    public Livre(int ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    // Méthode toString pour afficher les informations du livre
    @Override
    public String toString() {
        return "ISBN: " + ISBN + "\n" +
                "Titre: " + titre + "\n" +
                "Auteur:\n" + auteur.toString();
    }
}