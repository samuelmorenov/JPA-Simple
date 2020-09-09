package uo.ri.cws.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TVEHICLETYPES")
public class VehicleType extends BaseEntity {
	public enum Tamanio {
		GRANDE, MEDIANO, PEQUENIO
	}

	@Column(unique = true)
	private String name;
	private double pricePerHour;
	private int minTrainingHours;

	@OneToMany(mappedBy = "vehicleType")
	private Set<Certificate> certificates = new HashSet<>();

	// Added in the extension VehicleType
	VehicleType() {
	}

	public VehicleType(String name) {
		super();
		this.name = name;
	}

	public VehicleType(String name, double pricePerHour) {
		this(name);
		this.pricePerHour = pricePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPricePerHour() {
		return pricePerHour;
	}

	public int getMinTrainingHours() {
		return minTrainingHours;
	}

	Set<Certificate> _getCertificates() {
		return certificates;
	}

	public Set<Certificate> getCertificates() {
		return new HashSet<Certificate>(certificates);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		VehicleType other = (VehicleType) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VehicleType [name=" + name + ", pricePerHour=" + pricePerHour + "]";
	}

}
