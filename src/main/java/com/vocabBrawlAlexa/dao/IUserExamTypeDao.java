package com.vocabBrawlAlexa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.SUserExamType;
import entity.SUserExamTypePK;

public interface IUserExamTypeDao extends IDataAccessObject, JpaRepository<SUserExamType, SUserExamTypePK>  {


	@Query("From SUserExamType where id.userId=:facultyId")
	List<SUserExamType> findExam(@Param("facultyId") String facultyId);
	
	@Query("select count(id.examId) from SUserExamType where id.userId=:userId")
	Long countByUserId(@Param("userId") String userId);

	@Query("select id.examId from SUserExamType where id.userId=:userId")
	String getExamId(@Param("userId") String userId);
	
	/*@Query("select id.examId from SUserExamType where id.userId=:userId and id.examId=:examId")
	String getExamID(@Param("userId") String userId,@Param("examId") Integer examId);*/

	@Query("from SUserExamType where id.userId=:userId")
	List<SUserExamType> getExam(@Param("userId") String userId);

}