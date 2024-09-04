public class removewhitespace {
    public static void main(String[] args) {
        String str="ja va st a r";
        String str1=str.replaceAll("\\s","");
        System.out.println(str1);
    }
}
