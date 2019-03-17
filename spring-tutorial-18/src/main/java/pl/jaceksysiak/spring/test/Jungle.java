package pl.jaceksysiak.spring.test;

import java.util.HashMap;
import java.util.Map;

public class Jungle {

	private Map<String, String> foods = new HashMap<String, String>();
	private Map<String, Animal> animals = new HashMap<String, Animal>();

	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, String> entry: foods.entrySet()){
			
			sb.append(entry.getKey() +": "+ entry.getValue() + "\n");
		}
		
		sb.append("\n");
		
		for(Map.Entry<String, Animal> entry: animals.entrySet()){
			
			sb.append(entry.getKey() +": "+ entry.getValue() + "\n");
		}
		
		return sb.toString();
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animals == null) ? 0 : animals.hashCode());
		result = prime * result + ((foods == null) ? 0 : foods.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jungle other = (Jungle) obj;
		if (animals == null) {
			if (other.animals != null)
				return false;
		} else if (!animals.equals(other.animals))
			return false;
		if (foods == null) {
			if (other.foods != null)
				return false;
		} else if (!foods.equals(other.foods))
			return false;
		return true;
	}
	

 
}




























