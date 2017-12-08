package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inter_category_item database table.
 * 
 */
@Entity
@Table(name="inter_category_item")
@NamedQuery(name="InterCategoryItem.findAll", query="SELECT i FROM InterCategoryItem i")
public class InterCategoryItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="category_id")
	private int categoryId;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="category_name")
	private String categoryName;

	private String comments;

	@Column(name="first_level_parent_id")
	private int firstLevelParentId;

	@Column(name="group_id")
	private int groupId;

	@Column(name="second_level_parent_id")
	private int secondLevelParentId;

	@Column(name="section_id")
	private int sectionId;

	@Column(name="tier_id")
	private int tierId;

	public InterCategoryItem() {
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
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