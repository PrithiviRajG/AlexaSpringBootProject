
package com.vocabBrawlAlexa.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import entity.SAutoCreatedQuestions;

/**
 * @author Prakash
 *
 */
public interface IAutoCreatedQuestionsDao  extends IDataAccessObject, JpaRepository<SAutoCreatedQuestions, Integer> {
	


}
