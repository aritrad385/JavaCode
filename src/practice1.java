public class practice1 {
    public static void main(String[] args) {
        String str="&J*&A$@*V&^%A";
       String plainStr= str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plainStr);
    }
}
