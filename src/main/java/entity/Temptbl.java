package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the temptbl database table.
 * 
 */
@Entity
@NamedQuery(name="Temptbl.findAll", query="SELECT t FROM Temptbl t")
public class Temptbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String tempcol;

	public Temptbl() {
	}

	public String getTempcol() {
		return this.tempcol;
	}

	public void setTempcol(String tempcol) {
		this.tempcol = tempcol;
	}

}