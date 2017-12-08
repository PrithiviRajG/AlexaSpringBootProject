package entity;



import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inapp_product_purchase_details database table.
 * 
 */
@Entity
@Table(name="inapp_product_purchase_details")
@NamedQuery(name="InappProductPurchaseDetail.findAll", query="SELECT i FROM InappProductPurchaseDetail i")
public class InappProductPurchaseDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="dev_model", length=20)
	private String devModel;

	@Column(name="os_name", length=20)
	private String osName;
	
	@Column(name="exam_id")
	private int examId;

	@Column(name="product_id", length=20)
	private String productId;

	@Column(name="product_type", length=20)
	private String productType;

	@Id
	@Column(length=400)
	private String reciept;

	@Column(length=400)
	private String signature;

	@Column(name="transaction_id", length=400)
	private String transactionId;

	@Column(name="user_id", length=50)
	private String userId;

	@Column(length=50)
	private String uuid;

	public InappProductPurchaseDetail() {
	}

	public String getDevModel() {
		return this.devModel;
	}

	public void setDevModel(String devModel) {
		this.devModel = devModel;
	}
	
	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}


	public String getOsName() {
		return this.osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getReciept() {
		return this.reciept;
	}

	public void setReciept(String reciept) {
		this.reciept = reciept;
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}