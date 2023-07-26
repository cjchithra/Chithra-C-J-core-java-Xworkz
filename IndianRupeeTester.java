class IndianRupeeTester{
	public static void main(String args[]){
		IndianRupee rupee = new IndianRupee();
		rupee.setRupeeId(1);
		rupee.setRupeeName("rupee");
		rupee.setPrintDate("22 Jan 2022");
		rupee.setColor("brown");
		rupee.setSerialNo(10);
		rupee.setNoOfLanguages(15);
		rupee.setBackSidePriceName("sanchi stupa");
		rupee.setLocation("India");
		
		System.out.println(rupee.getRupeeId() + " " + rupee.getRupeeName() + " " + rupee.getPrintDate() + " " + rupee.getColor() + " " + rupee.getSerialNo() + " " + 		rupee.getNoOfLanguages() + " " + rupee.getBackSidePriceName() + " " + rupee.getLocation());

		
	}
}