package com.ies.kentucky.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ies.kentucky.admin.entity.CitizenInformation;

public interface CitizenRepository extends JpaRepository<CitizenInformation, Integer> {

}
