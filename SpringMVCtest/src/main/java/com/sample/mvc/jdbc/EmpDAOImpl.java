package com.sample.mvc.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDAOImpl implements EmpDAO {
	//드라이버 로딩, 커넥션, 문장객체, SQL문, 트랜잭션을 모두 관리
	private JdbcTemplate jdbcTemplate; 
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<EmpVO> getEmpList() throws Exception {
		/*
		ResultSet의 행을 행 단위로 매핑하기 위해서 jdbcTemplate이 사용하는 
		인터페이스. 이 인터페이스의 구현은 각 행을 결과 객체에 매핑하는 실제작업을 
		수행하지만 예외 처리는 자동으로 해준다.
		*/	
		RowMapper rowMapper = new RowMapper() {
		/*	
		구현시 ResultSet의 각 데이터 행을 매핑하려면 이 메서드를 구현해야 한다.
		이 메소드는 ResultSet의 next()를 호출하면 x
		현재 행의 값을 맵핑.
		*/	
			@Override
			public Object mapRow(ResultSet rs, int rownum) throws SQLException {
				EmpVO empVo = new EmpVO();
				empVo.setEmpno(rs.getInt("empno"));
				empVo.setEname(rs.getString("ename"));
				empVo.setSal(rs.getInt("sal"));
				
				DeptVO deptVo = new DeptVO();
				deptVo.setDname(rs.getString("dname"));
				deptVo.setDeptno(rs.getInt("empno"));
				empVo.setDeptVO(deptVo);
				return empVo;
			}
		
		};
		StringBuffer sql = new StringBuffer();
		sql.append("select a.empno, a.ename, a.sal, b.dname from t_emp a, T_DEPT b where a.deptno=b.deptno order by empno");
		// 지정된 쿼리를 실행하여 RowMpper를 통해 각 행을 java 객체에 매핑한다
		return jdbcTemplate.query(sql.toString(), rowMapper);
	}//getEmpList()

	@Override
	public int getTotalSal() {
		StringBuffer sql = new StringBuffer();
		sql.append("select sum(sal) as sumsal from t_emp");
		return jdbcTemplate.queryForInt(sql.toString());
	}

	@Override
	public List<DeptVO> getDeptList() {
		StringBuffer sql = new StringBuffer();
		sql.append("select deptno, dname from t_dept order by deptno asc");
		
		RowMapper rowMapper = new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rownum) throws SQLException {
				DeptVO deptVO = new DeptVO();
				
				deptVO.setDeptno(rs.getInt("deptno"));
				deptVO.setDname(rs.getString("dname"));
				return deptVO;
			}
			
		};
		return jdbcTemplate.query(sql.toString(), rowMapper);
	}
	//1. 삽입, 삭제, 검색, 수정
	@Override
	public void insertEmp(EmpVO evo) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into t_emp(empno, ename, sal, deptno) values(seq_emp.nextval,?,?,? )");
		Object[] args = { evo.getEname(), evo.getSal(), evo.getDeptVO().getDeptno() };
		jdbcTemplate.update(sql.toString(), args);
	}
	
	//2. 삭제
	@Override
	public void deleteEmp(int empno) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from t_emp where empno=?");
		jdbcTemplate.update(sql.toString(), new Object[] {empno});
	}
	
	//3. 검색
	@SuppressWarnings("unchecked")
	@Override
	public EmpVO getEmp(int empno) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append("select empno, ename, sal, deptno from t_emp where empno = ?");
		
		RowMapper rowMapper = new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rownum) throws SQLException {
				EmpVO empVo = new EmpVO();
				empVo.setEmpno(rs.getInt("empno"));
				empVo.setEname(rs.getString("ename"));
				empVo.setSal(rs.getInt("sal"));
				
				DeptVO deptVO = new DeptVO();
				deptVO.setDeptno(rs.getInt("deptno"));
				
				empVo.setDeptVO(deptVO);
				return empVo;
			}
			
		};
		return (EmpVO) jdbcTemplate.queryForObject(sql.toString(), new Object[] {empno}, rowMapper);
	}
	
	//4. 수정
	@Override
	public void updateEmp(EmpVO evo) throws Exception {
		StringBuffer sql= new StringBuffer();
		sql.append("update t_emp a ");
		sql.append("set ename=?  ");
		sql.append(" , sal=? ");
		sql.append(" , deptno=? ");
		sql.append("where empno = ? ");
		
		Object[] args = {
				evo.getEname(),
				evo.getSal(),
				evo.getDeptVO().getDeptno(),
				evo.getEmpno()
		};
		jdbcTemplate.update(sql.toString(),args);
	}

}
