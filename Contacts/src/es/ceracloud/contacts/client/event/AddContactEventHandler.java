package es.ceracloud.contacts.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface AddContactEventHandler extends EventHandler {
	void onAddContact(AddContactEvent event);
}
