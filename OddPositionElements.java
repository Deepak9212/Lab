package Lab9March;

public class OddPositionElements {

 public static void main(String[] args) {
    String[] arr = {"a", "b", "c", "d", "e", "f"};

    printOddPositionElements(arr);
}

public static void printOddPositionElements(String[] arr) {
    for (int i = 0; i < arr.length; i += 2) {
        System.out.println(arr[i]);
    }
}
}
