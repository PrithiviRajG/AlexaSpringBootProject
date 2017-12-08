package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

	@Entity
	@Table(name="s_auto_created_questions")
	@NamedQuery(name="SAutoCreatedQuestions.findAll", query="SELECT s FROM SAutoCreatedQuestions s")
	public class SAutoCreatedQuestions implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@Column(name="q_id")
		private Integer qId;

		@Column(name="base_q_id")
		private String baseQid;
		
		@Column(name="word")
		private String word;

		@Column(name="source_type")
		private String sourceType;

		@Column(name="answer_yn")
		private String answeredYn;
		
		public SAutoCreatedQuestions(){
			
		}

		public Integer getqId() {
			return qId;
		}

		public void setqId(Integer qId) {
			this.qId = qId;
		}

		public String getBaseQid() {
			return baseQid;
		}

		public void setBaseQid(String baseQid) {
			this.baseQid = baseQid;
		}

		public String getWord() {
			return word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		public String getSourceType() {
			return sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getAnsweredYn() {
			return answeredYn;
		}

		public void setAnsweredYn(String answeredYn) {
			this.answeredYn = answeredYn;
		}
		
		
	
	}
