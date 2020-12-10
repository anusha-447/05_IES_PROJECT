package com.ies.kentucky.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
@Entity
@Table(name = "CO_PDFS")
public class CoPdfs {
	
	@Id()
	@GeneratedValue
	@Column(name = "CO_PDF_ID")
	Integer coPdfId;

	@Column(name = "CASE_NUMBER")
	String caseNumber;

	@Lob
	@Column(name = "PDF_DOCUMENT", length = 100000)
	byte[] pdfDocument;

	@Column(name = "PLAN_NAME")
	String planName;

	@Column(name = "PLAN_STATUS")
	String PlanStatus;

}
