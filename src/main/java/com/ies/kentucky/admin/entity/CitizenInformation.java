package com.ies.kentucky.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="citizen_table")
@Entity
public class CitizenInformation {

	
	@Id
	@GeneratedValue
	@Column(name="ctzn_id")
    private Integer citizen_id;
	@Column(name="ssn_number")
	private Long ssnNumber;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="dob")
	private String DOB;
	@Column(name="gender")
	private String gender;
	@Column(name="ctzn_mail")
	private String email;
	@Column(name="ctzn_mobile")
	private String phone;
}
