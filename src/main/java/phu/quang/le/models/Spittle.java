package phu.quang.le.models;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spittle {
	private final Long id;
	private final String message;
	private Date time;
	private Double latitude;
	private Double longitude;
	
	public Spittle(String message, Date time) {
		this(message, time, null, null);
	}
	
	public Spittle(String message, Date time, Double longitude, Double latitude) {
		this.id = null;
		this.message = message;
		this.setLongitude(longitude);
		this.setLatitude(latitude);
	}

	public Long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getTime() {
		return time;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that, "id", "time");
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id", "time");
	}
}
