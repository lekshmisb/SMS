package sms;

public class Staff 
{
// store and manage data related to a staff member	
	
 private String teacher_Name,teacher_Gender,role,teacher_email,teacher_password,teacher_DOB,teacher_Course;
//Getter method to access the private variable
public String getTeacher_Name() {  // getTeacher_Name() method returns the value of teacher_Name.
	return teacher_Name;
}
// Setter method to modify the private variable
public void setTeacher_Name(String teacher_Name) { // setTeacher_Name(String teacher_Name) method allows the user to modify the teacher_Name variable.
	this.teacher_Name = teacher_Name;
}

public String getTeacher_Gender() {
	return teacher_Gender;
}

public void setTeacher_Gender(String teacher_Gender) {
	this.teacher_Gender = teacher_Gender;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getTeacher_email() {
	return teacher_email;
}

public void setTeacher_email(String teacher_email) {
	this.teacher_email = teacher_email;
}

public String getTeacher_password() {
	return teacher_password;
}

public void setTeacher_password(String teacher_password) {
	this.teacher_password = teacher_password;
}

public String getTeacher_DOB() {
	return teacher_DOB;
}

public void setTeacher_DOB(String teacher_DOB) {
	this.teacher_DOB = teacher_DOB;
}

public String getTeacher_Course() {
	return teacher_Course;
}

public void setTeacher_Course(String teacher_Course) {
	this.teacher_Course = teacher_Course;
}
 
}
