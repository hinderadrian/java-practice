package practicecoding;

public class ClockAlgorithm {
	public static void main(String[] args) {
		int hours = 0, minutes = 0, seconds = 0;

		while(hours < 24) {
			while(minutes < 60) {
				while(seconds < 60) {
					System.out.print(hours);
					System.out.print(":");
					System.out.print(minutes);
					System.out.print(":");
					System.out.println(seconds);
					seconds += 1;
				}
				seconds = 0;
				minutes += 1;
			}
			minutes = 0;
			hours += 1;
		}
	}
}
