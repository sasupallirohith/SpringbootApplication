package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="complaint_table")
public class Complaint
{
  @Column(nullable = false,length = 200)
  private String name;
  @Column(nullable = false,length = 20000)
  private String cmplaint;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCmplaint() {
	return cmplaint;
}
public void setCmplaint(String cmplaint) {
	this.cmplaint = cmplaint;
}

}