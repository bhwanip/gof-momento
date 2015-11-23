package com.gof.momento;

public class EmpOriginator {

	private int empId;
	private String empName;
	private String empPhone;
	private String empDesignation;

	public EmpOriginator(int empId, String empName, String empPhone,
			String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empDesignation = empDesignation;
	}

	public EmpMomento saveToMomento() {
		EmpMomento momento = new EmpMomento(getEmpId(), getEmpName(), getEmpPhone(), getEmpDesignation());
		return momento;
	}

	public void recoverFromMomento(EmpMomento momento) {
		this.empId = momento.getEmpId();
		this.empName = momento.getEmpName();
		this.empPhone = momento.getEmpPhone();
		this.empDesignation = momento.getEmpDesignation();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	@Override
	public String toString() {
		return "EmpOriginator [empId=" + empId + ", empName=" + empName
				+ ", empPhone=" + empPhone + ", empDesignation="
				+ empDesignation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((empDesignation == null) ? 0 : empDesignation.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result
				+ ((empPhone == null) ? 0 : empPhone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpOriginator other = (EmpOriginator) obj;
		if (empDesignation == null) {
			if (other.empDesignation != null)
				return false;
		} else if (!empDesignation.equals(other.empDesignation))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empPhone == null) {
			if (other.empPhone != null)
				return false;
		} else if (!empPhone.equals(other.empPhone))
			return false;
		return true;
	}


}
