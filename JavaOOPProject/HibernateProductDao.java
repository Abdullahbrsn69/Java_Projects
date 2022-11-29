package oopWithNLayerAppDataAccess;
import oopWithNLayerAppEntities.Product;

public class HibernateProductDao implements ProductDao{
    
    public void add(Product product) {
        // Sadece db erişim kodları buraya yazılır. SQL ile...
        System.out.println("Hibernate ile veritabanına eklendi");
        
}
}
