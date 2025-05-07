package com.sample.mvc.jdbc;

import java.util.List;

public interface EmpDAO {
	List<EmpVO> getEmpList() throws Exception;
	int getTotalSal();
	List<DeptVO> getDeptList();
	//삽입 삭제 select 수정
	void insertEmp(EmpVO evo) throws Exception;
	void deleteEmp(int empno) throws Exception;
	EmpVO getEmp(int empno) throws Exception;
	void updateEmp(EmpVO evo) throws Exception;
	//jsp들은 --> empInsert.jsp, empUpdate.jsp
	//EmpInsertAction.java, EmpUpdate.java, 
	//EmpUpdateAction.java
	//EmpDelete.java

}
