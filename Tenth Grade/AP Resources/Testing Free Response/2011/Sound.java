public class Sound {

	private int[] samples;

	public Sound(int[] sounds) {
		samples = sounds;
	}

	public int limitAmplitude(int limit) {
		int count = 0;
		for (int i = 0; i < samples.length; i++) {
			if (samples[i] > limit) {
				samples[i] = limit;
				count++;
			} else if (samples[i] < limit * -1) {
				samples[i] = limit * -1;
				count++;
			}
		}
		return count;
	}

	public void trimSilenceFromBeginning() {
		int count = 0;
		int temp[] = new int[samples.length];


		for (int i = 0; i < samples.length; i++) {
			if (samples[i] != 0) {
				System.out.println("break");
				break;
			} else {
				count++;
				for (int j = 1; j < samples.length - 1; j++) {
					System.out.println(count);
					samples[j - 1] = samples[j];
					printSound();
				}
			}
		}

		if (count > 0) {
			for (int i = 0; i < samples.length - count; i++) {
				temp[i] = samples[i];
			}
		}
		samples = temp;
	}

	public void printSound() {
		for (int sound: samples) {
			System.out.print(sound + " ");
		}
		System.out.println();
	}
}