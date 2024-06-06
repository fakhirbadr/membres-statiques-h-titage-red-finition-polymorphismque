// Classe principale pour tester les différentes classes
public class Main {
    public static void main(String[] args) {
        // Création d'un adhérent
        Adherent adherent = new Adherent("Dupont", "Jean", "jean.dupont@example.com", "0123456789", 30, 123456);

        // Création d'un auteur
        Auteur auteur = new Auteur("Martin", "Paul", "paul.martin@example.com", "9876543210", 45, 7890);

        // Création d'un livre avec l'auteur spécifié
        Livre livre = new Livre(123456789, "Titre du livre", auteur);

        // Affichage des informations de l'adhérent et du livre
        System.out.println("Informations de l'adhérent :\n" + adherent.toString());
        System.out.println("Informations du livre :\n" + livre.toString());
    }
}