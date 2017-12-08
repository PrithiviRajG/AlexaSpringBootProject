/**
 * 
 */
package com.vocabBrawlAlexa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.SExamType;
import entity.SUserTable;

/**
 * @author Prithivi
 *
 */
public interface IUserTableDao extends IDataAccessObject, JpaRepository<SUserTable, String>  {
	
	
	@Query("select examPrefer from SUserTable where userId=:userId")
	Integer fetchPreferredExam(@Param("userId") String userId);

	@Query("select lockYn from SUserTable where userId=:userId")
	String isUserLocked(@Param("userId") String userId);
	
	

	
	
	@Query("from SUserTable where accountId=:userId")
	SUserTable getUserId(@Param("userId") String userId);

	

	

}
