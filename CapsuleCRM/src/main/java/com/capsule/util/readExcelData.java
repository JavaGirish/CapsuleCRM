package com.capsule.util;

public class readExcelData {

	Xls_Reader reader = new Xls_Reader("/CapsuleCRM/src/main/java/com/capsule/testdata/CapsuleTestData.xlsx");

	public void readOrganizationData() {
		for (int i = 2; i <= reader.getRowCount("OR_DT"); i++) {

			String orgname = reader.getCellData("OR_DT", "OrgName", i);
			String tag = reader.getCellData("OR_DT", "Tag", i);
			String phoneno = reader.getCellData("OR_DT", "PhoneNo", i);
		}
	}

}
