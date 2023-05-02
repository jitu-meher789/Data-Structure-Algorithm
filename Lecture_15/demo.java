public class demo {

    public static ArrayList<String> subseq(String str){
        if(str.length() == 0){
            ArrayList<String> base  = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        ArrayList<String> recAns = subseq(str.substring(1));
        ArrayList<String> myAns = new ArrayList<>();
        for(String s:recAns){
            myAns.add(s);
            myAns.add(ch + s);
        }
        return myAns;
    }








    public static String[] nokiaKeyPad = {".;", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> kpc(String str){  
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }  

        char ch = str.charAt(0);
        String word = nokiaKeyPad[ch - '0'];

        ArrayList<String> recAns = kpc(str.substring(1));
        ArrayList<String> myAns = new ArrayList<>();

        for(int i = 0; i < word.length(); i++){
            for(String s : recAns){
                myAns.add(word.charAt(i) + s);
            }
        }
        return myAns;
    }

    public static void main(String[] args) {
        
    }
}
