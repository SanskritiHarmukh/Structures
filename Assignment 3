public static void main(String[] args) {
        q1();
        System.out.println();
        q2();
        System.out.println();
        q4();
        System.out.println();
        q6();
        q7(5,3);
        q8();
        q9(7,4);
        ql1(3,3);
        ql2(3);
        ql5(3,3,1);
        ql6(3);
        ql7(4);
        q10("abcg");
        q11("abcDEasW");
        q12("acb");
        q13(2, "abba");
    }

    public static void q9(int total, int subgroup ){
        Scanner a = new Scanner(System.in);
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = a.nextInt();
        }
        for (int i = 0; i < total; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int min=arr[0];
        int max=arr[0];
        int sum=0;
        for (int i = 0; i < subgroup; i++) {
            for (int j = 0; j < i+subgroup; j++) {
                if(arr[j]<min){
                    min=arr[j];
                }
                else if(arr[j]>max){
                    max=arr[j];
                }
            }
            System.out.println(min+max);
            sum = sum+min+max;
        }
        System.out.println(sum);
    }

    public static void q7(int total, int subgroup){
        Scanner a = new Scanner(System.in);
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = a.nextInt();
        }
        for (int i = 0; i < total; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max=arr[0];
        for (int i = 0; i < subgroup; i++) {
            for (int j = i+1; j < i+subgroup; j++) {
                if(arr[j]>max){
                    max=arr[j];
                    System.out.print(max+" ");
                }
            }
        }

    }

    public static void q8(){
        int[] a1 = {1,2,3,1,2,4,1};
        int[] a2 = {2,1,3,1,5,2,2};
        Arrays.sort(a1);
        Arrays.sort(a2);
        for (int i = 0; i < a1.length; i++) {
            if(a1[i]==a2[i]){
                System.out.print(a1[i]+" ");
            }
        }
    }

    public static void q6() {

        int m = 0, n = 0;
        int[] a1 = {3, 5, 0, 7};
        int[] a2 = {9, 0, 2, 8};
        for (int i = 0; i < a1.length; i++) {
            m = m * 10 + a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            n = n * 10 + a2[i];
        }
        int sum = m + n;
        convert(sum);

    }
    public static void convert(int sum){
        ArrayList<Integer>al = new ArrayList<Integer>();
        if( sum != 0) {
            int temp = sum % 10;
            sum = sum / 10;
            convert(sum);
            al.add(temp);
            System.out.print(al);
        }

    }



    public static void q4() {
        int[][] a={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        int dir=-1;
        int sr=0,er=a.length-1,sc=0,ec=a[0].length-1;
        int tle=a.length*a[0].length;

        while(tle!=0) {
            dir=(dir+1)%4;
            if (dir == 0) {
                for (int i = sr; i <= er; i++) {
                    System.out.print(a[i][sc]+" ");
                    tle--;
                }
                sc++;
            }
            else if (dir == 1) {
                for (int i = sc; i <= ec; i++) {
                    System.out.print(a[er][i]+" ");
                    tle--;
                }
                er--;
            }
            else if (dir == 2) {
                for (int i = er; i >= sr; i--) {
                    System.out.print(a[i][ec]+" ");
                    tle--;
                }
                ec--;
            }
            else if (dir == 3) {
                for (int i = ec; i >= sc; i--) {
                    System.out.print(a[sr][i]+" ");
                    tle--;
                }
                sr++;
            }
        }
    }

    public static void q1() {
        int[][] a={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i]+" ");
            }

        }
    }

    public static void q2(){
        int[][] a={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
    
    public static void ql7(int n){
        Scanner s = new Scanner(System.in);
        int[][] a = new int[n][n];
        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]<0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static void ql6(int n){
        Scanner s = new Scanner(System.in);
        int[][] a = new int[n][n];
        int special=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            int x = 0, y = 0, count = 0;
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 1) {
                    x = i;
                    y = j;
                    count++;
                }
            }
            if (count == 1) {
                boolean sp = true;
                for (int k = 0; k < a.length; k++) {
                    if (k != x && a[k][y] == 1) {
                        sp = false;
                    }
                }
                if (sp) {
                    special++;
                }
            }
        }
        System.out.println(special);
    }

    public static void ql5(int n,int m,int k){
        Scanner s = new Scanner(System.in);
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (; k>0 ; k--) {
            int[][] newa = new int[a.length][a[0].length] ;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length - 1; j++) {

                    newa[i][j + 1]=a[i][j];

                }
            }
            for (int i = 0; i < a.length - 1; i++) {
                newa[i + 1][0] = a[i][a[0].length - 1];
            }
            newa[0][0] = a[a.length - 1][a[0].length - 1];

            a=newa;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void ql2(int n) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            int l = 0, h = a.length - 1;
            while (l < h) {
                int temp = a[i][l];
                a[i][l] = a[i][h];
                a[i][h] = temp;
                l++;
                h--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]==0){
                    a[i][j]=1;
                }
                else{
                    a[i][j]=0;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void ql1(int n, int m){
        Scanner s = new Scanner(System.in);
        int[] a1 = new int[n];
        int[] a2 = new int[m];
        int S1=0,S2=0;
        for (int i = 0; i < n; i++) {
            a1[i] = s.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(a1[i]+" ");
            S1=S1+a1[i];
        }
        for (int i = 0; i < m; i++) {
            a2[i] = s.nextInt();
        }
        for (int i = 0; i <m ; i++) {
            System.out.print(a2[i]+" ");
            S2=S2+a2[i];
        }
        if(S1>S2){
            System.out.println("Richest:a1");
        }
        else if(S1==S2){
            System.out.println("Both are equally Rich" );
        }
        else{
            System.out.println("Richest:a2");
        }
    }
    
    public static void q13(int k, String s){
        int ans=0;
        for (int i = 0; i < s.length(); i++) {
            int counta=0,countb=0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == 'a') {
                    counta++;
                }
                else {
                    countb++;
                }

                if (counta > k && countb > k) {
                    break;
                }
                else {
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        System.out.println(ans);
    }

    public static void q12(String s){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length()-1; i++) {
            sb.append(s.charAt(i));
            int diff= s.charAt(i+1)- s.charAt(i);
            sb.append(diff);
        }
        sb.append(s.charAt(s.length()-1));
        System.out.println(sb.toString());
    }

    public static void q11(String s) {
        char[] ch = s.toCharArray();
        for(int i = 0 ; i<ch.length ; i++){
            if(Character.isUpperCase(s.charAt(i))){
                ch[i]=Character.toLowerCase(ch[i]);
            }
            else{
                ch[i]=Character.toUpperCase(ch[i]);
            }
        }

        System.out.println(String.valueOf(ch));
    }



    public static void q10(String s){

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(i%2==1) {
                ch[i] = (char) (ch[i] - 1);
            }
            else{
                ch[i] = (char) (ch[i] + 1);
            }
        }
        System.out.println(String.valueOf(ch));

    }
