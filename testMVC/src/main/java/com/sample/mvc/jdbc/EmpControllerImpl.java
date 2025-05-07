package com.sample.mvc.jdbc;

import java.text.DecimalFormat;
import java.util.List;

public class EmpControllerImpl implements EmpController{
	private EmpDAO empDAO;

	@Override
	public void getEmpList() {
		try {
			List<EmpVO> empList=empDAO.getEmpList();
			for(EmpVO e:empList) {
				System.out.println(">>>>>"+e);
			}
			DecimalFormat dc = new DecimalFormat("#,###��");
			System.out.println("�� �޿��հ� : " +
			  dc.format(empDAO.getTotalSal()));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}//getEmpList()

	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}
}
