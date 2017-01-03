package hw;

import java.util.Scanner;

/*
 * Date: 2016/12/12
 * Author: 105021033 黃苡珊
 */
public class hw01 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int n = scn.nextInt();

		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);

			if (ch1 >= 65 && ch1 <= 90) {
				if (ch1 + n > 90) {
					System.out.print((char) ((int) ch1 + n - 26));
				} else {
					System.out.print((char) ((int) ch1 + n));
				}
			} else if (ch1 >= 97 && ch1 <= 122) {
				if (ch1 + n > 122) {
					System.out.print((char) ((int) ch1 + n - 26));
				} else {
					System.out.print((char) ((int) ch1 + n));
				}
			} else {
				System.out.print((char) ch1);
			}
		}
	}
}