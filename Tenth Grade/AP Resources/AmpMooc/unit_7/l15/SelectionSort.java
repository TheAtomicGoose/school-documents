/**
 * This class implements a selection sort algorithm which sorts arrays of
 * strings.
 *
 * Written as an exercise for AmplifyMOOC on 03-24-2015 by Jesse Evers.
 */

public class SelectionSort {

    public static void sortAndPrint(String[] list) {

        String temp;
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if (list[i].compareTo(list[j]) > 0) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] list = {"against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
        sortAndPrint(list);

    }
}