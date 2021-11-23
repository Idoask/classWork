//314943333
public class classWork1 {
    public static void main(String[] args) {

    }
    public static void printdash (int amuntinrow,int amuntofrows){
        for (int i = 0; i <amuntofrows; i++) {
            for (int j = 0; j <amuntinrow; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }

    public static char[] reversArray(char[] input){
        int index=0;
        char[] reversedarray=new char[input.length];
        for (int i = input.length-1; i >=0 ; i--) {
            reversedarray[index]=input[i];
            index=index+1;
        }
        return input;
    }

    public static int theSecondBigestNum(int[] input) {
        int max = -2147483648;
        int secondmax = -2147483648;
        for (int i = 0; i < input.length; i++) {
            if (max < input[i]) {
                secondmax = max;
                max = input[i];
            }
        }
        return secondmax;
    }
}
