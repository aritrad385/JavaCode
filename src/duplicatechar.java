public class duplicatechar {
    public static void main(String[] args) {
        String str="Programming";
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int index=str.indexOf(ch,i+1);
            if(index==-1){
                sb1.append(ch);
            }
        }
        System.out.println(sb1);


        char []ch2 =str.toCharArray();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<ch2.length;i++){
            boolean repeated=false;
            for(int j=i+1;j<ch2.length;j++){
                if(ch2[1]==ch2[j]){
                  repeated=true;
                  break;
                }
            }
           if(!repeated){
               sb2.append(ch2[i]);
           }
        }
    }
}
