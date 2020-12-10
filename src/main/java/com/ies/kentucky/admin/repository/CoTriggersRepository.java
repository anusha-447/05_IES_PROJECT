package com.ies.kentucky.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ies.kentucky.admin.entity.CoTriggers;

public interface CoTriggersRepository extends JpaRepository<CoTriggers, Integer> {

	
//	DECLARE
//	i number:=1;
//	trg_id number:=100;
//	case_no number:=1;
//	BEGIN
//	WHILE i <=5000 LOOP
//	    INSERT INTO CO_TRIGGERS(TRG_ID,CASE_NUM,CREATE_DT,TRG_STATUS,
//	    UPDATE_DT)VALUES(trg_id,case_no,sysdate,'P',null);    
//	    i:= i + 1;
//	    trg_id:=trg_id +1;
//	    case_no:=case_no+1;
//	  END LOOP;
//	END;
}
