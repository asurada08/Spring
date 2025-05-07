package com.sample.mvc.jdbc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmpDelete extends AbstractController{
	private static final Logger logger=LoggerFactory.getLogger(EmpDelete.class);
	private EmpDAO empDAO;
	
	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}

	@Override
	protected ModelAndView handleRequestInternal
	(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int empno=Integer.parseInt(req.getParameter("empno"));
		logger.info("������ȣ: "+empno);
		try {
			empDAO.deleteEmp(empno);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return new ModelAndView("redirect:empList");
	}
	
	

}
