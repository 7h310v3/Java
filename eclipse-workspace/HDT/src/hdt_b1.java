
public class hdt_b1 {

	// public static void arrayCopy(int [] src, int [] des){

	// 	des = src;    

	// 	System.out.print("Mang des: ");	
    //     for (int number: des) {
    //        System.out.print(number + ", ");
	// 	}

	// }


	// public static void getUniqueElements(int[] arr){
	// 	for (int i = 0; i < arr.length; i++) {
	// 		int flag = 0;
    //         for (int j = 1; j < arr.length; j++) {
    //             if (arr[i] == arr[j]) {
	// 				flag = 1;
	// 			}
    //         }
	// 		if (flag == 0) {
	// 			System.out.println("So" + i + "la doc nhat trong mang!");			
	// 		}
    //     }
	// }

	public static void main(String[] args) {
		// int MAX = 5;
		// boolean bit[] = new boolean[MAX];
		// float[] value = new float[2*3];
		// int[] number = {10, 9, 8, 7, 6};
		// System.out.println(bit[0]);
		// System.out.println(value[3]);
		// System.out.println(number[1]); 

		
		// copying arrays
		// int [] src = {1, 2, 3, 4, 5, 6};
        // int [] des = {};    
		// arrayCopy(src, des);


		int[] arr = {1, 2, 1, 3, 2, 5, 7, 8, 8, 9};
		// getUniqueElements(src);
		// for (int i : src) {
		// 	System.out.print(i + " ");
		// }

		System.out.print("Mang arr: ");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		
		for (int i = 0; i < arr.length; i++) {
			// int flag = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
					// flag = 1;
					break;
				}
				System.out.print("arr[i] = " + arr[i] + "\t");
				System.out.print("arr[j] = " + arr[j] + "\t");
				// System.out.print("flag = " + flag + "\n");
				System.out.println("\n=========================================");
            }

        }

	}

}