package Project04;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * Representing Helper to help main function and test method
 * @author Yulong Chen
 * @version 1.0
 */
public class Helper {
	//create an object to call the method of AddressBook.
	AddressBook ad = new AddressBook();
	
	/**
	 * Start() function and test
	 * @throws Exception
	 */
	void start() throws Exception {
		//create an addressBook
		creatContact();
		
		//Test:
		Address address = new Address("1700", "Chong Qing", "CQ", "10000");
		//Test insert() method.
		ad.addContact(new Contact("Yulong", "Chen", address, "123-123-1234"));
		//Test search() method.
		System.out.println();
		System.out.println(ad.searchContact("Yulong Chen"));
		System.out.println(ad.searchContact("James Butt"));
		System.out.println("---------------------------------------------------------");
		//Test display() method.
		ad.display();
		//Test delete() method.
		//delete root node.(with two leafs)
		System.out.println(ad.deleteContact("James Butt"));
		//delete node with one leaf.
		System.out.println(ad.deleteContact("Youlanda Schemmer"));
		//delete leaf node.
		System.out.println(ad.deleteContact("Yulong Chen"));
	    System.out.println("---------------------------------------------------------");
		ad.display();
		System.out.println("---------------------------------------------------------");
		//Test get all same zipCode method.
	    show(ad.getZipCode("10011"));
	    System.out.println("---------------------------------------------------------");
	    //Test get all same city method.
	    show(ad.getCity("new York"));
	    System.out.println("---------------------------------------------------------");
	    //Test get all same state method.
	    show(ad.getState("NY"));
}


	/**
	 * Create a new contact
	 * @throws FileNotFoundException
	 */
	 void creatContact() throws FileNotFoundException {
		String first_name, last_name, street, city, state, zipcode, phone;
		Scanner sc = new Scanner(new File("project4 input data.txt"));
		//hasNext() read one line
		while(sc.hasNext()){
			//Read line one by one
			first_name = sc.nextLine();
			last_name = sc.nextLine();
			street = sc.nextLine();
			city = sc.nextLine();
			state = sc.nextLine();
			zipcode = sc.nextLine();
			phone = sc.nextLine();	
			//call Address constructor
			Address address = new Address(street, city, state, zipcode);
			//call Contact constructor
			Contact contact = new Contact(first_name, last_name, address, phone);
			//insert contact into AddressBook
			ad.addContact(contact);
		}
	}
	/**
	 * Show all element in linkedList<Contact>
	 * @param link The object of LinkedList
	 */
	 void show(LinkedList<Contact> link) {
		 if(link.size() == 0) {
			 System.out.println("There is not exist.");
		 }
		 Iterator<Contact> it = link.iterator();
		 while(it.hasNext()) {
	            System.out.println(it.next());
	        }
	 }

	
}
