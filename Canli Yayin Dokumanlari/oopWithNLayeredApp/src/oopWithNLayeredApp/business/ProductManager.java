package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAcces.HibernateProductDao;
import oopWithNLayeredApp.dataAcces.JdbcProductDao;
import oopWithNLayeredApp.dataAcces.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[]  loggers;

	public ProductManager(ProductDao productDao, Logger[ ] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
		
	}

	public void add(Product product) throws Exception {
		// is kurallari -business rules
		if (product.getUnitPrice() < 10) {
			throw new Exception("Urun Fiyati 10dan kucuk olamaz.");
		}
		productDao.add(product);
		
			for (Logger logger : loggers) {// [db,file]
				logger.log(product.getName());
			}
	}

}
