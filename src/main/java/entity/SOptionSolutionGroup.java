package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_option_solution_group database table.
 * 
 */
@Entity
@Table(name="s_option_solution_group")
@NamedQuery(name="SOptionSolutionGroup.findAll", query="SELECT s FROM SOptionSolutionGroup s")
public class SOptionSolutionGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="group_id")
	private int groupId;

	@Column(name="active_flag")
	private String activeFlag;

	private String description;

	@Column(name="group_name")
	private String groupName;

	@Column(name="section_id")
	private int sectionId;

	public SOptionSolutionGroup() {
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

}