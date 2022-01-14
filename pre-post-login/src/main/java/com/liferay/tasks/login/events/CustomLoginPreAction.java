package com.liferay.tasks.login.events;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"key=login.events.pre"
		},
		service = LifecycleAction.class
	)

public class CustomLoginPreAction implements LifecycleAction{

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		
		System.out.println("CustomLoginPreAction Start");
		long userId = 0;
    	HttpServletRequest request = lifecycleEvent.getRequest();
    	try {
			userId = PortalUtil.getUser(request).getUserId();
		} catch (PortalException e) {
			e.printStackTrace();
		}
		System.out.println("login.event.pre, userId : " +userId);
		System.out.println("CustomLoginPreAction End");
		
	}

}
