
import java.util.*;

public class AddressBook 
{
	public ArrayList<BuddyInfo> ContactList;

	public AddressBook()
	{
		ContactList = new ArrayList<BuddyInfo>();
	}

	public boolean AddBuddy(String firstName, String lastName, int id)
	{
		if(FindIndex(firstName) == -1 )
		{
			ContactList.add(new BuddyInfo(firstName, lastName, id));
			return true;
		}
		return false;
	}

	public boolean AddBuddy(BuddyInfo buddy)
	{
		if(FindIndex(buddy.GetFirstName()) == -1 )
		{
			ContactList.add(buddy);
			return true;
		}
		return false;
	}

	public boolean RemoveBuddy(String firstName)
	{
		int removeIndex = FindIndex(firstName);
		if(removeIndex != -1)
		{
			ContactList.remove(removeIndex);
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean RemoveBuddy(int index)
	{
		if(index >= 0 && index < ContactList.size())
		{
			ContactList.remove(index);
			return true;
		}
		else
		{
			return false;
		}
	}

	public int NumberOfContacts()
	{
		return ContactList.size();
	}

	private int FindIndex(String firstName)
	{
		for (int i = 0; i < ContactList.size(); i++) 
		{
			BuddyInfo buddy = ContactList.get(i);
			if(buddy.GetFirstName().equalsIgnoreCase(firstName))
			{
				return i;
			}
		}
		return -1;
	}

	private boolean FalseTest()
	{
		return true;
	}
	
	
	public void Test(){
		
		//this is new test code for testing branches in GIT
		
		//online edits
		
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		BuddyInfo buddy = new BuddyInfo("Joe", "Last", 123);
		AddressBook book = new AddressBook();
		book.AddBuddy(buddy);
		book.RemoveBuddy(0);
		book.AddBuddy(buddy);
	}
}
