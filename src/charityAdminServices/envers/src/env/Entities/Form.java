package env.Entities;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

public class Form {

	
	private Integer formId;
	private FormType formTypeId;
	private String formName;
	private Date dateCreated;
	private String url;
	private Boolean isActive;
	private Timestamp timestamp;
	private Set<FormPermissions> permissions;
	
	
	public Set<FormPermissions> getPermissions() {
		return permissions;
	}
	public void setPermissions(Set<FormPermissions> permissions) {
		this.permissions = permissions;
	}
	public Integer getFormId() {
		return formId;
	}
	public void setFormId(Integer formId) {
		this.formId = formId;
	}
	public FormType getFormTypeId() {
		return formTypeId;
	}
	public void setFormTypeId(FormType formTypeId) {
		this.formTypeId = formTypeId;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
}