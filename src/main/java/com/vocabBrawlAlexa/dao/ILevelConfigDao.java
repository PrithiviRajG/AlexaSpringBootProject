/**
 * 
 */
package com.vocabBrawlAlexa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.SLevelConfig;
import entity.SLevelConfigPK;

/**
 * @author Prithivi
 *
 */
public interface ILevelConfigDao extends IDataAccessObject, JpaRepository<SLevelConfig, SLevelConfigPK> {

}
