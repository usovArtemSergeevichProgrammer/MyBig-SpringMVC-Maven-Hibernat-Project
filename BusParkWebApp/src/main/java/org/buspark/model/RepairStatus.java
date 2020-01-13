package org.buspark.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REPAIRS_STATUS")
public class RepairStatus implements Serializable {

	private static final long serialVersionUID = -6863370116887471004L;

	@Id
	@Column(name = "STATUS_UID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String name;
	@Column(name = "DESCR")
	private String description;

	public RepairStatus() {
		super();
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "RepairStatus [uid=" + uid + ", name=" + name + ", description=" + description + "]";
	}

}
