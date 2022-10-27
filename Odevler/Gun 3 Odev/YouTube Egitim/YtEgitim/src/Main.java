
public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		// stack-heap
		System.out.println(sayi1);

		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 10, 20, 30 };
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		System.out.println(sayilar1[0]);

		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();

		Customer customer = new Customer(); // instance creation
		customer.Id = 1;
		customer.FirstName = "Engin";
		customer.LastName = "Demirog";
		customer.City = "Ankara";

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Save();
		customerManager.Delete();
		customerManager.Delete();

		Company company = new Company();
		company.TaxNumber="100000";
		
		Person person = new Person();
		person.FirstName="Engin";
		person.NationalIdentity="12313";

	}
}
