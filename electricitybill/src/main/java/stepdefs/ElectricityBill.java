package stepdefs;

public class ElectricityBill {
	
	private int unitsConsumed;
	private double slabUsed;
	private double energyCharge;
	private double fcaSlabCharge;
	private double return_dutyslab;
	private double calculateSlabWiseDutyCharge;
	private double calculateFCADutyCharge;
	private double TotalDutyCharge;
	
	

	public void setUnits(Integer units) {
		// TODO Auto-generated method stub
		unitsConsumed= units;
		
		
	}

	public int getUnits() {
		// TODO Auto-generated method stub
		return unitsConsumed;
	}

	public void setSlab(Double slab) {
		// TODO Auto-generated method stub
		slabUsed= slab;
		
	}
	
	public double getSlabs() {
		// TODO Auto-generated method stub
		return slabUsed;
	}

	public double calculateEnergyCharges() {
		// TODO Auto-generated method stub
		
		energyCharge =unitsConsumed *slabUsed;
		return energyCharge;
		
	}

	public void setfcaSlab(double fca_slab) {
		// TODO Auto-generated method stub
		
		fcaSlabCharge= fca_slab;
		
	}

	public double getfcaSlab() {
		// TODO Auto-generated method stub
		return fcaSlabCharge;
	}

	public void setDutySlab(Double dutyslab) {
		return_dutyslab = dutyslab;
		
	}

	public double getDutySlab() {
		// TODO Auto-generated method stub
		return return_dutyslab;
	}
	
	
	//Slab Wise Duty (G) : G=U * F
	public double calculateDutyCharge__slabwise() {
	
		System.out.println("unitsConsumed=="+unitsConsumed);
		System.out.println("return_dutyslab=="+return_dutyslab);
		 
		calculateSlabWiseDutyCharge = unitsConsumed * return_dutyslab;
		
		
		return calculateSlabWiseDutyCharge;
}

	public double calculateDutyCharge_FCA() {
		
		calculateFCADutyCharge = calculateSlabWiseDutyCharge*0.13;
		return calculateFCADutyCharge;
	}

	public double calculateTotalDutyCharge() {
		// TODO Auto-generated method stub
		TotalDutyCharge = calculateSlabWiseDutyCharge + calculateFCADutyCharge;
		return TotalDutyCharge;
	}
	
	

	

	

}
