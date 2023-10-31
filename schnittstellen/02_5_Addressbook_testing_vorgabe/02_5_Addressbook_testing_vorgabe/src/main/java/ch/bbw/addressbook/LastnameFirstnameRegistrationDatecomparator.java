package ch.bbw.addressbook;

import java.util.Comparator;

public class LastnameFirstnameRegistrationDatecomparator implements Comparator<Address> {

	@Override
	public int compare(Address a1, Address a2) {
		int result = a1.getLastname().compareTo(a2.getLastname());
		if (result == 0) {
			result = a1.getFirstname().compareTo(a2.getFirstname());
			if (result == 0) {
				result = a1.getRegistrationDate().compareTo(a2.getRegistrationDate());
				if (result == 0) {
					result = a1.getPhonenumber().compareTo(a2.getPhonenumber());
				}
			}
		}
		return result;
	}
	

}
