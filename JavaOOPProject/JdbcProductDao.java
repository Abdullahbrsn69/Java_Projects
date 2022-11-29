package oopWithNLayerAppDataAccess;

import oopWithNLayerAppEntities.Product;

public class JdbcProductDao implements ProductDao {

    public void add(Product product) {
        // Sadece db erişim kodları buraya yazılır. SQL ile...
        System.out.println("JDBC ile veritabanına eklendi");
    }
}