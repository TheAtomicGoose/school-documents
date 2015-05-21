import java.util.*;

public class Tournament {

	private Player[] slots = new Player[10];

	private List<String> waitingList;

	public void printSlots() {
		for (Player p: slots) {
			System.out.print(p.getName() + " " + p.getPlayerNumber());
		}
	}

	public Player requestSlot(String playerName) {
		int availableIndex = 0;
		for (int i = 0; i < slots.length; i++) {
			if (slots[i] == null) {
				availableIndex = i;
				break;
			} else {
				availableIndex = -1;
			}
		}

		if (availableIndex >= 0) {
			slots[availableIndex] = new Player(playerName, availableIndex);
			return slots[availableIndex];
		} else {
			waitingList.add(playerName);
			return null;
		}
	}

	public Player cancelAndReassignSlot(Player p) {
		int emptySlot = p.getPlayerNumber();
		slots[emptySlot] = null;

		if (waitingList.size() > 0) {
			Player newPlayer = new Player(waitingList.get(0), emptySlot);
			slots[emptySlot] = newPlayer;
			waitingList.remove(0);
			return newPlayer;
		} else {
			return null;
		}
	}
}