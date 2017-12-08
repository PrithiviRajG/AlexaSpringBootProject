package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

	
	/**
	 * The persistent class for the s_configurations database table.
	 * 
	 */
	@Entity
	@Table(name="s_score_calculation")
	@NamedQuery(name="ScoreCalculation.findAll", query="SELECT s FROM ScoreCalculation s")
	public class ScoreCalculation implements Serializable {
		private static final long serialVersionUID = 1L;


		@EmbeddedId
		private ScoreCalculationPK id;

		@Column(name="exam_id")
		private int examId;
	
		@Column(name="section_id")
		private int sectionId;
		
		@Column(name="score")
		private int score;
		
		@Column(name="accuracy_score")
		private int accuracyScore;
		
		@Column(name="speed_score")
		private int speedScore;

		public int getExamId() {
			return examId;
		}

		public void setExamId(int examId) {
			this.examId = examId;
		}

		public int getSectionId() {
			return sectionId;
		}

		public void setSectionId(int sectionId) {
			this.sectionId = sectionId;
		}

		public int getScore() {
			return score;
		}

		public ScoreCalculationPK getId() {
			return id;
		}

		public void setId(ScoreCalculationPK id) {
			this.id = id;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public void setScore(int score) {
			this.score = score;
		}

		public int getAccuracyScore() {
			return accuracyScore;
		}

		public void setAccuracyScore(int accuracyScore) {
			this.accuracyScore = accuracyScore;
		}

		public int getSpeedScore() {
			return speedScore;
		}

		public void setSpeedScore(int speedScore) {
			this.speedScore = speedScore;
		}



   }
	

