import java.util.ArrayList;

public class Search {

    // A. write a static method named linearSearch that returns the first index
    // a target int is found in an array of ints (both the target and int array
    // should be accepted as parameters); return -1 if target is not found
    // BE SURE TO USE EARLY RETURN (more efficient)
    public static int linearSearch(int target, int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }




    // B. write a second static method that has the same parameters as linearSearch but
    // instead of returning an index, it returns true if target is found or false
    // if target is not found
    // AGAIN, BE SURE TO USE EARLY RETURN
    public static boolean inArray(int target, int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                return true;
            }
        }
        return false;
    }




    // C. provide an OVERLOADED version of the linearSearch method that accepts an ArrayList
    // of Integers (rather than an array of ints) and a target int; return the first index
    // at which the target is found, or return -1 if target is not found
    // BE SURE TO USE EARLY RETURN
    public static int linearSearch(ArrayList<Integer> array, int target){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i) == target){
                return i;
            }
        }
        return -1;
    }




    // D. provide another OVERLOADED version of the linearSearch method that accepts an array
    // of Strings and a target String; return the first index at which the target is found,
    // or return -1 if target is not found
    // BE SURE TO USE EARLY RETURN
    public static int linearSearch(String[] array, String target){
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(target)){
                return i;
            }
        }
        return -1;
    }




    // E. write a "linearSearchLast" method that accepts an array of ints and a
    // target int, and return the LAST index at which the target is found,
    // or return -1 if target is not found
    public static int linearSearchLast(int[] array, int target){
        for (int i = array.length-1; i>=0; i--){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }




    // F. write two static "linearSearchCount" methods (both overloaded), one that
    // accepts an array of ints and a target int, and the other that accepts an ArrayList
    // of Integers and a target int.  Each method should return the NUMBER OF TIMES
    // the target appears in the array/ArrayList.
    public static int linearSearchCount(int[] array, int target){
        int count = 0;
        for (int num: array){
            if (num == target){
                count++;
            }
        }
        return count;
    }

    public static int linearSearchCount(ArrayList<Integer> array, int target){
        int count = 0;
        for (int num: array){
            if (num == target){
                count++;
            }
        }
        return count;
    }




}
