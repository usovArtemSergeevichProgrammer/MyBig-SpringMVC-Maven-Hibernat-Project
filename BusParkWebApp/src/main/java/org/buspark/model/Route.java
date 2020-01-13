package org.buspark.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ROUTES")
public class Route implements Serializable {

	private static final long serialVersionUID = -3931288395552321003L;

	@Id
	@Column(name = "ROUTE_UID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String number;
	@ManyToOne
	@JoinColumn(name = "START_ROUTE_ID")
	private ControlRoom startRoute;
	@ManyToOne
	@JoinColumn(name = "FINISH_ROUTE_ID")
	private ControlRoom finishRoute;
	private float distance;

	public Route() {
		super();
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public ControlRoom getStartRoute() {
		return startRoute;
	}

	public void setStartRoute(ControlRoom startRoute) {
		this.startRoute = startRoute;
	}

	public ControlRoom getFinishRoute() {
		return finishRoute;
	}

	public void setFinishRoute(ControlRoom finishRoute) {
		this.finishRoute = finishRoute;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Route [uid=" + uid + ", number=" + number + ", startRoute=" + startRoute + ", finishRoute="
				+ finishRoute + ", distance=" + distance + "]";
	}

}
