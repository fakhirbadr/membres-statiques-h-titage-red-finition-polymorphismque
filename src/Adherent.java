// Classe Adherent héritant de Personne
public class Adherent extends Personne {
    // Attribut spécifique à Adherent
    private int numAdherent;

    // Constructeur avec paramètres
    public Adherent(String nom, String prenom, String email, String tel, int age, int numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    // Redéfinition de la méthode toString pour Adherent
    @Override
    public String toString() {
        return super.toString() + "Numéro Adhérent: " + numAdherent + "\n";
    }
}