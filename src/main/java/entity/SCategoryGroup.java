package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_category_group database table.
 * 
 */
@Entity
@Table(name="s_category_group")
@NamedQuery(name="SCategoryGroup.findAll", query="SELECT s FROM SCategoryGroup s")
public class SCategoryGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="group_id")
	private int groupId;

	@Column(name="active_flag")
	private String activeFlag;

	private String comments;

	@Column(name="first_level_parent_id")
	private int firstLevelParentId;

	@Column(name="group_name")
	private String groupName;

	@Column(name="is_leaf_group")
	private String isLeafGroup;

	@Column(name="is_multi_selection")
	private String isMultiSelection;

	@Column(name="second_level_parent_id")
	private int secondLevelParentId;

	@Column(name="section_id")
	private int sectionId;

	@Column(name="tier_id")
	private int tierId;

	public SCategoryGroup() {
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

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getFirstLevelParentId() {
		return this.firstLevelParentId;
	}

	public void setFirstLevelParentId(int firstLevelParentId) {
		this.firstLevelParentId = firstLevelParentId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getIsLeafGroup() {
		return this.isLeafGroup;
	}

	public void setIsLeafGroup(String isLeafGroup) {
		this.isLeafGroup = isLeafGroup;
	}

	public String getIsMultiSelection() {
		return this.isMultiSelection;
	}

	public void setIsMultiSelection(String isMultiSelection) {
		this.isMultiSelection = isMultiSelection;
	}

	public int getSecondLevelParentId() {
		return this.secondLevelParentId;
	}

	public void setSecondLevelParentId(int secondLevelParentId) {
		this.secondLevelParentId = secondLevelParentId;
	}

	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public int getTierId() {
		return this.tierId;
	}

	public void setTierId(int tierId) {
		this.tierId = tierId;
	}

}