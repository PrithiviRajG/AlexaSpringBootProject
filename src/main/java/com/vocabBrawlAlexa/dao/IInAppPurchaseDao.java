package com.vocabBrawlAlexa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.InappProductPurchaseDetail;


public interface IInAppPurchaseDao extends IDataAccessObject, JpaRepository<InappProductPurchaseDetail, Integer>{

}
