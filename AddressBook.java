package BridgeLabz.AddressBook;
import java.util.*;

public class AddressBook 
{
	    private Contacts[] names; 
	    private int numOfContact;

	    public AddressBook() 
	    {
	                names = new Contacts[10];
	                numOfContact = 0;
	    }

	    public void addcontact(Contacts c)
	    {
	                names[numOfContact] = c;
	                numOfContact++;

	    }
	    public int contactsCount()
	    {
            return numOfContact;
}

	    public static void menu()
	    {
            System.out.println("1.Add a new contact to your address book.");
	    }
	    public static void main(String[] args) 
	    {
	         Scanner sc = new Scanner(System.in);
	         AddressBook cont = new AddressBook();
	         System.out.println("Welcome to Address Book Program");
	         menu();
	         
	         if (cont.contactsCount() < 10)
	         {
                   System.out.print("Enter First name: ");
                   String fname = sc.next();
                   System.out.print("Enter Last name: "); 
                   String lname = sc.next();
                   sc.nextLine();
                   System.out.print("Enter Address: ");
                   String add = sc.nextLine();
                   System.out.print("Enter City name: ");
                   String city = sc.next();
                   System.out.print("Enter State name: ");
                   String state = sc.next();
                   System.out.print("Enter Phone number: ");
                   long pnumber = sc.nextLong();
                   System.out.print("Enter Zip Code: ");
                   long zip = sc.nextLong();
	                       
                   cont.addcontact(new Contacts(fname,lname,add,city,state,pnumber,zip));
              }
              else
              {
            	  System.out.println("Sorry, can not add anyone, your AddressBook is full.");
	                    
              }
	         
	    }
	}


