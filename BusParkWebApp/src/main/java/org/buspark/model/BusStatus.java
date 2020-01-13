package org.buspark.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BUSES_STATUS")
public class BusStatus implements Serializable {

	private static final long serialVersionUID = -7904399372114488048L;

	@Id
	@Column(name = "STATUS_UID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String name;
	@Column(name = "DESCR")
	private String description;

	public BusStatus() {
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
		return "BusStatus [uid=" + uid + ", name=" + name + ", description=" + description + "]";
	}

}
