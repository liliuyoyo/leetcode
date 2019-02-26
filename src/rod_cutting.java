public class rod_cutting {

//    public static void printBestCut(int n, int[] p,int[] c){
//        if(c[n] == p[n]) {
//            System.out.print(n);
//            System.out.print(" ");
//            return;
//        }
//
//        for(int i=1; i<= n/2;i++){
//            if(c[n] == c[i]+c[n-i]){
//                printBestCut(i,p,c);
//                printBestCut(n-i,p,c);
//                return;
//            }else{
//                continue;
//            }
//        }
//
//    }

    public static void printBestCut(int n, int[] p,int[] c){
        int i = 0;
        for(; i<= n; i++){
            if(p[n]==c[n]){
                System.out.print(n);
                System.out.print(" ");
                return;
            }else if(p[i+1]+c[n-i-1]==c[n]){
                n=n-i-1;
                System.out.print(i+1);
                System.out.print(" ");
                i=0;
            }
        }
    }


    public static void main(String[] args) {
        //int[] p = {0,1,5,8,9,10,17,17,20,24,30};
        //int[]  c = {0,1,5,8,10,13,17,18,22,25,30};
        int[] p = {0,3,5,10,12,14};
        int[]  c = {0,3,6,10,13,16};
        printBestCut(5,p,c);
    }
}
