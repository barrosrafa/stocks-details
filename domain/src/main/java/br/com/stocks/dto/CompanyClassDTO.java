package br.com.stocks.dto;

public class CompanyClassDTO {

	private String companyCode;
	private String companyName;
	private String companyClass;
	
	public CompanyClassDTO() {
	}

	public CompanyClassDTO(String companyCode, String companyName, String companyClass) {
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.companyClass = companyClass;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyClass() {
		return companyClass;
	}

	public void setCompanyClass(String companyClass) {
		this.companyClass = companyClass;
	}

}
