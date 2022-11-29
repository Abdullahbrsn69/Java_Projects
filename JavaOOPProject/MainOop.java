package oopWithNLayerApp;

import oopWithNLayerAppBusinnes.ProductManager;
import oopWithNLayerAppDataAccess.JdbcProductDao;

import oopWithNLayerAppEntities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone", 10000);

        ProductManager productManager = new ProductManager(new JdbcProductDao());
        productManager.add(product1);
    }
}
