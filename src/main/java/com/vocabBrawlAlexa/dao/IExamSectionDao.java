package com.vocabBrawlAlexa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.SExamSection;
import entity.SExamType;

public interface IExamSectionDao  extends IDataAccessObject, JpaRepository<SExamSection, Integer>  {

	@Query("from SExamSection where id.examId=:examId")
	List<SExamSection> getSections(@Param("examId") Integer examId);

	@Query("from SExamSection where id.examId=:examId")
	List<SExamSection> getSectionForGre(@Param("examId") Integer examId);
	
	@Query("from SExamSection where id.examId in (:examId,:examId1)")
	List<SExamSection> getSectionForTwo(@Param("examId") Integer examId,@Param("examId1") Integer examId1);

}
