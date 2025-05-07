package com.sample.mvc.jdbc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmpInsertAction extends AbstractController{
	public static final Logger logger=LoggerFactory.getLogger(EmpInsertAction.class);
	
	private EmpDAO empDAO;


	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}

	@Override
	protected ModelAndView handleRequestInternal
	(HttpServletRequest request, HttpServletResponse response)	throws Exception {
		String ename = request.getParameter("ename");
		int sal=Integer.parseInt(request.getParameter("sal"));
		int deptno=Integer.parseInt(request.getParameter("deptVO.deptno"));
		DeptVO dvo= new DeptVO();
		dvo.setDeptno(deptno);
		
		EmpVO evo = new EmpVO();
		evo.setEname(ename);
		evo.setSal(sal);
		//�߰��� �κ�
		evo.setEmpno(deptno);
		
		evo.setDeptVO(dvo);
		
		try {
			empDAO.insertEmp(evo);
			return new ModelAndView("redirect:empList"); // �ڵ����� empList.jsp�� ��
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(e.getMessage());
			
			return null;
		}
		
	}

}
