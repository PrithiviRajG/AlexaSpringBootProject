package com.vocabBrawlAlexa.dto;

import java.util.Date;
import java.util.List;

public class QuestionTO {
	
	private Integer qId;
	
	private Integer qType;
	
	private Integer qOrderNum;
	
	private String qText;
	
	private String qImage;
	
	private String qImagePath;
	
	private String qOnlyImage;
	
	private Integer qNoBlank;
	
	private String qTypeDesc;
	
	private String solution;
	
	private Integer passageId;
	
	private String passageDesc;
	
	private String passageLength;
	
	private Integer boxNumber;
	
	private String qSolution;
	
	private String qSolutionImage;
	
	private String qSolutionImagePath;
	
	private String stepField;
	
	private List<String> keyPoints;
	
	private String stepQuestionYN;
	
	private String showNotes;
	
	private List<OptionTO> optList;
	
	private String questionText2;
	
	private String questionAddl;
	
	private Integer NumOfCorrectOptions;
	
	private List<String> prevStepFields;
	
	private QuestionTO mainQuestion;
	
	private List<OptionTO> wrongAnswerSoln;
	
	private Boolean isStepQuestion;
	
	private Integer totalSubStepQ;
	
	private Integer currentSubStepNum;
	
	private String mainQuestionTxt;
	
	private Integer mainQuestionId;
	
	private Integer qSNo;
	
	private Integer qDuration;
	
	private Boolean isCorrect;
	
	private Boolean isWrong;
	
	private Boolean isUnanswered;
	
    private String timestamp;
	
    private String word;
	

	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public QuestionTO() {
		super();
	}
	
	public QuestionTO( String isCorrect,Integer qSNo, String isWrong, String isUnanswered) {
		super();
		this.qSNo=qSNo;
		if(isCorrect!=null && "Y".equals(isCorrect)){
			this.isCorrect=true;
		}else{
			this.isCorrect=false;
		}
		
		if(isWrong!=null && "Y".equals(isWrong)){
			this.isWrong=true;
		}else{
			this.isWrong=false;
		}
		
		if(isUnanswered!=null && "Y".equals(isUnanswered)){
			this.setIsUnanswered(true);
		}else{
			this.setIsUnanswered(false);
		}
	}
	
	public QuestionTO(Integer qId, Integer qType, String qText, String qImage, String qImagePath, String qOnlyImage,
			Integer qNoBlank, Integer boxNumber, String questionText2, String questionAddl,String stepQuestionYN,
			String stepZero, Integer passageId, Date timeStamp,Integer qSNo) {
		super();
		this.qId = qId;
		this.qType = qType;
		this.qText = qText;
		this.qImage = qImage;
		this.qImagePath = qImagePath;
		this.qOnlyImage = qOnlyImage;
		this.qNoBlank = qNoBlank;
		this.boxNumber = boxNumber;
		this.questionText2 = questionText2;
		this.questionAddl = questionAddl;
		this.stepQuestionYN=stepQuestionYN;
		this.stepField=stepZero;
		this.passageId=passageId;
		this.timestamp=timeStamp.toString();
		this.qSNo=qSNo;
		
	}
	
	public QuestionTO(Integer qId, Integer qType, String qText, String qImage, String qImagePath, String qOnlyImage,
			Integer qNoBlank, Integer boxNumber, String questionText2, String questionAddl,String stepQuestionYN,
			String stepZero, Integer passageId, Date timeStamp) {
		super();
		this.qId = qId;
		this.qType = qType;
		this.qText = qText;
		this.qImage = qImage;
		this.qImagePath = qImagePath;
		this.qOnlyImage = qOnlyImage;
		this.qNoBlank = qNoBlank;
		this.boxNumber = boxNumber;
		this.questionText2 = questionText2;
		this.questionAddl = questionAddl;
		this.stepQuestionYN=stepQuestionYN;
		this.stepField=stepZero;
		this.passageId=passageId;
		this.timestamp=timeStamp.toString();
		
		
	}
	
	public QuestionTO(int qId, int qTypeId,String qQuestionText, int qNoBlank, String qOnlyImg, String qImage,
			int passageId, String passageLength, String passageDesc, String qQuestionText2, 
			String qQuestionTextAddl, int boxNumber, List<OptionTO> options) {
		// TODO Auto-generated constructor stub
		super();
		this.qId=qId;
		this.qType=qTypeId;
		this.qText=qQuestionText;
		this.qNoBlank=qNoBlank;
		this.qOnlyImage=qOnlyImg;
		this.qImage=qImage;
		this.passageId=passageId;
		this.passageLength=passageLength;
		this.passageDesc=passageDesc;
		this.questionText2=qQuestionText2;
		this.questionAddl=qQuestionTextAddl;
		this.boxNumber=boxNumber;
		this.optList=options;
		
	}
	
	public QuestionTO(int qId, int qTypeId, String qQuestionText, int qNoBlank, String qOnlyImg, String qImage,
			int passageId, String qQuestionText2, String qQuestionTextAddl, int boxNumber, List<OptionTO> options) {
		// TODO Auto-generated constructor stub
		super();
		this.qId=qId;
		this.qType=qTypeId;
		this.qText=qQuestionText;
		this.qNoBlank=qNoBlank;
		this.qOnlyImage=qOnlyImg;
		this.qImage=qImage;
		this.passageId=passageId;
		this.questionText2=qQuestionText2;
		this.questionAddl=qQuestionTextAddl;
		this.boxNumber=boxNumber;
		this.optList=options;
		
	}
	
	public QuestionTO(int qTypeId, String qQuestionText, String qQuestionTextAddl, String qQuestionText2) {
		// TODO Auto-generated constructor stub
		super();
		this.qType=qTypeId;
		this.qText=qQuestionText;
		this.questionAddl=qQuestionTextAddl;
		this.questionText2=qQuestionText2;
	}
	
	/**
	 * @return the qText
	 */
	public String getqText() {
		return qText;
	}
	/**
	 * @param qText the qText to set
	 */
	public void setqText(String qText) {
		this.qText = qText;
	}
	/**
	 * @return the qImage
	 */
	public String getqImage() {
		return qImage;
	}
	/**
	 * @param qImage the qImage to set
	 */
	public void setqImage(String qImage) {
		this.qImage = qImage;
	}
	/**
	 * @return the qImagePath
	 */
	public String getqImagePath() {
		return qImagePath;
	}
	/**
	 * @param qImagePath the qImagePath to set
	 */
	public void setqImagePath(String qImagePath) {
		this.qImagePath = qImagePath;
	}
	/**
	 * @return the qOnlyImage
	 */
	public String getqOnlyImage() {
		return qOnlyImage;
	}
	/**
	 * @param qOnlyImage the qOnlyImage to set
	 */
	public void setqOnlyImage(String qOnlyImage) {
		this.qOnlyImage = qOnlyImage;
	}
	/**
	 * @return the qNoBlank
	 */
	public Integer getqNoBlank() {
		return qNoBlank;
	}
	/**
	 * @param qNoBlank the qNoBlank to set
	 */
	public void setqNoBlank(Integer qNoBlank) {
		this.qNoBlank = qNoBlank;
	}
	/**
	 * @return the qTypeDesc
	 */
	public String getqTypeDesc() {
		return qTypeDesc;
	}
	/**
	 * @param qTypeDesc the qTypeDesc to set
	 */
	public void setqTypeDesc(String qTypeDesc) {
		this.qTypeDesc = qTypeDesc;
	}
	/**
	 * @return the solution
	 */
	public String getSolution() {
		return solution;
	}
	/**
	 * @param solution the solution to set
	 */
	public void setSolution(String solution) {
		this.solution = solution;
	}
	/**
	 * @return the passageId
	 */
	public Integer getPassageId() {
		return passageId;
	}
	/**
	 * @param passageId the passageId to set
	 */
	public void setPassageId(Integer passageId) {
		this.passageId = passageId;
	}
	/**
	 * @return the passageDesc
	 */
	public String getPassageDesc() {
		return passageDesc;
	}
	/**
	 * @param passageDesc the passageDesc to set
	 */
	public void setPassageDesc(String passageDesc) {
		this.passageDesc = passageDesc;
	}
	/**
	 * @return the qId
	 */
	public Integer getqId() {
		return qId;
	}
	/**
	 * @param qId the qId to set
	 */
	public void setqId(Integer qId) {
		this.qId = qId;
	}
	/**
	 * @return the passageLength
	 */
	public String getPassageLength() {
		return passageLength;
	}
	/**
	 * @param passageLength the passageLength to set
	 */
	public void setPassageLength(String passageLength) {
		this.passageLength = passageLength;
	}
	/**
	 * @return the boxNumber
	 */
	public Integer getBoxNumber() {
		return boxNumber;
	}
	/**
	 * @param boxNumber the boxNumber to set
	 */
	public void setBoxNumber(Integer boxNumber) {
		this.boxNumber = boxNumber;
	}
	/**
	 * @return the qSolution
	 */
	public String getqSolution() {
		return qSolution;
	}
	/**
	 * @param qSolution the qSolution to set
	 */
	public void setqSolution(String qSolution) {
		this.qSolution = qSolution;
	}
	/**
	 * @return the qSolutionImage
	 */
	public String getqSolutionImage() {
		return qSolutionImage;
	}
	/**
	 * @param qSolutionImage the qSolutionImage to set
	 */
	public void setqSolutionImage(String qSolutionImage) {
		this.qSolutionImage = qSolutionImage;
	}
	/**
	 * @return the qSolutionImagePath
	 */
	public String getqSolutionImagePath() {
		return qSolutionImagePath;
	}
	/**
	 * @param qSolutionImagePath the qSolutionImagePath to set
	 */
	public void setqSolutionImagePath(String qSolutionImagePath) {
		this.qSolutionImagePath = qSolutionImagePath;
	}
	/**
	 * @return the stepField
	 */
	public String getStepField() {
		return stepField;
	}
	/**
	 * @param stepField the stepField to set
	 */
	public void setStepField(String stepField) {
		this.stepField = stepField;
	}
	/**
	 * @return the keyPoints
	 */
	public List<String> getKeyPoints() {
		return keyPoints;
	}
	/**
	 * @param keyPoints the keyPoints to set
	 */
	public void setKeyPoints(List<String> keyPoints) {
		this.keyPoints = keyPoints;
	}
	/**
	 * @return the stepQuestionYN
	 */
	public String getStepQuestionYN() {
		return stepQuestionYN;
	}
	/**
	 * @param stepQuestionYN the stepQuestionYN to set
	 */
	public void setStepQuestionYN(String stepQuestionYN) {
		this.stepQuestionYN = stepQuestionYN;
	}
	/**
	 * @return the showNotes
	 */
	public String getShowNotes() {
		return showNotes;
	}
	/**
	 * @param showNotes the showNotes to set
	 */
	public void setShowNotes(String showNotes) {
		this.showNotes = showNotes;
	}
	/**
	 * @return the optList
	 */
	public List<OptionTO> getOptList() {
		return optList;
	}
	/**
	 * @param optList the optList to set
	 */
	public void setOptList(List<OptionTO> optList) {
		this.optList = optList;
	}
	/**
	 * @return the qType
	 */
	public Integer getqType() {
		return qType;
	}
	/**
	 * @param qType the qType to set
	 */
	public void setqType(Integer qType) {
		this.qType = qType;
	}
	/**
	 * @return the questionAddl
	 */
	public String getQuestionAddl() {
		return questionAddl;
	}
	/**
	 * @param questionAddl the questionAddl to set
	 */
	public void setQuestionAddl(String questionAddl) {
		this.questionAddl = questionAddl;
	}
	/**
	 * @return the questionText2
	 */
	public String getQuestionText2() {
		return questionText2;
	}
	/**
	 * @param questionText2 the questionText2 to set
	 */
	public void setQuestionText2(String questionText2) {
		this.questionText2 = questionText2;
	}
	/**
	 * @return the numOfCorrectOptions
	 */
	public Integer getNumOfCorrectOptions() {
		return NumOfCorrectOptions;
	}
	/**
	 * @param numOfCorrectOptions the numOfCorrectOptions to set
	 */
	public void setNumOfCorrectOptions(Integer numOfCorrectOptions) {
		NumOfCorrectOptions = numOfCorrectOptions;
	}
	/**
	 * @return the prevStepFields
	 */
	public List<String> getPrevStepFields() {
		return prevStepFields;
	}
	/**
	 * @param prevStepFields the prevStepFields to set
	 */
	public void setPrevStepFields(List<String> prevStepFields) {
		this.prevStepFields = prevStepFields;
	}
	/**
	 * @return the mainQuestion
	 */
	public QuestionTO getMainQuestion() {
		return mainQuestion;
	}
	/**
	 * @param mainQuestion the mainQuestion to set
	 */
	public void setMainQuestion(QuestionTO mainQuestion) {
		this.mainQuestion = mainQuestion;
	}
	/**
	 * @return the wrongAnswerSoln
	 */
	public List<OptionTO> getWrongAnswerSoln() {
		return wrongAnswerSoln;
	}
	/**
	 * @param wrongAnswerSoln the wrongAnswerSoln to set
	 */
	public void setWrongAnswerSoln(List<OptionTO> wrongAnswerSoln) {
		this.wrongAnswerSoln = wrongAnswerSoln;
	}
	/**
	 * @return the qOrderNum
	 */
	public Integer getqOrderNum() {
		return qOrderNum;
	}
	/**
	 * @param qOrderNum the qOrderNum to set
	 */
	public void setqOrderNum(Integer qOrderNum) {
		this.qOrderNum = qOrderNum;
	}
	public Boolean getIsStepQuestion() {
		return isStepQuestion;
	}
	public void setIsStepQuestion(Boolean isStepQuestion) {
		this.isStepQuestion = isStepQuestion;
	}
	/**
	 * @return the totalSubStepQ
	 */
	public Integer getTotalSubStepQ() {
		return totalSubStepQ;
	}
	/**
	 * @param totalSubStepQ the totalSubStepQ to set
	 */
	public void setTotalSubStepQ(Integer totalSubStepQ) {
		this.totalSubStepQ = totalSubStepQ;
	}
	/**
	 * @return the currentSubStepNum
	 */
	public Integer getCurrentSubStepNum() {
		return currentSubStepNum;
	}
	/**
	 * @param currentSubStepNum the currentSubStepNum to set
	 */
	public void setCurrentSubStepNum(Integer currentSubStepNum) {
		this.currentSubStepNum = currentSubStepNum;
	}
	/**
	 * @return the mainQuestionId
	 */
	public Integer getMainQuestionId() {
		return mainQuestionId;
	}
	/**
	 * @param mainQuestionId the mainQuestionId to set
	 */
	public void setMainQuestionId(Integer mainQuestionId) {
		this.mainQuestionId = mainQuestionId;
	}
	/**
	 * @return the mainQuestionTxt
	 */
	public String getMainQuestionTxt() {
		return mainQuestionTxt;
	}
	/**
	 * @param mainQuestionTxt the mainQuestionTxt to set
	 */
	public void setMainQuestionTxt(String mainQuestionTxt) {
		this.mainQuestionTxt = mainQuestionTxt;
	}
	/**
	 * @return the qSNo
	 */
	public Integer getqSNo() {
		return qSNo;
	}
	/**
	 * @param qSNo the qSNo to set
	 */
	public void setqSNo(Integer qSNo) {
		this.qSNo = qSNo;
	}
	/**
	 * @return the qDuration
	 */
	public Integer getqDuration() {
		return qDuration;
	}
	/**
	 * @param qDuration the qDuration to set
	 */
	public void setqDuration(Integer qDuration) {
		this.qDuration = qDuration;
	}
	/**
	 * @return the isCorrect
	 */
	public Boolean getIsCorrect() {
		return isCorrect;
	}
	/**
	 * @param isCorrect the isCorrect to set
	 */
	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	/**
	 * @return the isWrong
	 */
	public Boolean getIsWrong() {
		return isWrong;
	}
	/**
	 * @param isWrong the isWrong to set
	 */
	public void setIsWrong(Boolean isWrong) {
		this.isWrong = isWrong;
	}
	/**
	 * @return the isUnanswered
	 */
	public Boolean getIsUnanswered() {
		return isUnanswered;
	}
	/**
	 * @param isUnanswered the isUnanswered to set
	 */
	public void setIsUnanswered(Boolean isUnanswered) {
		this.isUnanswered = isUnanswered;
	}
	
	public void setDetails(Boolean isStepQues, Integer qOrderNum, Integer noOfSteps, int i, String startTimeStamp) {
		// TODO Auto-generated method stub
		this.isStepQuestion=true;
		this.qOrderNum=qOrderNum;
		this.totalSubStepQ=noOfSteps;
		this.currentSubStepNum=i;
		this.timestamp=startTimeStamp;
		
		
	}
	
	
	
	

}
