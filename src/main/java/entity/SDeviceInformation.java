package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_device_information database table.
 * 
 */
@Entity
@Table(name="s_device_information")
@NamedQuery(name="SDeviceInformation.findAll", query="SELECT s FROM SDeviceInformation s")
public class SDeviceInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private String userId;

	@Column(name="uuid")
	private String uuid;

	@Column(name="cordova")
	private String cordova;

	@Column(name="dev_manf")
	private String devManf;

	@Column(name="hdw_serial")
	private String hdwSerial;

	@Column(name="is_virtual")
	private String isVirtual;

	@Column(name="os_name")
	private String osName;

	@Column(name="os_version")
	private String osVersion;
	
	@Column(name="dev_model")
	private String devModel;

	@Column(name="width")
	private String width;
	
	@Column(name="height")
	private String height;
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDevModel() {
		return devModel;
	}

	public void setDevModel(String devModel) {
		this.devModel = devModel;
	}

	public SDeviceInformation() {
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCordova() {
		return this.cordova;
	}

	public void setCordova(String cordova) {
		this.cordova = cordova;
	}

	public String getDevManf() {
		return this.devManf;
	}

	public void setDevManf(String devManf) {
		this.devManf = devManf;
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

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}


}