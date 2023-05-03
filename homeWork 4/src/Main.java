import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[])  //static method
    {
        Scanner scanner=new Scanner(System.in);
// question 1

//        int[] array ={ 50 , -20, 0, 30, 40, 60, 10};
//        if(array[0]==array[array.length-1]&&array.length >=2){
//
//            System.out.println("true");
//
//
//        }else {
//            System.out.println("false");
//        }


//Question 2


//        Integer numbers[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
//        int k = 3;
//        System.out.print(k +" largest elements of the said array are: ");
//        Arrays.sort(numbers, Collections.reverseOrder());
//        for (int i = 0; i < k; i++)
//            System.out.print(numbers[i] + " ");


//Question 3


//        Integer num[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
//        int total = 0;
//        for(int i = 0; i < num.length; i++) {
//            total = total + num[i];
//        }
//        double average = total / num.length;
//        System.out.print("The average of the said array is: " + average+" ");
//        System.out.print("The numbers in the said array that are greater than the average are: ");
//        for(int i = 0; i < num.length; i++) {
//            if(num[i] > average) {
//                System.out.println(num[i]);
//            }
//        }



//Question 4

//        int[] arrayOfNum = {20, 30, 40};
//        int larger = arrayOfNum[0];
//        if(arrayOfNum[arrayOfNum.length-1] >= larger)
//            larger = arrayOfNum[2];
//        System.out.println("Larger value between first and last element: "+larger);


//Question 5


//        int[] swap = {20, 30, 40};
//        int x = swap[0];
//        swap[0] = swap[swap.length-1];
//        swap[swap.length-1] = x;
//        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(swap));




//Question 6

//        String [] dictionary = {"cat", "dog", "red", "is", "am" };
//
//        ArrayList<String> list = new ArrayList<String>();
//        int longest_length = 0;
//        for (String string : dictionary) {
//            int length = string.length();
//            if (length > longest_length) {
//                longest_length = length;
//                list.clear();
//            }
//            if (length == longest_length) {
//                list.add(string);
//            }}
//        System.out.println(list);

 //Question 7

//        System.out.print("Enter the number of elements you want to store: ");
//        int size=scanner.nextInt();
//        int[] array = new int[size];
//        System.out.println("Accept elements of an array: ");
//        for(int i=0; i<size; i++) {
//            array[i]=scanner.nextInt();
//        }
//
//        System.out.println("Array elements are: ");
//        for (int i=0; i<size; i++) {
//            System.out.println(array[i]);
//        }
//
//
//
//        mainLoop: while (true) {
//            Scanner choice = new Scanner( System.in );
//            System.out.println("\n***Menu***");
//            System.out.println("1.Display elements of an array");
//            System.out.println("2.Search the element within array ");
//            System.out.println("3.sort the array ");
//            System.out.println("4. Terminate the program");
//            int command;
//
//                command = choice.nextInt();
//
//
//            switch(command) {
//                case 1:
//                    System.out.println("Array elements are: ");
//                    for (int i=0; i<size; i++) {
//                        System.out.println(array[i]);
//                    }
//
//            break;
//            case 2:
//                boolean no=true;
//                System.out.println("Enter elements you want to find ");
//                int find =scanner.nextInt();
//
//
//                for (int element : array) {
//
//                    if (element == find) {
//                         no=false;
//
//                        System.out.println(find + " is in the array ");
//                        break;
//
//                    }
//
//                }
//
//if(no){
//                System.out.println( find
//                        +" is not  in the array .");}
//                break ;
//
//
//
//
//            case 3:
//                Arrays.sort(array);
//
//                System.out.println("Array elements are  sort : ");
//                System.out.printf(Arrays.toString(array));
//                break;
//            case 4:
//                System.out.println("program end ");
//                break mainLoop;
//            default:
//                System.out.println("Wrong choice!!");
//
//        }


//Question 8


//        int [] arrOccurrences = new int [] {1,1,1,3,3,5};
//        int [] fr = new int [arrOccurrences.length];
//        int visited = -1;
//
//        for(int i = 0; i < arrOccurrences.length; i++){
//            int count = 1;
//            for(int j = i+1; j < arrOccurrences.length; j++){
//                if(arrOccurrences[i] == arrOccurrences[j]){
//                    count++;
//
//                    fr[j] = visited;
//                }
//            }
//            if(fr[i] != visited)
//                fr[i] = count;
//        }
//
//        for(int i = 0; i < fr.length; i++){
//            if(fr[i] != visited)
//                System.out.println("element  " + arrOccurrences[i] + " Occurrences " + fr[i]);
//        }

//Question 9

//        int[] arr = { 2,3,40,1,5,9,4,10,7};
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//
//            for (int j = i + 1; j < n; j++) {
//
//
//                if (arr[i] >= 0
//                        && arr[j] >= 0
//                        && arr[i] % 2 == 0
//                        && arr[j] % 2 != 0) {
//
//
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//
//
//
//                    break;
//                }
//
//
//                else if (arr[i] >= 0
//                        && arr[j] >= 0
//                        && arr[i] % 2 != 0
//                        && arr[j] % 2 == 0) {
//
//
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//
//
//
//
//
//                    break;
//                }
//            }
//        }   System.out.println("Array elements are: ");
//                    for (int i=0; i< arr.length; i++) {
//                        System.out.println(arr[i]);
//                    }
        

//Question 10

//        int arr1[] = {2,3,6,6,4};
//        int arr2[] = {2,3,6,6,4};
//        int t = arr1.length;
//        int f = arr2.length;
//        if (t != f){
//
//            System.out.println("false");
//            System.exit(0);
//
//        }
//        for (int i = 0; i < t; i++){
//            if (arr1[i] != arr2[i]){
//                System.out.println("false");
//                System.exit(0);
//            }
//        }
//        System.out.println("true");


    }

}