public static void main(String[] args) {
        Q1(5);
        System.out.println();
        System.out.println(Q2(5));
        System.out.println();
        int[] arr={3,2,1,8,6,1,3};
        System.out.println(Q3(arr,1));
        System.out.println();
        int[] arr2={0,4,2,2,1,2,3,4,2};
        Q4(arr2,2,0,"");
        System.out.println();
        int[] arr3={3,4,5,6,7};
        Q5(arr3,0,arr3.length-1);
        System.out.println();
        bubblesort(arr,0);
        System.out.println();
        System.out.println(Q("abbabba"));
        System.out.println();
        count("AXAXA",0,0);
        System.out.println();
        String str="ab";
        AsciiSequence("ab","",0);
        System.out.println();
        System.out.println(Math.pow(3,str.length()));
 }

public static void Q1(int n) {
        int row = 0, col;
        while (row < n) {
            col = 0;
            while (col <= row) {
                int m = fact(row) / fact(col);
                System.out.print(m / fact(row - col) + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static int fact(int num) {
        if (num == 0 || num == 1) return 1;
        else return num * fact(num - 1);
    }

    //    Take ‘n’ as input and write a recursive function to return the sum of 1 to n. Eg: for n=5 return 15 (1+2+3+4+5)
    public static int Q2(int n) {
        if (n == 0) return 0;
        else return n + Q2(n - 1);
    }


//    Given an array and a target value, write a recursive function that will return the last index of the occurrence of that target value. If not present in the array return -1.
//        Eg: {3 2 1 8 6 1 3} target = 1
//        Output: 5
     public static int Q3(int[] arr,int tar){
         for (int i = arr.length-1 ;i >=0; i--) {
             if(tar==arr[i]) {
                 return i;
             }
         }
         Q3(arr,tar);
         return -1;
     }
//    Take an array as input and a target value. Write a recursive function which returns an array having indices stored in it at which
//    the target value is stored in the original array.
//    Eg: {0, 4, 2, 2, 1, 2, 3, 4, 2} target = 2
//    Output: {2, 3, 5, 8}
    public static void Q4(int[] arr,int tar,int id,String ans){
        if(id==arr.length){
            System.out.println(ans);
            return;
        }
        if (tar == arr[id]) {
            ans=ans+id;
        }
        Q4(arr,tar,id+1,ans);
    }
    //To reverse an array
    public static void Q5(int[] arr,int i,int j){

        if(i>=j){
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k]+" ");
            }
            return;
        }
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        Q5(arr,i+1,j-1);

    }
    //Bubble sort
    public static void bubblesort(int[] arr, int j){
        if(j==arr.length-1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

        }

            bubblesort(arr, j + 1);
    }
    public static boolean Q(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.charAt(0) == 'a' && s.length() >= 3 && "abba".equals(s.substring(0, 4))) {
            return true;
        } else {
            return false;
        }
    }

    public static void count(String str,int twin,int i){
        if(i==str.length()-1){
            System.out.println(twin);
            return;
        }
        if(str.charAt(i)=='A'){
            if("AXA".equals(str.substring(i,i+3))){
                twin=twin+1;
            }
            else{
                count(str,twin,i+1);
            }
        }
        if(str.charAt(i)=='X'){
            if("XAX".equals(str.substring(i,i+3))) {
                twin=twin+1;
            }
            else{
                count(str,twin,i+1);
            }
        }
    }

    public static void AsciiSequence(String str,String ans,int id){
        if(id==str.length()){
            if(ans.length()>0){
                System.out.print(ans+" ");
            }
            return;
        }
        char ch= str.charAt(id);
        AsciiSequence(str,ans,id+1);
        AsciiSequence(str,ans+ch,id+1);
        AsciiSequence(str,ans+(int)ch,id+1);
    }
