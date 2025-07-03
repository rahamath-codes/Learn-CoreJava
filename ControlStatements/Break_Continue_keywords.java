package ControlStatements;
//| Feature        | `break`                                               | `continue`                                                   |
//| -------------- | ----------------------------------------------------- | ------------------------------------------------------------ |
//| Purpose        | **Exits the loop entirely**                           | **Skips current iteration and continues**                    |
//| Where it works | Inside loops (`for`, `while`) and `switch` statements | Only inside loops (`for`, `while`, `do-while`)               |
//| Use Case       | When you want to **stop looping early**               | When you want to **skip one iteration** based on a condition |

public class Break_Continue_keywords {
	public static void main(String[] args) {
		        // Loop from 1 to 10
		        for (int i = 1; i <= 10; i++) {

		            // If i is 4, skip this iteration (do not print 4)
		            if (i == 4) {
		            	System.err.println("4 is skiped");
		                continue;  // Skip the rest of this loop and go to next i
		            }

		            // If i is 8, break the loop completely
		            if (i == 8) {
		                break;     // Exit the loop
		            }

		            // Print the current value of i
		            System.out.println("i = " + i);
		}
	}
}
