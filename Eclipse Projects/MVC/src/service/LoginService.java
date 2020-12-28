package service;

import bean.Login;
import dao.LoginDao;

public class LoginService {

		public String checkUser(Login ll) {
		/*	if(ll.getUser().equals("Ravi") && ll.getPass().equals("123")) {
					return "Success";
			}else {
				return "Failure";
			}*/
			LoginDao ld = new LoginDao();
			//Term and condition 
			if(ld.checkUser(ll)) {
				return "Success";
			}else {
				return "Failure";
			}
		}
}
