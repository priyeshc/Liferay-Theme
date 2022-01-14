package com.liferay.tasks.language.override;

import com.liferay.portal.kernel.language.UTF8Control;

import java.util.Enumeration;
import java.util.ResourceBundle;

//import com.liferay.admin.kernel.util.Omniadmin;

import org.osgi.service.component.annotations.Component;

/**
 * @author Argil DX
 */
@Component(immediate = true, property = { "language.id=en_US" }, service = ResourceBundle.class)
public class LanguagePropGlobal extends ResourceBundle {

	@Override
	public Enumeration<String> getKeys() {
		
		return _resourceBundle.getKeys();
	}

	@Override
	protected Object handleGetObject(String key) {

		return _resourceBundle.getObject(key);
	}

	private final ResourceBundle _resourceBundle = ResourceBundle.getBundle("content.Language", UTF8Control.INSTANCE);

	// TODO enter required service methods

}