package es.ceracloud.contacts.client.common;

import java.util.ArrayList;
import java.util.List;

import es.ceracloud.contacts.shared.ContactDetails;

public class ContactsColumnDefinitionsFactory<T> {
	
	public static List<ColumnDefinition<ContactDetails>> getContactsColumnDefinitions() {
		return ContactsColumnDefinitionsImpl.getInstance();
	}

	public static List<ColumnDefinition<ContactDetails>> getTestContactsColumnDefinitions() {
		return new ArrayList<ColumnDefinition<ContactDetails>>();
	}
	
}
