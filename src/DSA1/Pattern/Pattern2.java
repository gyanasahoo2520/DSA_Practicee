package DSA1.Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(4);
        pattern4(4);
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int space=0;space<n-row;space++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row=1;row<=2*n-1;row++){
            int c=row>n ? 2*n-row:row;
            for(int space=0;space<n-c;space++){
                System.out.print("  ");
            }
            for(int col=c;col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col=2;col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        int originalN=n;
        n=2*n-2;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
