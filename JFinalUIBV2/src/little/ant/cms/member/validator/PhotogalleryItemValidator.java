package little.ant.cms.member.validator;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;
import little.ant.cms.model.PhotogalleryItem;

public class PhotogalleryItemValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(PhotogalleryItemValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/cms/member/photogalleryItem/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/cms/member/photogalleryItem/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(PhotogalleryItem.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/cms/member/photogalleryItem/save")){
			controller.render("/cms/member/xxx.html");
		
		} else if (actionKey.equals("/jf/cms/member/photogalleryItem/update")){
			controller.render("/cms/member/xxx.html");
		
		}
	}
	
}