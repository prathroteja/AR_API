package in.jam.binding;

import java.time.LocalDate;

import lombok.Data;

//@Data
public class CitizenApp {
	
private String fullname;
private String email;
private Long phno;
private String gender;
private Long ssn;
private LocalDate dob;
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhno() {
	return phno;
}
public void setPhno(Long phno) {
	this.phno = phno;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Long getSsn() {
	return ssn;
}
public void setSsn(Long ssn) {
	this.ssn = ssn;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
@Override
public String toString() {
	return "CitizenApp [fullname=" + fullname + ", email=" + email + ", phno=" + phno + ", gender=" + gender + ", ssn="
			+ ssn + ", dob=" + dob + "]";
}

	

}
