/**
 * 
 */
package com.vocabBrawlAlexa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.vocabBrawlAlexa.dto.QuestionTO;

import entity.SQuestion;

/**
 * @author Prithivi
 *
 */

public interface IQuestionsDao extends IDataAccessObject, JpaRepository<SQuestion, Integer> {
	
	
	@Query("select new com.vocabBrawlAlexa.dto.QuestionTO(sq.id.qId,sq.qTypeId,sq.qQuestionText, sq.qImage,sq.qImagePath,sq.qOnlyImg,"
			+ "sq.qNoBlank,sq.boxNumber,sq.qQuestionText2, sq.qQuestionTextAddl, sq.stepQuestion,sq.stepZero, sq.passageId,NOW(), sm.rowId)"
			+ " from SQuestion sq, STestQuestionMap sm where sq.id.qId=sm.id.qId and sm.id.testId=:testId and sm.rowId=:rowNum")
	QuestionTO findQuestion(@Param("testId") Integer testId,@Param("rowNum") Integer rowNum);

	@Query("select sq.keyPoints from SQuestion sq, SQuestionSubStep ss where sq.id.qId=ss.stepQId and ss.id.stepNo= "
			+ "(select max(id.stepNo) from SQuestionSubStep where id.qId=:qId and id.stepNo<:currentSubStepNum ) and ss.id.qId=:qId")
	List<String> getPrevKeyPoints(@Param("qId") Integer qId,@Param("currentSubStepNum") Integer currentSubStepNum);

	@Query("select sq.qSolution from SQuestion sq, SQuestionSubStep ss where sq.id.qId=ss.stepQId and ss.id.stepNo<:currentSubStepNum "
			+ " and ss.id.qId=:qId and sq.qSolution!=''")
	List<String> getprevStepFields(@Param("qId") Integer qId,@Param("currentSubStepNum") Integer currentSubStepNum);
	
	@Query("select keyPoints from SQuestion where id.qId=:qId")
	String getKeyPoints(@Param("qId") Integer qId);
	
	@Query("select levelId from SUserExamLevel where id.userId=:userId and id.examId=:examId and id.sectionId=:sectionId")
	Integer getCurrentLevel(@Param("userId") String userId,@Param("sectionId") Integer sectionId,@Param("examId") Integer examId);

	@Query("select sq.keyPoints from SQuestion sq, SQuestionSubStep ss where sq.id.qId=ss.stepQId and ss.id.qId=:qId order by ss.id.stepNo")
	List<String> getkeyPointsForAllStepQn(@Param("qId") Integer qId);

	
	@Query("select new com.vocabBrawlAlexa.dto.QuestionTO(sq.id.qId,sq.qTypeId,sq.qQuestionText, sq.qImage,sq.qImagePath,sq.qOnlyImg,"
			+ "sq.qNoBlank,sq.boxNumber,sq.qQuestionText2, sq.qQuestionTextAddl, sq.stepQuestion,sq.stepZero, sq.passageId,NOW(), sm.rowId)"
			+ " from SQuestion sq, STestQuestionMap sm where sq.id.qId=sm.id.qId and sm.id.testId=:testId and sm.id.qId=:qId")
	QuestionTO findQuestionByQId(@Param("testId") Integer testId,@Param("qId") Integer qId);

	/*@Query("select new com.vocabBrawlAlexa.dto.QuestionTO(sq.id.qId,sq.qTypeId,sq.qQuestionText, sq.qImage,sq.qImagePath,sq.qOnlyImg,"
			+ "sq.qNoBlank,sq.boxNumber,sq.qQuestionText2, sq.qQuestionTextAddl, sq.stepQuestion,sq.stepZero, sq.passageId,NOW(), sm.rowId)"
			+ " from SQuestion sq, STestQuestionMap sm where sq.id.qId=sm.id.qId and sm.id.testId=:testId and sm.id.qId=:qId")
	QuestionTO findNextSkip(@Param("testId") Integer testId,@Param("unAnsQId")  Integer unAnsQId,@Param("currentQId")  Integer currentQId);*/

}
