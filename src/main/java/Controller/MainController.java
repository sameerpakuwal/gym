package Controller;

import org.springframework.web.servlet.ModelAndView;

import model.Login;


public class MainController {
	
	public ModelAndView  loginPage(Login login) {
		
		ModelAndView mv = new ModelAndView();
		
		
		String user = "Sameer";
		String pass = "1234";
		
		if (login.getUsername().equalsIgnoreCase(user)) {
			if(login.getPassword().equalsIgnoreCase(pass)) {
				
				mv.setViewName("emplist");
			}
		} else
		{
			mv.setViewName("index");
		}
		
		return mv;
		
		
		
	}
	

}
