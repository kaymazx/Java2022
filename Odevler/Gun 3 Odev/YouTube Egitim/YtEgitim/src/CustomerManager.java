
public class CustomerManager {
	private Customer _customer;
	public CustomerManager(Customer customer) {
		_customer=customer;
	}
	public void Save() {
		System.out.println("Musteri Eklendi : " +_customer.FirstName +" "+ _customer.LastName );
	}
	public void Delete() {
		System.out.println("Musteri Silindi : " +_customer.FirstName  +" "+ _customer.LastName );
	}
	
}
