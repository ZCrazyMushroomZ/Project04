package Project04;
/**
 * Representing Contact contains name, city, phone, firstName, lastName, the object of address
 * @author Yulong Chen
 * @version 1.0
 */
public class Contact implements Comparable<Contact>{
	@SuppressWarnings("unused")
	private String name;
	private String phone;
	private String firstName;
	private String lastName;
	private Address address;
	/**
	 * Constructor contains 0 elements
	 */
	public Contact() { };
	/**
	 * Create a Contact Constructor contains firstName, lastName, address object, phone.
	 * @param firstName The value of firstName
	 * @param lastName The value of lastName
	 * @param address The object of address
	 * @param phone The value of phone
	 */
	public Contact(String firstName, String lastName,Address address, String phone){
		this.firstName = firstName;
	    this.lastName = lastName;
	    this.address=address;
	    this.phone = phone; 
	}
	/**
	 * Return the value of Name(firstName + " " + lastName)
	 * @return The value of Name(firstName + " " + lastName)
	 */
	public String getName() {
		return firstName + " " + lastName;
	}
    /**
     * Change the value of name
     * @param name The value of name
     */
	public void setName(String name) {
		this.name = firstName + " " + lastName;
	}
    /**
     * Return the value of phone
     * @return The value of phone
     */
	public String getPhone() {
		return phone;
	}
    /**
     * Change the value of phone
     * @param phone the value of phone
     */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
     * Return the value of firstName
     * @return The value of firstName
     */
	public String getFirstName() {
		return firstName;
	}
    /**
     * Change the value of firstName
     * @param firstName The value of fistName
     */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
     * Return the value of lastName
     * @return The value of lastName
     */
	public String getLastName() {
		return lastName;
	}
    /**
     * Change the value of lastName
     * @param lastName The value of lastName
     */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
     * Return the object of address
     * @return The object of address
     */
	public Address getAddress() {
		return address;
	}
    /**
     * Change the object of address
     * @param address The object of address
     */
	public void setAddress(Address address) {
		this.address = address;
	}
    /**
     * Show all elements of addressBook
     */
	public String toString() {
		return firstName + " " + lastName + "\t" 
		+  address.getStreet() + "\t" + address.getCity()
		+ "\t" + address.getState()+ "\t" + address.getZipCode() + "\t" + phone;
	}
	/**
	 * Compare two values of name
	 * @param Contact The object of contact
	 */
	@Override
	public int compareTo(Contact o) {//return 1 if getName > o.getName();
		String str1 = this.getFirstName() +" " + this.getLastName();
		String str2 = o.getFirstName() +" " + o.getLastName();
		return str1.compareTo(str2);
	}

}
