package LYT.Cycle;

class Cycle {
private int numberOfWheels;
private int weight;

Cycle(int numberOfWheels, int weight) {
	this.numberOfWheels = numberOfWheels;
	this.weight = weight;
}
public Cycle() {
	this(100,1000);
}
public String toString() {
	return "Number of wheels: " + numberOfWheels +", weight: " + weight;
}
}
