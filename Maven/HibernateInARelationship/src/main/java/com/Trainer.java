package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Trainer {
@Id
private int tid;
private String tname;
private String tech;

@OneToMany(mappedBy = "tsid",cascade = CascadeType.ALL)	//using tainer we can store, delete, update and retrieve 
private List<Student> numberOfStd;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public List<Student> getNumberOfStd() {
	return numberOfStd;
}
public void setNumberOfStd(List<Student> numberOfStd) {
	this.numberOfStd = numberOfStd;
}

}
