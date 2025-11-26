import dao.IDao;
import entities.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.HibernateConfig;

public class Presentation2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

        IDao<Product> productDao = context.getBean(IDao.class);

        // Créer un produit
        Product product = new Product();
        product.setName("Produit 1");
        product.setPrice(100.0);

        // Sauvegarder le produit
        productDao.create(product);
        System.out.println("Produit sauvegardé : " + product.getName());

        // Afficher tous les produits
        System.out.println("\n=== Liste de tous les produits ===");
        productDao.findAll().forEach(System.out::println);
    }
}
