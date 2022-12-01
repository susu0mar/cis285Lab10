package lab10;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSelectionSort {

	private SelectionSort x; //added
	@Test
	void test() {
		//testPositive();
		//testNegative();
		//testMixed();
		testDuplicates();
	}

	public TestSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        x = new SelectionSort(); //added
        arr = x.basicSelectionSort(arr); //added
        /** add tests to check for this unit test **/
        assertArrayEquals(Sortedarr, arr);
    }

    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        x = new SelectionSort(); //added
        arr = x.basicSelectionSort(arr); //added
        /** Test data contains negative values only **/
        assertArrayEquals(Sortedarr, arr);

    }
    
    public void testMixed(){

    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 0;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = 0;
        Sortedarr[2] = 2;
        Sortedarr[3] = 8;
        Sortedarr[4] = 10;

        x = new SelectionSort(); //added
        arr = x.basicSelectionSort(arr); //added
        /** Test data contains with both positive, negative and zeros **/
        assertArrayEquals( Sortedarr, arr);

    }

    public void testDuplicates(){

    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 8;
        Sortedarr[4] = 10;
        x = new SelectionSort(); //added
        arr = x.basicSelectionSort(arr); //added
        /** Test data contains duplicates **/
        assertArrayEquals( Sortedarr, arr);

    }
}
