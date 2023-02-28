import java.util.PriorityQueue;

public class MultipleSums1354 {
	public static void main(String[] args) {
		int[] target = { 1, 1, 10 };
		System.out.print(isPossible(target));
	}

	public static boolean isPossible(int[] target) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> b - a);
		int sum = 0;
		for (int i = 0; i < target.length; i++) {
			sum += target[i];
			queue.add(target[i]);
		}
		while (queue.peek() != 1) {
			int num = queue.poll();
			sum -= num;
			if (num <= sum || sum < 1)
				return false;
			num = num % sum;
			sum += num;
			queue.add(num <= 0 ? sum : num);
		}
		return true;
	}
}
