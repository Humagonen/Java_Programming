
public class Order_numbers {

	public static void main(String[] args) {
		int a = 10, b = -10, c = 3;

		if (a > b) {

			if (a > c) {

				if (b > c) {

					System.out.println("The order is:" + a + "," + b + "," + c);

				}
				else {

					System.out.println("The order is:" + a + "," + c + "," + b);

				}

			}
			else {
				if (b > c) {

					System.out.println("The order is:" + b + "," + c + "," + a);

				}
				else {
					if (a > b) {

						System.out.println("The order is:" + c + "," + a + "," + b);

					}
					else {
						System.out.println("The order is:" + c + "," + b + "," + a);
					}
				}
			}

		}
		else {

			if (c > b) {
				System.out.println("The order is:" + c + "," + b + "," + a);
			}
			else {
				if (a > c) {
					System.out.println("The order is:" + b + "," + a + "," + c);
				}
				else {
					System.out.println("The order is:" + b + "," + c + "," + a);
				}

			}

		}

	}

}

// do it with else ifs and AND operator
