public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,10};
        int searchNumber = 9;
        linearSearch(numbers, searchNumber);
        binarySearch(numbers, searchNumber);
    }

    //time complexity O(log2n)
    private static void binarySearch(int[] numbers, int searchNumber) {
        int low = 0, high = numbers.length - 1;
        int mid;
        boolean numberFound = false;

        while(low <= high) {
            mid = low + (high - low) / 2;

            if(searchNumber == numbers[mid]) {
                System.out.println(searchNumber+" is in index "+mid);
                numberFound = true;
                break;
            }

            if(searchNumber > numbers[mid]) {
                low = mid + 1;
            }
            else if(searchNumber < numbers[mid]) {
                high = mid - 1;
            }
        }

        if(!numberFound) {
            System.out.println("number not found!");
        }

    }

    //time complexity O(n)
    private static void linearSearch(int[] numbers, int searchNumber) {
        boolean numberFound = false;
        for(int i = 0 ; i <= numbers.length - 1 ; i++) {
            if(searchNumber == numbers[i]) {
                System.out.println(searchNumber+" is in index "+i);
                numberFound = true;
                break;
            }
        }
        if(!numberFound) {
            System.out.println("number not found!");
        }
    }
}
