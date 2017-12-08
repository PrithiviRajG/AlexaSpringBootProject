/**
 * 
 */
package com.vocabBrawlAlexa.dto;

/**
 * @author Prithivi
 *
 */
public class OptionTO {
	
	private Integer optId;
	
	private String optText;
	
	private String optImage;
	
	private String optImagePath;
	
	private String optCorrect;
	
	private String optImageCorrect;
	
	private String optAnswer;
	
	private String optSolution;
	
	private Boolean checked; 
	
	
	
	

	public OptionTO(String optCorrect, String optSolution) {
		super();
		this.optCorrect = optCorrect;
		this.optSolution = optSolution;
	}

	/**
	 * 
	 */
	public OptionTO() {
		super();
	}

	/**
	 * @param optId
	 * @param optText
	 * @param optImage
	 * @param optImagePath
	 * @param optCorrect
	 * @param optImageCorrect
	 * @param optAnswer
	 */
	public OptionTO(Integer optId, String optText, String optImage, String optImagePath, String optCorrect,
			String optImageCorrect, String optAnswer) {
		super();
		this.optId = optId;
		this.optText = optText;
		this.optImage = optImage;
		this.optImagePath = optImagePath;
		this.optCorrect = optCorrect;
		this.optImageCorrect = optImageCorrect;
		this.optAnswer = optAnswer;
		this.checked=false;
	}
	
	/**
	 * @param optId
	 * @param optText
	 * @param optImage
	 * @param optImagePath
	 * @param optCorrect
	 * @param optImageCorrect
	 * @param optAnswer
	 */
	public OptionTO(Integer optId, String optText, String optImage, String optImagePath, String optCorrect,
			String optImageCorrect, String optAnswer, String optSolution) {
		super();
		this.optId = optId;
		this.optText = optText;
		this.optImage = optImage;
		this.optImagePath = optImagePath;
		this.optCorrect = optCorrect;
		if(optCorrect!=null && "Y".equals(optCorrect)){
			this.checked=true;
		}else{
			this.checked=false;
		}
		this.optImageCorrect = optImageCorrect;
		this.optAnswer = optAnswer;
	}
	
	/**
	 * @param optId
	 * @param optText
	 * @param optImage
	 * @param optImagePath
	 * @param optCorrect
	 * @param optImageCorrect
	 * @param optAnswer
	 */
	public OptionTO(Integer optId, String optText, String optImage, String optImagePath,
			String optImageCorrect, String optAnswer) {
		super();
		this.optId = optId;
		this.optText = optText;
		this.optImage = optImage;
		this.optImagePath = optImagePath;
		this.optImageCorrect = optImageCorrect;
		this.optAnswer = optAnswer;
		this.checked=false;
		
	}

	/**
	 * @return the optId
	 */
	public Integer getOptId() {
		return optId;
	}

	/**
	 * @param optId the optId to set
	 */
	public void setOptId(Integer optId) {
		this.optId = optId;
	}

	/**
	 * @return the optText
	 */
	public String getOptText() {
		return optText;
	}

	/**
	 * @param optText the optText to set
	 */
	public void setOptText(String optText) {
		this.optText = optText;
	}

	/**
	 * @return the optImage
	 */
	public String getOptImage() {
		return optImage;
	}

	/**
	 * @param optImage the optImage to set
	 */
	public void setOptImage(String optImage) {
		this.optImage = optImage;
	}

	/**
	 * @return the optImagePath
	 */
	public String getOptImagePath() {
		return optImagePath;
	}

	/**
	 * @param optImagePath the optImagePath to set
	 */
	public void setOptImagePath(String optImagePath) {
		this.optImagePath = optImagePath;
	}

	/**
	 * @return the optCorrect
	 */
	public String getOptCorrect() {
		return optCorrect;
	}

	/**
	 * @param optCorrect the optCorrect to set
	 */
	public void setOptCorrect(String optCorrect) {
		this.optCorrect = optCorrect;
	}

	/**
	 * @return the optImageCorrect
	 */
	public String getOptImageCorrect() {
		return optImageCorrect;
	}

	/**
	 * @param optImageCorrect the optImageCorrect to set
	 */
	public void setOptImageCorrect(String optImageCorrect) {
		this.optImageCorrect = optImageCorrect;
	}

	/**
	 * @return the optAnswer
	 */
	public String getOptAnswer() {
		return optAnswer;
	}

	/**
	 * @param optAnswer the optAnswer to set
	 */
	public void setOptAnswer(String optAnswer) {
		this.optAnswer = optAnswer;
	}

	/**
	 * @return the optSolution
	 */
	public String getOptSolution() {
		return optSolution;
	}

	/**
	 * @param optSolution the optSolution to set
	 */
	public void setOptSolution(String optSolution) {
		this.optSolution = optSolution;
	}

	/**
	 * @return the checked
	 */
	public Boolean getChecked() {
		return checked;
	}

	/**
	 * @param checked the checked to set
	 */
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	
	
	

}
