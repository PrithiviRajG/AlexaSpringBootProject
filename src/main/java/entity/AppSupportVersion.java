package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the app_support_version database table.
 * 
 */
@Entity
@Table(name="app_support_version")
@NamedQuery(name="AppSupportVersion.findAll", query="SELECT a FROM AppSupportVersion a")
public class AppSupportVersion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="app_version_id")
	private String appVersionId;

	@Column(name="app_version_name")
	private String appVersionName;

	public AppSupportVersion() {
	}

	public String getAppVersionId() {
		return this.appVersionId;
	}

	public void setAppVersionId(String appVersionId) {
		this.appVersionId = appVersionId;
	}

	public String getAppVersionName() {
		return this.appVersionName;
	}

	public void setAppVersionName(String appVersionName) {
		this.appVersionName = appVersionName;
	}

}