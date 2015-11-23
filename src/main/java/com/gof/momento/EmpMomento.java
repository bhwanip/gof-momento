package com.gof.momento;

public class EmpMomento {
	
	private int empId;
	private String empName;
	private String empPhone;
	private String empDesignation;
	
	public EmpMomento(int empId, String empName, String empPhone,
			String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empDesignation = empDesignation;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}
	

}
