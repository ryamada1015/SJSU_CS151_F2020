package Assignment3;

public class BusinessTest {

	public static void main(String[] args) {

		Address addr1 = new Address(23501, "W Clark St", "Plainfield", "60586", "Illinois");
		Customer customer1 = new Customer("Joe", "Smith", addr1, 1234);
		customer1.setAge(29);
		customer1.setAddress(addr1);
		customer1.setPaymentPref("Credit card");
		customer1.introduce();
		
		Address addr2 = new Address(145, "Maple St", "Manchester", "17345", "Pennsylvania");
		Customer customer2 = new Customer("Lisa", "Gray", addr2, 9876);
		customer2.setAge(30);
		customer2.setAddress(addr2);
		customer2.setPaymentPref("Cash");
		customer2.introduce();
		
		Address addr3 = new Address(427, "Jackson Rd", "Sewell", "08080", "New Jersey");
		Double pay1 = Double.valueOf(4000);
		Contractor contractor1 = new Contractor("Timothy", "Briggs", addr3, pay1, 8304);
		pay1 = contractor1.computePay(1920);
		contractor1.setAge(44);
		contractor1.setSSN("275653957");
		contractor1.setEducation("Bachelor's in Businness");
		contractor1.setDirectDeposit(false);
		contractor1.introduce(true);
		
		Address addr4 = new Address(69, "E 6th St", "Mount Pleasant", "72561", "Arkansas");
		Double pay2 = Double.valueOf(2000);
		Contractor contractor2 = new Contractor("George", "Wallace", addr4, pay2, 3599);
		pay2 = contractor2.computePay(1920);
		contractor2.setAge(39);
		contractor2.setSSN("49042667");
		contractor2.setEducation("Bachelor's in Businness");
		contractor2.setDirectDeposit(true);
		contractor2.introduce(true);
		
		Address addr5 = new Address(3076, "N Mission Rd", "Tallahassee", "32303", "Florida");
		Double pay3 = Double.valueOf(1000);
		PartTimeHourly PartTime1 = new PartTimeHourly("Amy", "Student", addr5, pay3);
		pay3 = PartTime1.computePay(30);
		PartTime1.setAge(24);
		PartTime1.setSSN("962757533");
		PartTime1.setEducation("Bachelor's in Economics");
		PartTime1.setDirectDeposit(true);
		PartTime1.introduce(true);
		
		Address addr6 = new Address(20, "Fort Putnam St", "Highland Falls", "10928", "New York");
		Double pay4 = Double.valueOf(2100);
		PartTimeHourly PartTime2 = new PartTimeHourly("Josh", "Scott", addr6, pay4);
		pay4 = PartTime1.computePay(35);
		PartTime2.setAge(22);
		PartTime2.setSSN("284811405");
		PartTime2.setEducation("Associates in Psychology");
		PartTime2.setDirectDeposit(true);
		PartTime2.introduce(true);
		
		Address addr7 = new Address(1551, "Horner Ln", "Argyle", "53504", "Wisconsin");
		Double pay5 = Double.valueOf(100000);
		Double bonus1 = Double.valueOf(1000);
		Executive executive1 = new Executive("Andrew", "Albanese", addr7, 8424, pay5, bonus1);
		pay5 = executive1.computePay();
		executive1.setAge(50);
		executive1.setSSN("715539567");
		executive1.setEducation("Master's in Sociology");
		executive1.setDirectDeposit(true);
		executive1.introduce(true);
		
		Address addr8 = new Address(5925, "45th Hwy #17", "Eight Mile", "36613", "Alabama");
		Double pay6 = Double.valueOf(50000);
		Double bonus2 = Double.valueOf(2000);
		Executive executive2 = new Executive("Lana", "Aniston", addr8, 3088, pay6, bonus2);
		pay6 = executive2.computePay();
		executive2.setAge(37);
		executive2.setSSN("295569312");
		executive2.setEducation("Bacelor's in Businness");
		executive2.setDirectDeposit(true);
		executive2.introduce(true);
		
		Address addr9 = new Address(3, "Ashley Rd", "Naylor", "31641", "Georgia");
		Double pay7 = Double.valueOf(30000);
		FullTimeSalaried fullSalaried1 = new FullTimeSalaried("Lee", "Wong", addr9, pay7);
		pay7 = fullSalaried1.computePay(9);
		fullSalaried1.setAge(27);
		fullSalaried1.setSSN("631697701");
		fullSalaried1.setEducation("Bacelor's in Businness");
		fullSalaried1.setDirectDeposit(false);
		fullSalaried1.introduce(true);
		
		Address addr10 = new Address(508, "E 4th St", "Villisca", "50864", "Iowa");
		Double pay8 = Double.valueOf(40000);
		FullTimeSalaried fullSalaried2 = new FullTimeSalaried("Sam", "Payne", addr10, pay8);
		pay8 = fullSalaried2.computePay(10);
		fullSalaried2.setAge(27);
		fullSalaried2.setSSN("631697701");
		fullSalaried2.setEducation("Bacelor's in Businness");
		fullSalaried2.setDirectDeposit(false);
		fullSalaried2.introduce(true);
		
		Address addr11 = new Address(195, "Private 8671 Rd", "Carthage", "75633", "Texas");
		Double pay9 = Double.valueOf(2500);
		Double overtime1 = Double.valueOf(20);
		FullTimeHourly fullHour1 = new FullTimeHourly("Lynn", "Lawrence", addr11, 3456, pay9, overtime1);
		pay9 = fullHour1.computePay(1920);
		fullHour1.setAge(48);
		fullHour1.setSSN("378752179");
		fullHour1.setEducation("Bacelor's in Architecture");
		fullHour1.setDirectDeposit(true);
		fullHour1.introduce(true);
		
		Address addr12 = new Address(2292, "N Cedar Dr", "Apache Junction", "85220", "Arizona");
		Double pay10 = Double.valueOf(3000);
		Double overtime2 = Double.valueOf(10);
		FullTimeHourly fullHour2 = new FullTimeHourly("Otis", "Chen", addr12, 7781, pay10, overtime2);
		pay10 = fullHour2.computePay(1920);
		fullHour2.setAge(48);
		fullHour2.setSSN("826482653");
		fullHour2.setEducation("Bacelor's in Computer Science");
		fullHour2.setDirectDeposit(true);
		fullHour2.introduce(true);
	}

}