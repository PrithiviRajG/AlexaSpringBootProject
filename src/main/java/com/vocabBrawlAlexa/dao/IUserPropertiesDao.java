package com.vocabBrawlAlexa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.SUserProperty;

public interface IUserPropertiesDao extends IDataAccessObject, JpaRepository<SUserProperty, String> {

	SUserProperty findByUserId(String userId);
	
	@Query("select id.examId from SExamFacultyMapping where id.batchId=:batchId")
	Integer fetchExamId(@Param("batchId") String batchId);
	
	@Query("select retryTokens from SUserProperty where id.userId=:userId")
	Integer fetchRetryTokens(@Param("userId") String userId);

}
