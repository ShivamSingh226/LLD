package adapterDP.Client;

import adapterDP.Adaptee.WeightMachineImpl;
import adapterDP.Adaptor.WeightMachineKgImpl;
import adapterDP.Adaptor.WeightMachineAdapter;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeightMachineAdapter weightMachineAdapter=new WeightMachineKgImpl(new WeightMachineImpl());
		System.out.println(weightMachineAdapter.getWeightInKg());
	}

}
