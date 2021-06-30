public static void main(String[] args) {
        System.out.println(count(6778988));
        System.out.println(gcd(4,5));
        int[] a ={1,2,3,4,5};
        reverse(a);
        System.out.println(Arrays.toString(a));
        uptriangle(5);
        uptriangle1(5);
        numpy1(4);
        numpy2(4);
        numpy3(6);
        diamond(5);
        hyperbolicdiamond(5);
        Case(5);
}


public static int count(int n){
        int cnt=0;
        while(n!=0){
            n=n/10;
            cnt++;
        }
        return cnt;
}

public static int gcd(int a, int b) {
        if(b==0) {
            return a;
        }
        return gcd(b,a%b);
}

public static void reverse(int[] a){
         int i = 0;
         int j = a.length-1;
        while(i<j){
            swap(a,i,j);
            i++;
            j--;
        }
 }
 
 public static void uptriangle1(int n){
         int row,col;
         row=1;
         while(row<=n){
             col=1;
             while(col<=row){
                 System.out.print(col);
                 col++;
             }
             System.out.println();
             row++;
         }
    }
 public static void swap(int[] a, int first, int second){
        int t = a[first];
        a[first]=a[second];
        a[second]=t;

 }
 
  public static void uptriangle(int n){
         int row,col;
         row=0;
         while(row<n){
             col=0;
             while(col<=row){
                 System.out.print("* ");
                 col++;
             }
             System.out.println();
             row++;
         }
  }
  
  public static void numpy1(int n) {
        int i, col, j;
        i = 0;
        while (i <= n) {
            col = 0;
            j = 0;
            while (j < 2 * n + 1) {
                if (col < n - i) {
                    System.out.print("  ");
                } else {
                    System.out.print(col + i - 3 + " ");

                }
                if (j < n) {
                    col++;
                } else {
                    col--;
                }
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    public static void numpy2(int n){
        int i,col,j;
        i=0;
        while(i<=n){
            col=0;
            j=0;
            while(j<2*n+1){
                if(col<n-i){

                    System.out.print("  ");
                }
                else {
                    System.out.print(col + 2*i - 3 + " ");
                }

                if(j<n){
                    col++;
                }
                else{
                    col--;
                }
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    public static void numpy3(int n){
        int row=0,col;
        while(row<n){
            col=0;
            while(col<=row){
                int m=fact(row)/fact(col);
                System.out.print(m/fact(row-col)+" ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    
    public static void diamond(int n) {
        int i, j, row, col;
        i = 1;
        row = 1;
        while (i <= 2 * n - 1) {
            j = 1;
            col = 1;
            while (j <= 2 * n - 1) {
                if (col <= n - row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                if (j < n) {
                    col++;
                } else {
                    col--;
                }
                j++;
            }
            if (i < n) {
                row++;
            } else {
                row--;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void hyperbolicdiamond(int n) {
        int i,j,row,col;
        i=1;
        row=1;
        while(i<=2*n-1){
            j=1;
            col=1;
            while(j<=2*n-1){
                if(col<=row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                if(j<n){
                    col++;
                }
                else{
                    col--;
                }
                j++;
            }
            if(i<n){
                row++;
            }
            else{
                row--;
            }
            System.out.println();
            i++;
        }
    }
    
    public static void Case(int n) {
        int i,j,row,col;
        i=1;
        row=1;
        while(i<=2*n-1){
            j=1;
            col=1;
            while(j<=2*n-1){
                if(col<=n-row+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                if(j<n){
                    col++;
                }
                else{
                    col--;
                }
                j++;
            }
            if(i<n){
                row++;
            }
            else{
                row--;
            }
            System.out.println();
            i++;
        }
    }
    
