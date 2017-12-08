package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_user_feedback database table.
 * 
 */
@Entity
@Table(name="s_user_feedback")
@NamedQuery(name="SUserFeedback.findAll", query="SELECT s FROM SUserFeedback s")
public class SUserFeedback implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SUserFeedbackPK id;

	@Column(name="app_id")
	private String appId;

	@Column(name="app_rating")
	private String appRating;

	private String cordova;

	@Column(name="dev_height")
	private String devHeight;

	@Column(name="dev_manf")
	private String devManf;

	@Column(name="dev_model")
	private String devModel;

	@Column(name="dev_width")
	private String devWidth;

	@Column(name="hdw_serial")
	private String hdwSerial;

	@Column(name="is_virtual")
	private String isVirtual;

	@Column(name="os_name")
	private String osName;

	@Column(name="os_version")
	private String osVersion;

	@Column(name="suggestions_for_improvement")
	private String suggestionsForImprovement;
	
	public SUserFeedback(){
		
	}

	

	public SUserFeedbackPK getId() {
		return this.id;
	}

	public void setId(SUserFeedbackPK id) {
		this.id = id;
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppRating() {
		return this.appRating;
	}

	public void setAppRating(String appRating) {
		this.appRating = appRating;
	}

	public String getCordova() {
		return this.cordova;
	}

	public void setCordova(String cordova) {
		this.cordova = cordova;
	}

	public String getDevHeight() {
		return this.devHeight;
	}

	public void setDevHeight(String devHeight) {
		this.devHeight = devHeight;
	}

	public String getDevManf() {
		return this.devManf;
	}

	public void setDevManf(String devManf) {
		this.devManf = devManf;
	}

	public String getDevModel() {
		return this.devModel;
	}

	public void setDevModel(String devModel) {
		this.devModel = devModel;
	}

	public String getDevWidth() {
		return this.devWidth;
	}

	public void setDevWidth(String devWidth) {
		this.devWidth = devWidth;
	}

	public String getHdwSerial() {
		return this.hdwSerial;
	}

	public void setHdwSerial(String hdwSerial) {
		this.hdwSerial = hdwSerial;
	}

	public String getIsVirtual() {
		return this.isVirtual;
	}

	public void setIsVirtual(String isVirtual) {
		this.isVirtual = isVirtual;
	}

	public String getOsName() {
		return this.osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsVersion() {
		return this.osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getSuggestionsForImprovement() {
		return this.suggestionsForImprovement;
	}

	public void setSuggestionsForImprovement(String suggestionsForImprovement) {
		this.suggestionsForImprovement = suggestionsForImprovement;
	}

}