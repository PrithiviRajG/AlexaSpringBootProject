package com.vocabBrawlAlexa.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vocabBrawlAlexa.Queries;
import com.vocabBrawlAlexa.QuestionMapper;

@Repository
public class JdbcDao {
	
	private static final Logger logger = Logger.getLogger(JdbcDao.class.getName());
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

	public String getQuestion(int qId) {
		// TODO Auto-generated method stub
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("qId", qId,Types.INTEGER);
		String qText=namedParameterJdbcTemplate.queryForObject(Queries.GET_QUESTION, parameters, new QuestionMapper());
		return qText;
	}

}
