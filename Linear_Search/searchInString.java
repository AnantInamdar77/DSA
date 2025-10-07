package Linear_Search;
import java.util.Arrays;

public class searchInString {
    public static void main(String[] args) {
        System.out.println();
        String name="Anant";
        char target='T';
        System.out.println(serach(name,target));

        //
        System.out.println(Arrays.toString(name.toCharArray()));  //sesrch2()

    }
    static boolean serach(String str, char target){
        if (str.length()==0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)) {
                return true;
            }
            
        }
        return false;
    }
    static boolean serach2(String str, char target){
        if (str.length()==0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch==target) {
                return true;
            }
        }
        return false;
    }
}
