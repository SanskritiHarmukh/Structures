public static void main(String[] args) {
        String s= "abexexdexed";
        //Q1(s,0,s.length());
        System.out.println();
        Q2(0,2,0,2);
        ArrayList<String> ans = Q2(0,2,0,2);
        for(String ele: ans){
            System.out.println(ele);
        }
        System.out.println();
        Q3(0,2,0,2);
        ArrayList<String> ans2 = Q3(0,2,0,2);
        for(String ele: ans){
            System.out.println(ele);
        }
        Questions rat = new Questions();
        int arr[][] = { { 0, 1, 0, 0 },
                { 0, 0, 0, 1},
                { 0, 0, 1, 0 },
                { 1, 0, 0, 0 },
                {1 ,1 ,0 ,0}};

        rat.solveMaze(arr,arr.length,arr[0].length);
        int[] a= {1,1,2,3} ;
        Q5(a,0,a.length," ");
        System.out.println();
        String str="abc";
        Q7(str,0,str.length()-1);
        int arr1[]= {1,2,3,4,5};
        ArrayList<ArrayList<Integer>> ansi= Q9(arr1,0);
        int counter=1;
        for(int i=0;i<ansi.size();i++) {
            System.out.print(counter+" .");
            System.out.println(ansi.get(i));
            counter++;
        }
        System.out.println();
        System.out.println();
        int[][] board= new int[4][4];
        nKnights( board,0,0,0,4);
        System.out.println();
        Q12();
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        for(int i=1;i<=9;i++) {
            System.out.println(Q10(i,n));
        }
    }
    public static void Q1(String s,int id1, int id2){
        //char[] arr=  s.toCharArray();
        StringBuilder sb =new StringBuilder(s.length());
        if(id1==sb.length()){
            System.out.println(sb.toString());
            return;
        }
        if(s.charAt(id1)=='x'){
            sb.insert(id2,s.charAt(id1));
        }
        sb.append(s.charAt(id1));
        Q1(s,id1+1,id2-1);
    }
    public static ArrayList<String> Q2(int sr,int er, int sc, int ec){

        if(sr==er&& sc==ec){
            ArrayList<String> base= new ArrayList<String>();
            base.add(" ");
            return base;
        }
        ArrayList<String> al= new ArrayList<String>();
        if(sr+1<=er){
            ArrayList<String> south = Q2(sr+1,er,sc,ec);
            for(String ele: south){
                al.add("v"+ele);
            }
        }
        if(sc+1<=ec){
            ArrayList<String> east = Q2(sr,er,sc+1,ec);
            for(String ele: east){
                al.add("h" +ele);
            }
        }
        return al;
    }

    public static ArrayList<String> Q3(int sr,int er, int sc, int ec){

        if(sr==er&& sc==ec){
            ArrayList<String> base= new ArrayList<String>();
            base.add(" ");
            return base;
        }
        ArrayList<String> al= new ArrayList<String>();
//        if(sc<ec && sr<er){
//            ArrayList<String> diagonal= Q3(sr+1,er,sc+1,ec);
////            ArrayList<String> diagonal1= Q3(sr,er,sc+1,ec);
////            ArrayList<String> diagonal2= Q3(sr+1,er,sc,ec);
//              for(String ele: diagonal){
//                al.add("d"+ele);
//              }
////            for(String ele: diagonal1){
////                al.add("d"+ele);
////            }
////            for(String ele: diagonal2){
////                al.add("d"+ele);
////            }
//        }
        if(sr+1<=er){
            if(sc<er){
                ArrayList<String> diagonal= Q3(sr+1,er,sc+1,ec);
                for(String ele: diagonal){
                 al.add("d"+ele);
                }
            }
            ArrayList<String> south = Q3(sr+1,er,sc,ec);
            for(String ele: south){
                al.add("v"+ele);
            }
        }
        if(sc+1<=ec){
            ArrayList<String> east = Q3(sr,er,sc+1,ec);
            for(String ele: east){
                al.add("h" +ele);
            }
        }
        return al;
    }


//    public static void Q4(int arr[][]){
//
//    }
    boolean isSafe(int arr[][] , int i ,int j, int n, int m){
        return (i>=0 && i<n && j<m && j>=0 && arr[i][j]==0);
    }
    boolean solveMazeUtil(int arr[][], int x, int y, int sol[][],int n, int m){
        // if (x, y is goal) return true
        if (x == n - 1 && y == m - 1 && arr[x][y] == 0) {
            sol[x][y] = 1;
            return true;
        }
        // Check if maze[x][y] is valid
        if (isSafe(arr, x, y,n,m) == true) {
            // Check if the current block is already part of solution path.
            if (sol[x][y] == 1) {
                return false;
            }
            // mark x, y as part of solution path
            sol[x][y] = 1;

            /* Move forward in x direction */
            if (solveMazeUtil(arr, x, y + 1, sol,n,m))
                return true;
            if (solveMazeUtil(arr, x + 1, y, sol,n,m))
                return true;

            /* If moving in y direction doesn't give
            solution then Move backwards in x direction */
//            if (solveMazeUtil(arr, x - 1, y, sol,n,m))
//                return true;

            /* If moving backwards in x direction doesn't give
            solution then Move upwards in y direction */
//            if (solveMazeUtil(arr, x, y - 1, sol,n,m))
//                return true;

            /* If none of the above movements works then
            BACKTRACK: unmark x, y as part of solution
            path */
            sol[x][y] = 0;
            return false;
        }

        return false;
    }
    void printSolution(int sol[][],int n ,int m)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }
    boolean solveMaze(int arr[][],int n, int m)
    {
        int sol[][] = new int[n][m];

        if (!solveMazeUtil(arr, 0, 0, sol, n, m)) {
            System.out.print("Solution doesn't exist");
            return false;
        }
        printSolution(sol,arr.length,arr[0].length);
        return true;
    }

    public static int Q5(int [] a, int i, int n, String s) {
        if(i == n)  {
            System.out.println(s);
            return 0;
        }

        int ans = 0;
        if(i < n-1 && a[i] <= 2  && a[i+1] <= 6) {
            ans = ans + Q5(a, i+2, n, new String(s+(char)(a[i]*10+a[i+1]+'a'-1))) +1;
        }
        ans= ans + Q5(a, i+1, n, new String(s+(char)(a[i]+'a'-1)));
        return ans;
    }
    public static void Q7(String str,int i,int j){
        int cnt=0;
        if(i==j){
            System.out.println(str);
            cnt++;
            return;
        }
        for (int k = i; k <= j; k++) {
            str = swap(str, i, k);
            Q7(str, i + 1, j);
            str = swap(str, i, k);
        }
    }
    public static String swap(String str, int i, int j){
        char[] ch= str.toCharArray();
        char temp =ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
    public static ArrayList<ArrayList<Integer>> Q9(int arr[],int index){
            ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
            if(index==arr.length) {
                ArrayList<Integer> al=new ArrayList<Integer>(1);
                ans.add(al);
                return ans;
            }

            ArrayList<ArrayList<Integer>> subans=Q9(arr,index+1);

            for(int i=0;i<subans.size();i++) {
                ArrayList<Integer> dummy=new ArrayList<Integer>();
                for(int j=0;j<subans.get(i).size();j++) {
                    dummy.add(subans.get(i).get(j));
                }
                ans.add(dummy);

            }
            for(int i=0;i<subans.size();i++) {
                ArrayList<Integer> dummy=new ArrayList<Integer>();
                dummy.add(arr[index]);
                for(int j=0;j<subans.get(i).size();j++) {
                    dummy.add(subans.get(i).get(j));
                }
                ans.add(dummy);
            }
            return ans;
    }

    public static boolean Q10(int val ,int n) {
        if(val<=n) {
            System.out.println(val);
        }
        else {
            return false;
        }
        int nval=val*10;
        for(int i=0;i<=9;i++ ) {
            boolean  ans = Q10(nval+i,n);
            if(ans==false) {
                return true;
            }
        }
        return true;
    }

    static int counter=0;
    public static void displayBoard(int[][] board) {
        System.out.println(counter +" .");
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" " + board[i][j]);
            }

            System.out.println();
        }
        counter++;
    }
    public static void  nKnights(int[][] board,int i,int j,int n,int m){
        // System.out.println("i"+i+"j"+j);
	        /*
	        if(i==board.length && j== board[0].length){
	           displayBoard(board);
	           System.out.println();
	           return;
	        }*/

        if(n==m ){
            displayBoard(board);
            System.out.println();
            return;
        }
        // System.out.println("i"+i+"j"+j+"outside");
        // System.out.println("i"+i+"j"+j);
        for(int k= i;k<4;k++) {
            for(int p= 0;p<4;p++) {
                if(p<j && k==i) {
                    continue;
                }
                if(isSafe(board,k,p)==true){

                    // System.out.println("issafe i"+i+"j"+j);
                    board[k][p] = 1;
                    nKnights(board,k, p,n+1,m);
                    board[k][p]=0;

                }
            }
        }
    }
    public static boolean isSafe(int[][]board,int i,int j){
        if(board[i][j]==1) {
            return false;
        }
        final int[][] moves = { { -2, -1 }, { -2, 1 }, { -1, -2 }, { -1, 2 }, { 1, -2 }, { 1, 2 }, { 2, -1 },
                { 2, 1 } };
        for (int[] move : moves) {
	            /*xpos = this.x + move[0];
	            ypos = this.y + move[1];*/
            if(i + move[0] >= 0 && j + move[1] >= 0 && i + move[0]  <= board.length-1 && j + move[1] <= board[0].length-1){
                if(board[i + move[0]][j + move[1]] == 1){
                    return false;
                }
            }
        }
        return true;
    }

    public static void Q12(){
        int[][] board = {{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};
        sudoku(board,0,0);
    }

    public static void sudoku(int[][] board ,int row , int col){
        if (col == board.length) {
            display(board);
            //System.out.println();
            return;
        }
        if(col==board[0].length){
            row=row+1;
            col=0;
        }
        if(board[row][col]!=0){
            sudoku(board,row,col+1);
        }
        else{
            for (int val = 1; val <=9; val++) {
                if(issafeforsudoku(board,row,col,val)){
                    board[row][col]=val;
                    sudoku(board,row,col+1);
                    board[row][col]=0;
                }
            }
        }
    }

    public static boolean issafeforsudoku(int[][] board, int row, int col, int val){
        //checking entire column
        for (int i = 0; i < board[0].length; i++) {
            if(board[row][i]==val){
                return false;
            }
        }
        //checking entire row
        for (int i = 0; i < board[0].length; i++) {
            if(board[i][col]==val){
                return false;
            }
        }
        //checking particular box
        row=(row/3)*3;     //ex: (5/3)*3=3 , this multiplication and division of 3 is done because every starting element of each box is a multiple of 3 and we need to obtain this.
        col=(col/3)*3;    //these two statements of row and col shows the 1st element of a particular box considering any value of row and col.

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(int[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
