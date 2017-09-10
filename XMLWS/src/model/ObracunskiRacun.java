package model;

import java.math.BigDecimal;

public class ObracunskiRacun {
	private String broj;
	private BigDecimal stanje;
	
	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public BigDecimal getStanje() {
		return stanje;
	}

	public void setStanje(BigDecimal stanje) {
		this.stanje = stanje;
	}
	
}
