package entity;
import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;


/**
 * The persistent class for the s_passage database table.
 * 
 */
@Entity
@Table(name="s_modal_show")
@NamedQuery(name="SModalShow.findAll", query="SELECT s FROM SModalShow s")
public class SModalShow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private int id;

	@Column(name="is_modal_show")
	private int isModalShow;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsModalShow() {
		return isModalShow;
	}

	public void setIsModalShow(int isModalShow) {
		this.isModalShow = isModalShow;
	}

	
}