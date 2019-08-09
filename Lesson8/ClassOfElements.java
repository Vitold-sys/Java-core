package Lesson8;

public class ClassOfElements {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1, 2, 3};
        Double[] arr2 = new Double[]{4.0, 5.0, 6.0};
        String[] arr3 = new String[]{"aa", "bb", "cc"};
        System.out.println(AnyTypeOfElements.getElement(arr1, 1).toString());
        System.out.println(AnyTypeOfElements.getElement(arr2, 2).toString());
        System.out.println(AnyTypeOfElements.getElement(arr3, 2).toString());
    }
}
