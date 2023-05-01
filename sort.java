
public class sort {

    public static void print(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number + ",");
        }
        System.out.println();
    }

    public static void merge(int[] numbers, int startIndex, int middleIndex, int endIndex) {
        int indexA = startIndex;
        int indexB = middleIndex;
        int[] merged = new int[endIndex - startIndex];
        int indexMerged = 0;

        while (indexA < middleIndex || indexB < endIndex) {

            if (indexA == middleIndex) {
                merged[indexMerged] = numbers[indexB];
            }

            else if (indexB == endIndex) {
                merged[indexMerged] = numbers[indexA];
                indexA++;
            } else if (numbers[indexA] <= numbers[indexB]) {
                merged[indexMerged] = numbers[indexA];
                indexA++;

            } else {
                merged[indexMerged] = numbers[indexB];
                indexB++;
            }
            indexMerged++;
        }

        for (int i = 0; i < merged.length; i++) {
            numbers[startIndex + i] = merged[i];
        }
    }

    public static void megresort(int[] numbers) {
        mergesort(numbers, 0, numbers.length);

    }

    public static void mergesort(int[] numbers, int startIndex, int endIndex) {

        int size = endIndex - startIndex;

        if (size <= 1) {
            return;
        }

        int middleIndex = startIndex + size / 2;

        mergesort(numbers, startIndex, middleIndex);

        mergesort(numbers, middleIndex, endIndex);

        merge(numbers,startIndex, middleIndex, endIndex);

    }

    public static void main(String[] args) {
        int[] numbers = { 5, 2, 3, 8, 0, 4 };

        print(numbers);

        megresort(numbers);

        print(numbers);
    }

}
