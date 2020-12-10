package com.ies.kentucky.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="eligibility_details")
@Data
public class EligibilityDetails {
    @Id
	@Column(name="ed_trace_id")
    @GeneratedValue
	private Integer edTraceId;
    @Column(name="case_num")
    private Integer caseNum;
    @Column(name="denial_reason")
    private String denialReason;
    @Column(name="benefit_amt")
    private Long benfirAmount;
    @Column(name="plan_status")
    private String planStatus;
    @Column(name = "create_dt")
	@CreationTimestamp
	private Date creationDate;
	@Column(name = "update_dt")
	@UpdateTimestamp
	private Date upadatedDate;
	@Column(name = "plan_name")
	private String planName;
	@Column(name = "plan_end_dt")
	private String planEndDate;
	@Column(name = "plan_start_dt")
	private String planStartName;
   



}
