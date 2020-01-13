package org.buspark.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;

@Entity
@Table(name = "BUSES")
public class Bus implements Serializable {

	private static final long serialVersionUID = 9181837529795705126L;
	@Id
	@Column(name = "BUSES_UID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@Column(name = "REG_NUMBER")
	private String regNumber;
	@ManyToOne
	@JoinColumn(name = "MODEL_ID")
	private BusModel model;
	@ManyToOne
	@JoinColumn(name = "ENGINE_ID")
	private BusEngine engine;
	@Column(name = "GARAGE_NUMBER")
	private String garageNumber;
	@ManyToOne
	@JoinColumn(name = "STATUS_ID")
	private BusStatus status;

	public Bus() {
		super();
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public BusModel getModel() {
		return model;
	}

	public void setModel(BusModel model) {
		this.model = model;
	}

	public BusEngine getEngine() {
		return engine;
	}

	public void setEngine(BusEngine engine) {
		this.engine = engine;
	}

	public String getGarageNumber() {
		return garageNumber;
	}

	public void setGarageNumber(String garageNumber) {
		this.garageNumber = garageNumber;
	}

	public BusStatus getStatus() {
		return status;
	}

	public void setStatus(BusStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bus [uid=" + uid + ", regNumber=" + regNumber + ", model=" + model + ", engine=" + engine
				+ ", garageNumber=" + garageNumber + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((garageNumber == null) ? 0 : garageNumber.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((regNumber == null) ? 0 : regNumber.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + uid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (garageNumber == null) {
			if (other.garageNumber != null)
				return false;
		} else if (!garageNumber.equals(other.garageNumber))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (regNumber == null) {
			if (other.regNumber != null)
				return false;
		} else if (!regNumber.equals(other.regNumber))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}
	
	

}
