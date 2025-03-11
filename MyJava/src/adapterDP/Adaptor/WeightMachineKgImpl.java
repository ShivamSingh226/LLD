package adapterDP.Adaptor;

import adapterDP.Adaptee.WeightMachine;

public class WeightMachineKgImpl implements WeightMachineAdapter {
	WeightMachine weightMachine;
	public WeightMachineKgImpl(WeightMachine weightMachine) {
		this.weightMachine=weightMachine;
	}
	@Override
	public double getWeightInKg() {
		double getWeightInPound=weightMachine.getWeightInPound();
		double weightInKg=getWeightInPound*0.45;
		return weightInKg;
	}
}
