public class Main {
	public static void main(String[] args) {
		int[] arr = generateRandomArray();
		taskOne(arr);
		taskTwo(arr);
		taskThree(arr);
		taskFour();
	}

	public static int[] generateRandomArray() {
		java.util.Random random = new java.util.Random();
		int[] arr = new int[30];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100_000) + 100_000;
		}
		return arr;
	}

	static void taskOne(int[] arr) {
		System.out.println("Task 1");
		int sumMonth = 0;
		for (int sumDay : arr) {
			sumMonth += sumDay;
		}
		System.out.printf("Сумма трат за месяц составила %d рублей", sumMonth);
		System.out.println();
	}

	static void taskTwo(int[] arr) {
		System.out.println("Task 2");
		int minSum = arr[0];
		int maxSum = arr[0];
		for (int sumDay : arr) {
			if (sumDay < minSum) {
				minSum = sumDay;
			}
			if (sumDay > maxSum) {
				maxSum = sumDay;
			}
		}
		System.out.printf("Минимальная сумма трат за день составила %d рублей. " +
						"Максимальная сумма трат за день составила %d рублей",
						minSum, maxSum);
		System.out.println();
	}

	static void taskThree(int[] arr){
		System.out.println("Task 3");
		double avrSum = 0;
		double sumMonth = 0;
		int contDay = 0;
		for (double sumDay:arr){
			contDay++;
			sumMonth += sumDay;
		}
		if (contDay > 0){
			avrSum = sumMonth / contDay;
		}
		System.out.printf("Средняя сумма трат за месяц составила %f рублей", avrSum);
		System.out.println();
	}

	static void taskFour(){
		System.out.println("Task 4");
		 char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
		for (int i = reverseFullName.length - 1;i>=0;i--){
			System.out.println(reverseFullName[i]);
		}
	}
}