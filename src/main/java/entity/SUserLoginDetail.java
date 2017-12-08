package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_user_login_details database table.
 * 
 */
@Entity
@Table(name="s_user_login_details")
@NamedQuery(name="SUserLoginDetail.findAll", query="SELECT s FROM SUserLoginDetail s")
public class SUserLoginDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SUserLoginDetailPk id;

	

	public SUserLoginDetailPk getId() {
		return id;
	}



	public void setId(SUserLoginDetailPk id) {
		this.id = id;
	}



	public SUserLoginDetail() {
	}

	

}