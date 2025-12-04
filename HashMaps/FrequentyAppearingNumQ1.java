package HashMaps;
import java.util.HashMap;
import java.util.Map;

public class FrequentyAppearingNumQ1 {
    public static int frequentlyAppearingNumber(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])==true){
                map.put(arr[i],count++);
            }
            else {
                count = 1;
                map.put(arr[i],count);
            }
        }
        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,1,4,1};
        System.out.println("Given array -");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Find the most frequently appearing number");

        int freqAppNum = frequentlyAppearingNumber(arr);

        System.out.println(freqAppNum);
    }
}
