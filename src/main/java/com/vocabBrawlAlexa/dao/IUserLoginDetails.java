/**
 * 
 */
package com.vocabBrawlAlexa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.SUserLoginDetail;
import entity.SUserLoginDetailPk;

/**
 * @author Prithivi
 *
 */
public interface IUserLoginDetails extends JpaRepository<SUserLoginDetail, SUserLoginDetailPk>  {

}
