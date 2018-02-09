package com.vbsoft.item2;
/**
 * create a <p>{@code}Builder{@code} Class
 * 			with Required Parameters as final
 *			with Optional Parameters as non-final
 * create a constructor with required parameters
 * for each optional parameter
 * 			create methods that return Builder object with that parameter set
 * 			provide a build method that returns the parent class
 * 
 * Usage
 * NutritionFacts nutritionFacts = new NutritionFacts.Builder(requireParam1,requiredParam2).optionalParam1(optionalParam1).build();
 * @author vishwajeetbhatt
 *
 */
public class NutritionFacts {

	private final int requiredParam1;
	private final int requiredParam2;
	private final int optionalParam1;
	private final int optionalParam2;
	
	public int getRequiredParam1() {
		return requiredParam1;
	}

	public int getRequiredParam2() {
		return requiredParam2;
	}

	public int getOptionalParam1() {
		return optionalParam1;
	}

	public int getOptionalParam2() {
		return optionalParam2;
	}
	
	// create a Builder Class
	//		with Required Parameters as final
	//		with Optional Parameters as non-final
	// create a constructor with required parameters
	// for each optional parameter
	// 		create methods that return Builder object with that parameter set
	// provide a build method that returns the parent class
	// 
	//
	public static class Builder{
		
		private final int requiredParam1;
		private final int requiredParam2;
		//optional parameters will not be final 
		private int optionalParam1=0;
		private int optionalParam2=0;
		
		public Builder(int requiredParam1, int requiredParam2) {
			this.requiredParam1 = requiredParam1;
			this.requiredParam2 = requiredParam2;
		}

		public Builder optionalParam1(int optionalParam1) {
			this.optionalParam1 = optionalParam1;
			return this;
		}
		
		public Builder optionalParam2(int optionalParam2) {
			this.optionalParam2 = optionalParam2;
			return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
		
	}
	
	private NutritionFacts(Builder builder) {
		requiredParam1 = builder.requiredParam1;
		requiredParam2 = builder.requiredParam2;
		optionalParam1 = builder.optionalParam1;
		optionalParam2 = builder.optionalParam2;
	}
	
	
}
