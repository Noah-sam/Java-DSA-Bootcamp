package linearsearch;

public class linearsearch2 {
    public static void main(String[] args) {
        String name = "Noahsam";
        char target = 'N';
        boolean found = Stringsearch(name, target);
        System.out.println(found);
    }
    static boolean Stringsearch(String str,char target){
        for (int i = 0;i<str.length();i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
