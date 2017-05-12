package ph.com.alliance.controller.view;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ph.com.alliance.entity.User;

/**
 * Example controller class that hadles static view requests. All requests that
 * returns pages (html, xhtml, jsp, jspx, etc.) is handled here.
 *
 */
@Controller
@RequestMapping("/calculator")
public class CalculatorController {

	/**
	 * 
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String viewProfile(User myUser, ModelMap map,
			HttpServletRequest request) {
		System.out
				.println("@/modulename/profile MODULE VIEW CONTROLLER CALLED.");
		String uid = request.getParameter("uid");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		System.out.println("THIS IS UID == " + uid);
		System.out.println("THIS IS FNAME == " + fname);
		System.out.println("THIS IS LNAME == " + lname);
		String[] fnames = request.getParameterValues("fname");
		if (null != fnames && fnames.length > 0) {
			for (String ffffname : fnames) {
				System.out.println("THIS IS FNAME " + ffffname);
			}
		}

		System.out.println("THIS IS OBJECT UID == " + myUser.getUid());
		System.out.println("THIS IS OBJECT FNAME == " + myUser.getFname());
		System.out.println("THIS IS OBJECT LNAME == " + myUser.getLname());

		if (null != myUser.getTestField() && myUser.getTestField().length > 0) {
			for (String ffffname : myUser.getTestField()) {
				System.out.println("THIS IS OBJECT TFIELD " + ffffname);
			}
		}
		List<User> myUserList = new ArrayList<User>();
		User kenneth = new User();
		kenneth.setFname("kenneth");
		myUserList.add(kenneth);
		
		User louis = new User();
		louis.setFname("louis");
		myUserList.add(louis);
		
		
		if (null != uid && uid.equals("HOHOHO")) {
			map.put("myString", "HAHAHAHA");
			map.put("myUser", myUser);
		} else {
			map.put("myString", "HUHUHU");
		}
		map.put("myUserList", myUserList);
		
		return "users/profile";
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/messages", method = RequestMethod.GET)
	public String viewMessages(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		System.out
				.println("@/modulename/messages MODULE VIEW CONTROLLER CALLED.");
		return "messages";
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/userform", method = RequestMethod.GET)
	public String viewUserForm(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		System.out
				.println("@/modulename/userform MODULE VIEW CONTROLLER CALLED.");
		return "userform";
	}
}
