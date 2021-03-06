package mx.edu.utez.apikanban.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
@Table(name = "ProductBacklog")
public class ProductBacklogEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String funcionality;
	private int priority;
	private int status;
	private Date statusDate= new Date(); 
	@ManyToOne
    private ProjectEntity project;
	@ManyToOne
    private ScrumTeamEntity developer;
	
	@JsonBackReference
	public ProjectEntity getProject() {
		return project;
	}
	
	public ScrumTeamEntity getDeveloper() {
		return developer;
	}
	public void setDeveloper(ScrumTeamEntity developer) {
		this.developer = developer;
	}
	public void setProject(ProjectEntity project) {
		this.project = project;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getFuncionality() {
		return funcionality;
	}
	public void setFuncionality(String funcionality) {
		this.funcionality = funcionality;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
