import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int nums[] = {2,3,6,5,9,0};
        int target=9;
        ArrayList<Integer> indexArr=new ArrayList<Integer>();

        for (int k = 0; k < nums.length; k++) {
            int in =k;
            int i=nums[in];
            int index = in + 1;
            for (int j = 0; j <nums.length ; j++) {
                if (index < nums.length) {
                    if (i + nums[index] == target) {
                        indexArr.add(in);
                        indexArr.add(index);
                    }
                }
                index++;
            }
            in++;
        }
        System.out.println(indexArr);
        }

    }

