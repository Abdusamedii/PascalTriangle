
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] Number_list = {0, 1, 0};
        long a;
        //index 0 + index 1
        //index 1 + index 2
        for (int index = 0;index < 20; index++){
            a = Number_list[index] + Number_list[index + 1];
            Number_list[index] = a;

            //System.out.println(Arrays.toString(output));
            if (Number_list.length  == index + 2){
                        //3               //1
                Number_list[0] = 0;
                Number_list = Arrays.copyOf(Number_list, Number_list.length + 1);
                System.arraycopy(Number_list, 0, Number_list, 1, Number_list.length-1 );
                index = 0;
                System.out.println(Arrays.toString(Number_list));
            }
// 0 1 0
// 0 1 1 0
// 0 1 2 1 0
// 0 1 3 3 1 0
// 0 1 4 6 4 1 0

        }

        //System.out.println(Arrays.toString(Number_list));
        //Number_list[0] = 0;
        //output[index] = Number_list[index] + Number_list[index + 1];

        //output = Arrays.copyOf(output, output.length + 1);
        //System.out.println(Arrays.toString(output));

        //System.arraycopy(output, 0, output, 1, output.length-1 );
        //Number_list[index] = Number_list[index] + Number_list[index + 1];
    }
}



