package in.ineuron.dto;

public class Employee {
	private Integer eno;
	private String ename;
	private String desg;
	private Double salary;

	public Employee() {
		System.out.println("Employee...Zero param Constructor used by DispatcherServlet");
	}

	public Employee(Integer eno, String ename, String desg, Double salary) {
		System.out.println("Employee... all arg constrcutor");
		this.eno = eno;
		this.ename = ename;
		this.desg = desg;
		this.salary = salary;
	}

	public Integer getEno() {
		System.out.println("Employee.getEno()");
		return eno;
	}

	public void setEno(Integer eno) {
		System.out.println("Employee.setEno()");
		this.eno = eno;
	}

	public String getEname() {
		System.out.println("Employee.getEname()");
		return ename;
	}

	public void setEname(String ename) {
		System.out.println("Employee.setEname()");
		this.ename = ename;
	}

	public String getDesg() {
		System.out.println("Employee.getDesg()");
		return desg;
	}

	public void setDesg(String desg) {
		System.out.println("Employee.setDesg()");
		this.desg = desg;
	}

	public Double getSalary() {
		System.out.println("Employee.getSalary()");
		return salary;
	}

	public void setSalary(Double salary) {
		System.out.println("Employee.setSalary()");
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", desg=" + desg + ", salary=" + salary + "]";
	}
	
}
