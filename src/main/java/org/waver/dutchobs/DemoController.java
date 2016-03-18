package org.waver.dutchobs;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * test
 * @author pauw
 *
 */
@Service
@RequestMapping(value = "/")
public class DemoController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	@ResponseBody
	public String showSomething(){
		String returnString = "";
		returnString+=System.getProperties();
		return returnString;
	}

}
