package in.ineuron.dto;

public class Employee {
	private Integer eno;
	private String ename;
	private String desg;
	private Double salary;

	public Employee() {
	}

	public Employee(Integer eno, String ename, String desg, Double salary) {
		this.eno = eno;
		this.ename = ename;
		this.desg = desg;
		this.salary = salary;
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
