package com.demo.demoSpringInizializer.model;

import java.io.Serializable;
import java.util.Objects;

public class DataStateLocation implements Serializable{
	private String state;
	private String country;
	private int lastTotalCase;
	private int diffFromPrevDay;
	
	
	public DataStateLocation(String state, String country, int lastTotalCase) {
		   this.state = state;
		   this.country = country;
		   this.lastTotalCase = lastTotalCase;
	}

	public DataStateLocation() { }

	@Override
	public int hashCode() {
		return Objects.hash(country, lastTotalCase, state);
	}

	public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

	public int getLastTotalCase() {
		return lastTotalCase;
	}

	public void setLastTotalCase(int lastTotalCase) {
		this.lastTotalCase = lastTotalCase;
	}


	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataStateLocation other = (DataStateLocation) obj;
		return Objects.equals(country, other.country) && lastTotalCase == other.lastTotalCase
				&& Objects.equals(state, other.state);
	}

	@Override
	public String toString() {
		return "DataStateLocation [state=" + state + ", country=" + country + ", lastTotalCase=" + lastTotalCase + "]";
	}
	
}
