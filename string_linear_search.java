public class string_linear_search{
    public static void main(String args[]){
        String str1 = "shreya pawar";
        char target = 's';
        System.out.println(search1(str1 , target));

    }
    static boolean search1(String str , char target){

           if (str.length()==0){
                   return false;
           }
           for (int index = 0; index < str.length(); index++) {
                 if(str.charAt(index)==target){
                    return true;
                 }
           }
           return false;
    }
}