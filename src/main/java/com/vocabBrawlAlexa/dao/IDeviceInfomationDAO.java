package com.vocabBrawlAlexa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.SDeviceInformation;


	public interface IDeviceInfomationDAO  extends IDataAccessObject, JpaRepository<SDeviceInformation, Integer> {
		
    }
