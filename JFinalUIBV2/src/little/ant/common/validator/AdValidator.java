package little.ant.common.validator;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;
import little.ant.common.model.Ad;

public class AdValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(AdValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/common/ad/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/common/ad/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Ad.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/common/ad/save")){
			controller.render("/common/xxx.html");
		
		} else if (actionKey.equals("/jf/common/ad/update")){
			controller.render("/common/xxx.html");
		
		}
	}
	
}
