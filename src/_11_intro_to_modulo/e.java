package _11_intro_to_modulo;

import java.util.Random;

public class e {public static void main(String[] args) {
	
	


for (int i=1; i<=1000; i++) {
    // do some code
	int number = new Random().nextInt(100);
    if (number % 2 == 0) {
        System.out.println(number+" number is even");
    }
    else {
        System.out.println(number+" number is odd");
    }

}
}

}
