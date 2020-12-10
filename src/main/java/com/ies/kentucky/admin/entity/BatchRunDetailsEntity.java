package com.ies.kentucky.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="BATCH_RUN_DTLS")
@Data
public class BatchRunDetailsEntity {
	@Id
	@GeneratedValue
	@Column(name="batch_run_sequnce")
	private Integer batchRunSequence;
	@Column(name="batch_name")
	private String batchName;
	@Column(name="batch_run_status")
	private String batchRunStatus;
	@Column(name="start_date")
	private Date startDate;
	@Column(name="end_date")
	private Date endDate;
	@Column(name="instance_num")
	private Integer instanceNum; 
	      
	 
}
