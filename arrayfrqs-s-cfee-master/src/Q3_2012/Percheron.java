package Q3_2012;

public class Percheron implements Horse{
	private String name;
	private int weight;
	
	public Percheron(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getWeight() {
		return weight;
	}
	
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof Percheron) {
			Percheron otherHorse = (Percheron) other;
			if (otherHorse.getName().equals(name) && otherHorse.getWeight() == weight){
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
