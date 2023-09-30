public class Singleton {
    // Étape 1: Ajoutez un champ statique privé pour stocker l'instance singleton.
    private static Singleton instance;

    // Étape 3: Rendez le constructeur privé.
    private Singleton() {
        // Initialisation du singleton
    }

    // Étape 2: Ajoutez une méthode pour créer un nouvel objet singleton.
    public static Singleton getInstance() {
        // Si l'instance n'existe pas encore, créez-la.
        if (instance == null) {
            instance = new Singleton();
        }
        // Renvoie toujours l'instance singleton.
        return instance;
    }

    // Votre code métier va ici...

    public void doSomething() {
        System.out.println("Faire quelque chose en utilisant le Singleton.");
    }
}

