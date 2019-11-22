package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Queen extends Ant{
	
	private List <Ant> ants = new ArrayList<>();
	
	public Queen(int x, int y, String id) {
		super(x, y, id);
	}

	//called at the beginning and thrice when queen receive water or food 
	public void giveBirth() {
		
		// force create worker
		this.ants.add(Ant.createAnt(1));
		// force create fighter
		this.ants.add(Ant.createAnt(2));
		
		Random randInt = new Random();
		int randomIndex = randInt.nextInt((2-1)+1) + 1;
		this.ants.add(Ant.createAnt(randomIndex));
	}

	public List<Ant> getAnts() {
		return ants;
	}

	public void setAnts(List<Ant> ants) {
		this.ants = ants;
	}

	@Override
	public String getBadge() {
		return "Q";
	}
}
