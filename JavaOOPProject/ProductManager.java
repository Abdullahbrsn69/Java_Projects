package oopWithNLayerAppBusinnes;
import oopWithNLayerAppDataAccess.ProductDao;
import oopWithNLayerAppEntities.Product;;
public class ProductManager {
       private ProductDao productDao;
       public ProductManager(ProductDao productDao) {
          this.productDao = productDao;
       }

    public void add(Product product) throws Exception { // Hata fırlatabilir demektir.
        // İş Kuralları
        if(product.getUnitPrice()<10) {

            throw new Exception("Ürün fiyatı 10dan küçük olamaz.");
              
        }
        productDao.add(product);
    }
}
