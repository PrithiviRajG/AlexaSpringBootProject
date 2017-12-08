/**
 * 
 */
package com.vocabBrawlAlexa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.SExamType;

/**
 * @author Prithivi
 *
 */
public interface IExamTypeDao extends IDataAccessObject, JpaRepository<SExamType, Integer>{

	@Query("select examName from SExamType where id.examId=:exam")
	String findExamName(@Param("exam") int exam);

}
