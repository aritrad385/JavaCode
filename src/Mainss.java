public class Mainss {
    public static void main(String[] args) {

    }
    static  int OperationsBinaryString(String str){
        if(str==null){
            return -1;
        }
        char[]c=str.toCharArray();
        int result=getIntFromChar(c[0]);
        for(int i=0;i<=c.length-1;i++){
            if (c[i] =='A'){
                result = result & getIntFromChar(c[i + 1]);
            } else if (c[i] == 'B') {
                result = result | getIntFromChar(c[i + 1]);
            } else if (c[i] == 'C') {
                result = result ^ getIntFromChar(c[i + 1]);
            }
        }
        return result;
    }
    static int getIntFromChar(char c){
        return c-'0';
    }
}
