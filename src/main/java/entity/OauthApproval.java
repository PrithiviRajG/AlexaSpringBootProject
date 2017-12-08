package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the oauth_approvals database table.
 * 
 */
@Entity
@Table(name="oauth_approvals")
@NamedQuery(name="OauthApproval.findAll", query="SELECT o FROM OauthApproval o")
public class OauthApproval implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String clientId;

	private Timestamp expiresAt;

	private Timestamp lastModifiedAt;

	private String scope;

	private String status;

	private String userId;

	public OauthApproval() {
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Timestamp getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(Timestamp expiresAt) {
		this.expiresAt = expiresAt;
	}

	public Timestamp getLastModifiedAt() {
		return this.lastModifiedAt;
	}

	public void setLastModifiedAt(Timestamp lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}