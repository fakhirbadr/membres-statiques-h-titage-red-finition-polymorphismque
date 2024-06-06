// Classe Personne
public class Personne {
    // Attributs privés
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int age;

    // Constructeur avec paramètres
    public Personne(String nom, String prenom, String email, String tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    // Méthode toString pour afficher les informations de la personne
    @Override
    public String toString() {
        return "Nom: " + nom + "\n" +
                "Prénom: " + prenom + "\n" +
                "Email: " + email + "\n" +
                "Téléphone: " + tel + "\n" +
                "Âge: " + age + "\n";
    }
}








