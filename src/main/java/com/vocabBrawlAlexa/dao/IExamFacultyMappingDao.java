package com.vocabBrawlAlexa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.SExamFacultyMapping;
import entity.SExamFacultyMappingPK;

public interface IExamFacultyMappingDao extends IDataAccessObject, JpaRepository<SExamFacultyMapping, SExamFacultyMappingPK> {

	@Query("select id.examId from SExamFacultyMapping where id.facultyId=:facultyId and id.batchId=:batchId")
	Integer getExamId(@Param("facultyId") String facultyId,@Param("batchId") String batchId);

}

