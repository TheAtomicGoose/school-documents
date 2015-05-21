public class SoundTest {

	public static void main(String[] args) {

		// int[] nums = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
		
		// Sound s = new Sound(nums);

		// s.limitAmplitude(2000);

		// s.printSound();

		int[] nums2 = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};

		Sound sound = new Sound(nums2);

		sound.trimSilenceFromBeginning();

		sound.printSound();
	}
}