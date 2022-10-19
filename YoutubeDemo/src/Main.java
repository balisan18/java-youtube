
public class Main {

	public static void main(String[] args) {
		CreditManager creditManager= new CreditManager();// örneğini oluşturmak,instance creation
		creditManager.Save();
		creditManager.Calculate();
		Customer customer = new Customer();
		customer.Id=1;
		customer.City="Bursa";
		
		CustomerManeger customerManeger = new CustomerManeger(customer,null);
		customerManeger.Save();
		customerManeger.Delete();
		Company company = new Company();
		company.TaxNumber="12345";
		company.CompanyName="Arçelik";
		company.Id=100;
		
		CustomerManeger customerManeger2 =new CustomerManeger(new Customer(),new TeacherCreditManager());
		customerManeger2.GiveCredit();
		
		Person person =new Person();
		person.NationalIdentity="123456789123";
		
		
		
		
		
		
		
		
		
	}

}
