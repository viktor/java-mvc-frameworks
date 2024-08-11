package com.strutsexample.app;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.strutsexample.app.entity.Employee;
import com.strutsexample.app.service.EmployeeService;

public class LoginAction extends Action {

	EmployeeService service = new EmployeeService();
	

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		LoginForm loginForm = (LoginForm) form;
		
		if (loginForm.getUsername() == null || loginForm.getPassword() == null
				|| !loginForm.getUsername().equalsIgnoreCase("victor")) {
			return mapping.findForward("failure");
		} else {
			List<Employee> list = service.getAll();
			
			StringBuilder sb = new StringBuilder();
			for(Employee e: list)
				sb.append(e.getFullName());
			
			loginForm.setMessage("Success!!");
			request.getSession().setAttribute("message", sb.toString());
			return mapping.findForward("success");
		}
	}

	
}
