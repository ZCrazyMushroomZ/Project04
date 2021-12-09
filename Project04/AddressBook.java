package Project04;
import java.util.LinkedList;
/**
 * Represents AddressBook.
 * @author Yulong Chen
 * @data 2021Äê12ÔÂ7ÈÕ
 * @version 1.0
 */
public class AddressBook {
	/**
	 * The reference of BinarySearchTree
	 */
	private BinarySearchTree<Contact> tree;
	/**
	 * Records the number of books
	 */
	private int count;
	/**
	 * Constructs a new AddressBook
	 */
	public AddressBook() {
		tree = new BinarySearchTree<Contact>();
		count = 0;
	}
	/**
	 * Add contacts into tree
	 * @param contact The reference of Contact
	 */
	public void addContact(Contact contact) {
		this.tree.insert(contact);
		this.count++;
	}
	/**
	 * Search a contact when inputting a name
	 * @param name The value of name
	 * @return All elements of contact
	 * @throws TreeException
	 */
	public String searchContact(String name) throws TreeException {  	
        Contact con = getContact(name);
        if(con == null) {
        	throw new TreeException(name + " is not exist in the concact.");
        }else {
        	return con.toString();
        }  
    }
	
	/**
	 * Delete a contact
	 * @param name The value of name
	 * @return The deleted contact
	 * @throws TreeException
	 */
	public String deleteContact(String name) throws TreeException {
		Contact con = getContact(name);
		if(con == null) {
        	throw new TreeException(name + " is not exist in the concact.");
        }else {
        	this.tree.delete(con);
        	count--;
        	System.out.println(name + " have been deleted:");
        	return con.toString();
        }
	}
	/**
	 * Get the reference of contact
	 * @param name The value of name
	 * @return The reference of contact
	 */
	public Contact getContact(String name) {
		TreeIterator<Contact> lterator = new TreeIterator<Contact>(tree);
		lterator.setInorder();
	while (lterator.hasNext()) {
		Contact contact1 = lterator.next();
		if (contact1.getName().equals(name)) {
			return contact1;
		}
	}
	return null;
	}
	/**
	 * Get all same zipCode of contact
	 * @param zipCode The value of zipCode
	 * @return the reference of LinkedList<Contact> 
	 */
	public LinkedList<Contact> getZipCode(String zipCode) {
		TreeIterator<Contact> lterator = new TreeIterator<Contact>(tree);
		LinkedList<Contact> arr = new LinkedList<>();
		lterator.setInorder();
	while (lterator.hasNext()) {
		Contact contact1 = lterator.next();
		if(contact1.getAddress().getZipCode().equals(zipCode)) {//if equivalence, add contact into LinkedList
			arr.add(contact1);
		}
	}
	    System.out.println("zipCode: " + zipCode);
	    return arr;
	}
	/**
	 * Get all same city of addressBook
	 * @param city The value of city
	 * @return The reference of LinkedList<Contact>
	 */
	public LinkedList<Contact> getCity(String city) {
		TreeIterator<Contact> lterator = new TreeIterator<Contact>(tree);
		LinkedList<Contact> arr = new LinkedList<>();
		lterator.setInorder();
	while (lterator.hasNext()) {
		Contact contact1 = lterator.next();
		if(contact1.getAddress().getCity().equals(city)) {//if equivalence, add contact into LinkedList
			arr.add(contact1);
		}
	}
	    System.out.println("city: " + city);
	    return arr;
	}
	/**
	 *  Get all same state of contact
	 * @param state The value of state
	 * @return The reference of LinkedList<Contact>
	 */
	public LinkedList<Contact> getState(String state) {
		TreeIterator<Contact> lterator = new TreeIterator<Contact>(tree);
		LinkedList<Contact> arr = new LinkedList<>();
		lterator.setInorder();
	while (lterator.hasNext()) {
		Contact contact1 = lterator.next();
		if(contact1.getAddress().getState().equals(state)) {//if equivalence, add contact into LinkedList
			arr.add(contact1);
		}
	}
	    System.out.println("state: " + state);
	    return arr;
	}
	/**
	 * Determine whether the addressBook is empty
	 * @return true: the addressBook is empty, false: not empty
	 */
	public boolean isEmpty() {
		return count == 0;
	}
	/**
	 * Delete all elements in the addressBook
	 */
	public void clear() {
		this.tree.makeEmpty();
	}
	/**
	 * Show all elements in the addressBook
	 */
	public void display() {
		TreeIterator<Contact> lterator = new TreeIterator<Contact>(tree);
		lterator.setInorder();
		while (lterator.hasNext()) {
			System.out.println(lterator.next());
		}
	}
}
