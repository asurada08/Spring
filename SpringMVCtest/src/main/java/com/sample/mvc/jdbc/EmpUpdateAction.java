package com.sample.mvc.jdbc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmpUpdateAction extends AbstractController{
	private static final Logger logger = LoggerFactory.getLogger(EmpInsert.class);

	private EmpDAO empDAO;
		
	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int empno = Integer.parseInt(request.getParameter("empno"));
		String ename = request.getParameter("ename");
		int sal = Integer.parseInt(request.getParameter("sal"));
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		
		DeptVO dvo = new DeptVO();
		dvo.setDeptno(deptno);
		
		EmpVO evo = new EmpVO();
		evo.setEmpno(empno);
		evo.setEname(ename);
		evo.setSal(sal);
		evo.setDeptVO(dvo);
		
		try {
			empDAO.updateEmp(evo);
			return new ModelAndView("redirect:empList");
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(e.getMessage());
			return null;
		}
	}

}
