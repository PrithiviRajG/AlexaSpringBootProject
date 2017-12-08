package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inter_category_item_mapping database table.
 * 
 */
@Entity
@Table(name="inter_category_item_mapping")
@NamedQuery(name="InterCategoryItemMapping.findAll", query="SELECT i FROM InterCategoryItemMapping i")
public class InterCategoryItemMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="active_flag")
	private String activeFlag;

	@Id
	@Column(name="category_id")
	private int categoryId;

	@Column(name="first_level_parent_id")
	private int firstLevelParentId;

	@Column(name="second_level_parent_id")
	private int secondLevelParentId;

	@Column(name="section_id")
	private int sectionId;

	@Column(name="tier_id")
	private int tierId;

	public InterCategoryItemMapping() {
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getFirstLevelParentId() {
		return this.firstLevelParentId;
	}

	public void setFirstLevelParentId(int firstLevelParentId) {
		this.firstLevelParentId = firstLevelParentId;
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