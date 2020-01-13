package org.buspark.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REPAIRS")
public class Repair implements Serializable {

	private static final long serialVersionUID = 7078823073889388380L;

	@Id
	@Column(name = "REPAIR_UID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@ManyToOne
	@JoinColumn(name = "BUS_ID")
	private Bus bus;
	@ManyToOne
	@JoinColumn(name = "STATUS_ID")
	private RepairStatus status;
	private String problems;
	@Column(name = "REG_DATE")
	private Date regDate;
	@Column(name = "LAST_UPDATE")
	private Date lastUpdate;

	public Repair() {
		super();
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public RepairStatus getStatus() {
		return status;
	}

	public void setStatus(RepairStatus status) {
		this.status = status;
	}

	public String getProblems() {
		return problems;
	}

	public void setProblems(String problems) {
		this.problems = problems;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Repair [uid=" + uid + ", bus=" + bus + ", status=" + status + ", problems=" + problems + ", regDate="
				+ regDate + ", lastUpdate=" + lastUpdate + "]";
	}

}
