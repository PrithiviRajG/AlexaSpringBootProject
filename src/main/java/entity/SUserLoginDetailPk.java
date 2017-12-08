/**
 * 
 */
package entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Prithivi Raj G
 *
 */
@Embeddable
public class SUserLoginDetailPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="login_logout")
	private String loginLogout;

	@Column(name="login_logout_time")
	private String loginLogoutTime;

	@Column(name="user_id")
	private String userId;
	
	
	
	/**
	 * 
	 */
	public SUserLoginDetailPk() {
		super();
	}

	public String getLoginLogout() {
		return this.loginLogout;
	}

	public void setLoginLogout(String loginLogout) {
		this.loginLogout = loginLogout;
	}

	public String getLoginLogoutTime() {
		return loginLogoutTime;
	}

	public void setLoginLogoutTime(String loginLogoutTime) {
		this.loginLogoutTime = loginLogoutTime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
