package observable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sravan This class acts as a observable
 */
public class Salary {

	private List<Observer> observers = new ArrayList<Observer>();
	private int hike;

	public int getHike() {
		return hike;
	}

	public void setHike(int hike) {
		this.hike = hike;
		notifyObservers();
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	private void notifyObservers() {

		for (Observer observer : observers) {
			observer.update();
		}

	}

}
