/**
 * 
 */
package com.vocabBrawlAlexa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.SExamType;

/**
 * @author Prithivi
 *
 */
public interface IExamDAO  extends IDataAccessObject, JpaRepository<SExamType, Integer> {
	
	@Query("Select combineValue From ProcedureCombine")
	int getProcedureCombine();
	
	@Query("from SExamType where id.examId in (:examId,:examId1)")
	List<SExamType> getExamTypeForTwo(@Param("examId") Integer examId,@Param("examId1") Integer examId1);

}
