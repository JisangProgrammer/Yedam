package DB;

import java.util.Formatter;

public class EmployeeDTO {
	private String employeeId;
	private String firstName;
	private String lastName;
	private String eMail;
	private String jobId;
	private String hireDate;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		Formatter fm = new Formatter();
		String result = fm.format("%6s\t %-10s\t %-10s\t %-10s\t %-10s\t %-10s", employeeId, firstName, lastName, eMail, jobId, hireDate).toString();
//		return "EmployeeDTO [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", eMail=" + eMail + ", jobId=" + jobId + ", hireDate=" + hireDate + "]";
		return result;
		
	}
}
