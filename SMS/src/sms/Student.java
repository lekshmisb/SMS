package sms;

public class Student 
{
	private int adm_no;
	private String student_name,student_DOB,guardian_name,role,email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAdm_no() {
		return adm_no;
	}
	public void setAdm_no(int adm_no) {
		this.adm_no = adm_no;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_DOB() {
		return student_DOB;
	}
	public void setStudent_DOB(String student_DOB) {
		this.student_DOB = student_DOB;
	}
	public String getGuardian_name() {
		return guardian_name;
	}
	public void setGuardian_name(String guardian_name) {
		this.guardian_name = guardian_name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
