class BankTest{
	public static void main(String args[]){
		Bank bank = new Bank();
		bank.setBankId(1);
		
		Bank bank1 = new Bank();
		bank1.setBankName("SBI");
		
		Bank bank2 = new Bank();
		bank2.setBranch("ADB BARWALA");
		
		Bank bank3 = new Bank();
		bank3.setBranchCode(036623);
		
		Bank bank4 = new Bank();
		bank4.setAddress("Haryana");
		bank.setHelplineNo(1930);
		bank.setBranchManager("ramesh");
		bank.setIfscCode("SBIN0003623");
		bank.setMiscCode(125002065);
		bank.setNoOfLockers(10);
		bank.setNoOfEmployees(50);
		bank.setWebsiteDetails("https://wwww.SBI");
		
		System.out.println(bank.getBankId() + " " + bank1.getBankName() + " " + bank2.getBranch() + " " + bank3.getBranchCode() + " " + bank4.getAddress() + " " + bank.getHelplineNo() + " " + bank.getBranchManager() + " " + bank.getIfscCode() + " " + bank.getMiscCode() + " " + bank.getNoOfLockers() + " " + bank.getNoOfEmployees() + " " + 		bank.getWebsiteDetails());



	}
}