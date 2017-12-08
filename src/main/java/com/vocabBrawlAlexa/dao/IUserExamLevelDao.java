package com.vocabBrawlAlexa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




import entity.SUserExamLevel;
import entity.SUserExamLevelPK;

public interface IUserExamLevelDao extends IDataAccessObject, JpaRepository<SUserExamLevel, SUserExamLevelPK>   {

	@Query("select levelId from SUserExamLevel where id.examId=:examId and id.sectionId=:secId and id.userId=:userId")
	Integer getCurrentLevel(@Param("examId") Integer examId,@Param("secId")  Integer secId,@Param("userId")  String userId);
	
	

}
