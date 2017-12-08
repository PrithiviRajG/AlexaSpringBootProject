package com.vocabBrawlAlexa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.SUserLevelStat;
import entity.SUserLevelStatPK;

public interface IUserLevelStatDao extends IDataAccessObject, JpaRepository<SUserLevelStat, SUserLevelStatPK>{
	
 @Query("Select count(*) from SUserLevelStat where id.userId=:userId and id.examId=:examId and id.levelId=:levelId and id.sectionId=:sectionId")
 Integer getStatCount(@Param("userId") String userId,@Param("examId") Integer examId ,@Param("levelId") Integer levelId,@Param("sectionId") Integer sectionId);

}
