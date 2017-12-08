package com.vocabBrawlAlexa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.SConfiguration;

public interface ISConfigurationDAO extends JpaRepository<SConfiguration, Integer> {

}
