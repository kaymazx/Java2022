package oop1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Canli Ders 2");
		// oop - object-oriented programming - nesne yonelimli programlama
		String mesaj = "Vade Orani";

		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		/*
		 * System.out.println(product1.name); System.out.println(product1.discount);
		 * System.out.println(product1.unitPrice);
		 * System.out.println(product1.imageUrl);
		 * System.out.println(product1.unitsInStock);
		 */

		// 2
		Product product2 = new Product();

		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		// 3
		Product product3 = new Product();

		product3.setName("Kitchen AidKahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

		/*
		Product product1 = new Product();
		// set value
		product1.name = "Delonghi Max Kahve Makinesi";
		product.unitPrice = 5500;
		product1.discount = 2;
		product1.unitsInStock = 3;
		product1.imageUrl = "bilmemne.jpg";
		
		Product product2 = new Product();
		// set value
		product2.name = "Delonghi V1 Kahve Makinesi";
		product2.unitPrice = 2500;
		product2.discount = 5;
		product2.unitsInStock = 3;
		product2.imageUrl = "bilmemne.jpg";
		Product[] products = { product1, product2};

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.name + "</li>");

		}
		System.out.println("</ul>");
		
		gercek hayatta bu sekil yazilmaz - veri kaynagindan gelir(db-database)
		Product.java kismina 'private' ekledigimiz icin en son hali ust kisimlardaki yorum satiri disinda olanlar gibidir. set-get
		
		 */

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");

		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demirog");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("053333333");
		corporateCustomer.setTaxtNumber("12345678912");
		corporateCustomer.setCustomerNumber("54321");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
		
		
		
		

	}

}
