package com.ies.kentucky.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="co_triggers")
@Entity

public class CoTriggers {
	@Id
	@Column(name="trg_id")
	private Integer triggerId;
	@Column(name="case_num")
	private Integer caseNum;
	@Column(name="trigger_status")
	private String triggerStatus;
	@Column(name="create_dt ")
	private String createDate;
	@Column(name="update_dt ")
	private String updateDate;

}


 