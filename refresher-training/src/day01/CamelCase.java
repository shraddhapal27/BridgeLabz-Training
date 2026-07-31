package day01;

public class CamelCase {
    public static void main(String[] args) {
        String str = "saveChangesInTheEditor";
        int count = 1;
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }

        }
        System.out.println(count);
    }
}
