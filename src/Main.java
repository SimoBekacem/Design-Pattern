public class Main {
    public static void main(String[] args) {
        // Pour le Singleton :
        // Étape 4: Remplacez les appels directs au constructeur par des appels à la méthode statique.
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();

        // Vous obtiendrez toujours la même instance.
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(singleton == anotherSingleton); // Cela devrait afficher true.

        // Pour le Builder ( client ) :
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.construct(builder);
        Product product = builder.getResult();

        // Utiliser le produit construit
        System.out.println("Product parts: " + product.getPart1() + ", " + product.getPart2() + ", " + product.getPart3());

        // Pour Factory Method  :

        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.operation();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.operation();
    }
}