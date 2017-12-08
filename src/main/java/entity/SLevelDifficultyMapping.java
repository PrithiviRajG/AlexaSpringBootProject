package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_level_difficulty_mapping database table.
 * 
 */
@Entity
@Table(name="s_level_difficulty_mapping")
@NamedQuery(name="SLevelDifficultyMapping.findAll", query="SELECT s FROM SLevelDifficultyMapping s")
public class SLevelDifficultyMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SLevelDifficultyMappingPK id;

	@Column(name="difficulty_type")
	private String difficultyType;

	@Column(name="level_color")
	private String levelColor;

	@Column(name="level_from")
	private int levelFrom;

	@Column(name="level_to")
	private int levelTo;

	public SLevelDifficultyMapping() {
	}

	public SLevelDifficultyMappingPK getId() {
		return this.id;
	}

	public void setId(SLevelDifficultyMappingPK id) {
		this.id = id;
	}

	public String getDifficultyType() {
		return this.difficultyType;
	}

	public void setDifficultyType(String difficultyType) {
		this.difficultyType = difficultyType;
	}

	public String getLevelColor() {
		return this.levelColor;
	}

	public void setLevelColor(String levelColor) {
		this.levelColor = levelColor;
	}

	public int getLevelFrom() {
		return this.levelFrom;
	}

	public void setLevelFrom(int levelFrom) {
		this.levelFrom = levelFrom;
	}

	public int getLevelTo() {
		return this.levelTo;
	}

	public void setLevelTo(int levelTo) {
		this.levelTo = levelTo;
	}

}