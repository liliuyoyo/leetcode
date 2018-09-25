public class number_complement {
    public int findComplement(int num) {
        char[] ss = Integer.toBinaryString(num).toCharArray();
        for(int i=0;i<ss.length;i++){
            if(ss[i] =='1'){
                ss[i]='0';
            }else{
                ss[i]='1';
            }
        }
        return Integer.parseInt(new String(ss), 2);
    }
}
