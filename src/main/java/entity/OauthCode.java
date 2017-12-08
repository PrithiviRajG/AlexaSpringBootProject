package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oauth_code database table.
 * 
 */
@Entity
@Table(name="oauth_code")
@NamedQuery(name="OauthCode.findAll", query="SELECT o FROM OauthCode o")
public class OauthCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private byte[] authentication;

	@Id
	private String code;

	public OauthCode() {
	}

	public byte[] getAuthentication() {
		return this.authentication;
	}

	public void setAuthentication(byte[] authentication) {
		this.authentication = authentication;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}