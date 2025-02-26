package lldElevator;

import java.util.PriorityQueue;

public class ElevatorController {
	PriorityQueue<Integer>minPQ;
	PriorityQueue<Integer>maxPQ;
	ElevatorCar elevatorCar;
	
	public ElevatorController(ElevatorCar elevatorCar) {
		this.elevatorCar=elevatorCar;
		minPQ = new PriorityQueue<>();
		maxPQ = new PriorityQueue<>((a,b)->b-a);
		
	}
	public void submitExternalRequest(int floor, Direction direction) {
		if(direction==Direction.DOWN) {
			maxPQ.offer(floor);
		}else {
			minPQ.offer(floor);
		}
		
	}
	public void submitInternalRequest(int floor) {
		
	}
	public void controlElevator() {
		while(true) {
			if(elevatorCar.elevatorDirection == Direction.UP) {
				
			}
		}
	}
}
