class PassportTester{
	public static void main(String args[]){
		Passport passport = new Passport();
		passport.setPassportId(1);
				
		Passport passport1 = new Passport();
		passport1.setName("Chithra");
				
		Passport passport2 = new Passport();
		passport2.setDob("20 Jan 2002");
				
		Passport passport3 = new Passport();
		passport3.setBirthPlace("Chikmagalur");
				
		Passport passport4 = new Passport();
		passport4.setNationality("Indian");
		
		passport.setAddress("Bypass Chikmagalur");
		passport.setParent("Father");
		passport.setSupportingProof("Aadhar");
		passport.setFees(2000);
		passport.setContactNumber(98765);
		
		System.out.println(passport.getPassportId() + " " + passport1.getName() + " " + passport2.getDob() + " " + passport3.getBirthPlace() + " " + passport4.getNationality() + " " + passport.getAddress() + " " + passport.getParent() + " " + passport.getSupportingProof() + " " + passport.getFees() + " " + passport.getContactNumber());
		
		
		
	}
}