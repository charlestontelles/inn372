/**
 * 
 */
package au.edu.qut.inn372.greenhat.bean;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

/**
 * @author Martin Daniel
 *
 */
public class AuthenticationServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2706630284498937074L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)             
    		throws IOException {       
    	UserService userService = UserServiceFactory.getUserService();   
    	User user = userService.getCurrentUser();     
    	if (user != null) {         
    		resp.sendRedirect("faces/input.jsp");
    	} 
    	else {    
    		resp.sendRedirect(userService.createLoginURL(req.getRequestURI()));      
    	}  
    }
}
