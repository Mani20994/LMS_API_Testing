package com.qa.data;


public class Users {

	String id;
	String code;
	String name;

//	String termName;
//	String description;
	String effectiveDate;
	String endDate;
	String Organisation;
	public Users() {
		
	}
	
public Users(String id, String code, String name, String effectiveDate , String endDate,String Organisation) {
		
	this.id=id;
	this.code=code;
     this.name=name;
//	this.description=description;
//	this.type=type ;
//	this.city=city;
	this.effectiveDate=effectiveDate;
	this.endDate=endDate;
	this.Organisation=Organisation;
	}
//getters & setters methods

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getcode() {
	return code;
}

public void setorgcode(String code) {
	this.code = code;
}




public String getname() {
	return name;
}


public void setname(String name) {
	this.name = name;
}
//public String getdescription() {
//	return description;
//}
//
//public void setdescription(String description) {
//	this.description = description;
//}	
	
//public String gettype() {
//	return type;
//}
//
//public void settype(String type) {
//	this.type = type;
//}	
//
//
//public String getcity() {
//	return city;
//}
//
//public void setcity(String city) {
//	this.city = city;
//}	




public String geteffectiveDate() {
	return effectiveDate;
}

public void seteffectiveDate(String effectiveDate) {
	this.effectiveDate = effectiveDate;
}	
	
public String getendDate() {
	return endDate;
}

public void setendDate(String endDate) {
	this.endDate = endDate;
}	

public String getOrganisation() {
	return Organisation;
}

public void setOrganisation(String Organisation ) {
	this.Organisation =Organisation ;
}	


}
