package stepdefs;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ElectricityBillTest {
	
	ElectricityBill electricityBill =new ElectricityBill();
	double rerievSlab;
	double electricityCharges;
	double calculatedDutyCharge_G;
	double calculatedDutyCharge_H;
	double calculatedDutyCharge_I;
	double TotalDutyCharge;
	
	
	@Given("My electricity bill is  {int}")
	public void my_electricity_bill_is(int units) {
		
		electricityBill.setUnits(units);
		int rerieveunits=  electricityBill.getUnits();
		
		System.out.println("rerieveunits=="+rerieveunits);
		
		Assert.assertEquals(units, rerieveunits);
		
		
		
	}

	
	/////CHECKING FOR ELECTRICITY CHARGE
	
	@Given("my slab is {double}")
	public void my_slab_is(double slab) {
		
		electricityBill.setSlab(slab);
		rerievSlab=  electricityBill.getSlabs();
		
		System.out.println("slab=="+slab);
		
		Assert.assertEquals(slab, rerievSlab,0);
		
	   
	}   
	
	@When("I calcuate for the energy charges")
	public void i_calcuate_for_the_energy_charges() {
		
		
		
		electricityCharges=electricityBill.calculateEnergyCharges();
		
		System.out.println("electricityCharges=="+electricityCharges);
	}

		
	
	@Then("I verify the {double}")
	public void i_verify_the(Double energyCharge) {
		
		//double energyChargeConsumed=electricityBill.calculateEnergyCharges();
		System.out.println("energyCharge=="+energyCharge);
		
		Assert.assertEquals(energyCharge, electricityCharges,0);
	}

	
		
	
////CHECKING FOR FCA CHARGE

		@When("FCA_slab is {double}")
		public void fca_slab_is(Double fca_slab) {
			
		
			electricityBill.setfcaSlab(fca_slab);
			double rerieve_fca_slab=  electricityBill.getfcaSlab();
			
			System.out.println("rerieve_fca_slab=="+rerieve_fca_slab);
			
			Assert.assertEquals(fca_slab, rerieve_fca_slab,0);
		}
		
		
		@Then("I verify the FCA charge {double}")
		public void i_verify_the_fca_charge(Double double1) {
		    // Write code here that turns the phrase above into concrete actions
		    
		}
		
/////  CHECKING FOR DUTY CHARGE
		
		@Given("my duty charge slab is {double}")
		public void my_duty_charge_slab_is(Double dutyslab) {
			
			electricityBill.setDutySlab(dutyslab);
			double rerievDutySlab=  electricityBill.getDutySlab();
			
			System.out.println("rerievDutySlab=="+rerievDutySlab);
			
			Assert.assertEquals(dutyslab, rerievDutySlab,0);
		    
		}

		@Given("I get slab wise duty charges <Slab wise duty charges = G>")
		public void i_get_slab_wise_duty_charges_slab_wise_duty_charges_g() {
			
			 
			 //
		    
		} 
		
		//Slab Wise Duty (G) : G=U * F
		@Given("I get slab wise duty charges {double}")
		public void i_get_slab_wise_duty_charges(Double dutycharge_G) {
			calculatedDutyCharge_G=  electricityBill.calculateDutyCharge__slabwise();
			Assert.assertEquals(dutycharge_G, calculatedDutyCharge_G,1);
		}

		//FCA on Duty (H) : H = G * 0.13
		@Given("I get FCA on Duty {double}")
		public void i_get_fca_on_duty(Double dutycharge_H) {
			
			calculatedDutyCharge_H=  electricityBill.calculateDutyCharge_FCA();
			Assert.assertEquals(dutycharge_H, calculatedDutyCharge_H,1);
		}
		
		
		@When("I calcaulte Total FCA Charges")
		public void i_calcaulte_total_fca_charges() {
			
			TotalDutyCharge=  electricityBill.calculateTotalDutyCharge();
		}

		

		@Then("I verify Total FCA Charges {double}")
		public void i_verify_total_fca_charges(Double dutycharge_Total) {
			Assert.assertEquals(dutycharge_Total, TotalDutyCharge,1);
		}




			/*@Given("My electricity bill is {double}")
			public void my_duty_charge_slab_is(Double dutyslab) {
				
				
				electricityBill.setDutySlab(dutyslab);
				double rerievDutySlab=  electricityBill.getDutySlab();
				
				System.out.println("rerievDutySlab=="+rerievDutySlab);
				
				Assert.assertEquals(dutyslab, rerievDutySlab,0);
			   
			}
			
			@Given("I get slab wise duty charges {double}")
			public void i_get_slab_wise_duty_charges(Double dutyslab) {
				
				electricityBill.setDutySlab(dutyslab);
				double rerievDutySlab=  electricityBill.getDutySlab();
				
				System.out.println("rerievDutySlab=="+rerievDutySlab);
				
				Assert.assertEquals(dutyslab, rerievDutySlab,0);
			}
			
			@Given("I get FCA on Duty <FCA_Duty_charges= H >")
			public void i_get_fca_on_duty_fca_duty_charges_h() {
			    // Write code here that turns the phrase above into concrete actions
			    throw new io.cucumber.java.PendingException();
			}
			
			
			@When("I calculate slab wise duty charges {double}")
			public void i_calculate_slab_wise_duty_charges(Double dutyCharge) {
				
				System.out.println("dutyCharge=="+dutyCharge);
				
				double calculatedDutyCharge=  electricityBill.calculateDutyCharge();
				
				System.out.println("calculatedDutyCharge=="+calculatedDutyCharge);
				
				Assert.assertEquals(dutyCharge, calculatedDutyCharge,1);
			   
			}


			@Then("I verify slab wise duty charges")
			public void i_verify_slab_wise_duty_charges() {
			    
			}
			
			

			
			@When("I get FCA on Duty <Total_Duty_charges G+H=I >")
			public void i_get_fca_on_duty_total_duty_charges_g_h_i() {
			    // Write code here that turns the phrase above into concrete actions
			    throw new io.cucumber.java.PendingException();
			}*/

			
///////  CHECKING FOR TOTAL CHARGES 		
							
			@Given("my units are upto {int} and duty slab is {double}")
			public void my_units_are_upto_and_duty_slab_is(Integer int1, Double double1) {
			    // Write code here that turns the phrase above into concrete actions
			    
			}

			@When("I check for the Total bill amount")
			public void i_check_for_the_total_bill_amount() {
			    // Write code here that turns the phrase above into concrete actions
			    
			}
			
			@Then("I verify the Total amount {double}")
			public void i_verify_the_total_amount(Double double1) {
			    // Write code here that turns the phrase above into concrete actions
			    //throw new io.cucumber.java.PendingException();
			}



			


	
	
	
	
	
	







}
