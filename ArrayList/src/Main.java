
public class Main {
	public static void main(String[] args) {
		ArrayListImplementation<Integer> arr = new ArrayListImplementation<>(3);
		arr.add(10);
		arr.add(10);
		arr.add(10);
		arr.add(10);

		for(int i = 0; i< arr.currentSize; i++) {
			System.out.println(arr.get(i));
		};
		System.out.println(arr.isEmpty());
		arr.clear();
		System.out.println(arr.isEmpty());
	}
}
