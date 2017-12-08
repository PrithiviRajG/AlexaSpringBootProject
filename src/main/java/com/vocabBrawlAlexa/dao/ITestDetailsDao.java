package com.vocabBrawlAlexa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.STestDetail;
import entity.STestDetailPK;

public interface ITestDetailsDao  extends IDataAccessObject, JpaRepository<STestDetail, STestDetailPK> {
	
}