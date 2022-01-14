package com.liferay.tasks.login.events;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

/**
 * @author Argil DX
 */
@Component(
	immediate = true,
	property = {
			"key=login.events.post"
	},
	service = LifecycleAction.class
)
public class CustomLoginPostAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		
		System.out.println("CustomLoginPostAction Start");
		long userId = 0;
    	HttpServletRequest request = lifecycleEvent.getRequest();
    	try {
			userId = PortalUtil.getUser(request).getUserId();
		} catch (PortalException e) {
			e.printStackTrace();
		}
		System.out.println("login.event.post, userId : " +userId);
		System.out.println("CustomLoginPostAction End");
	}
		
	

	// TODO enter required service methods

}
