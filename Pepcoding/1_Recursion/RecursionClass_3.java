import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecursionClass_3 {
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








    public static ArrayList<String> decodeWays(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        if(str.charAt(0) == '0'){
            return new ArrayList<>();
        }

        char ch1 = str.charAt(0);

        ArrayList<String> myAns  = new ArrayList<>();
        ArrayList<String> recAnsLec1 = decodeWays(str.substring(1));
        for(String s : recAnsLec1)
            myAns.add((char)('a' + ch1 - '1') + s);
        

        if(str.length() > 1){
            int num = (ch1 - '0') * 10 + (str.charAt(1) - '0');
            if(num <= 26){
                ArrayList<String> recAnsLen2 = decodeWays(str.substring(2));
                for(String s : recAnsLen2){
                    myAns.add((char) ('a' + num - 1) + s);
                }
            }
        }
        return myAns;
    }


    public static ArrayList<String> getStirPaths(int n){
        if(n <= 0){
            ArrayList<String> base = new ArrayList<>();
            if(n == 0){
                base.add("");
            }
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for(int i = 1; i <= 3 && n - i >= 0; i++){
            ArrayList<String> recAns = getStirPaths(n- i);
            for(String s : recAns){
                myAns.add(i + s);
            }       
        }
        return myAns;
    }




    public static ArrayList<String> boardPaths(int n){
        if(n <= 0){
            ArrayList<String> base = new ArrayList<>();
            if(n == 0){
                base.add("");
            }
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for(int dice = 1; dice <= 3 && n - dice >= 0; dice++){
            ArrayList<String> recAns = boardPaths(n- dice);
            for(String s : recAns){
                myAns.add(dice + s);
            }       
        }
        return myAns;
    }





    public static ArrayList<String> boardPathsArray(int n,int[]move){
        if(n <= 0){
            ArrayList<String> base = new ArrayList<>();
            if(n == 0){
                base.add("");
            }
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for(int  i = 0; i < move.length && n - move[i] >= 0; i++){
            ArrayList<String> recAns = boardPathsArray(n- move[i], move);
            for(String s : recAns){
                myAns.add(move[i] + s);
            }       
        }
        return myAns;
    }



    




    public static ArrayList<String> mazePath_HDV(int sr, int sc, int er, int ec){
        if(sr == er && sc == ec){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();

        if(sc + 1 <= ec){
            ArrayList<String> horizontal = mazePath_HDV(sr, sc + 1, er, ec);
            for(String s : horizontal){
                myAns.add("h" + s);
            }
        }

        if(sc + 1 <= ec && sr + 1 <= er){
            ArrayList<String> diagonal = mazePath_HDV(sr+1, sc+1, er, ec);
            for(String s : diagonal){
                myAns.add("d"  + s);
            }
        }
        if(sr + 1 <= er){
            ArrayList<String> vertical = mazePath_HDV(sr+1, sc, er, ec);
            for(String s : vertical){
                myAns.add("v" + s);
            }
        }
        return myAns;

    }

    

    public static ArrayList<String> mazePath_HDV_multi(int sr, int sc, int er, int ec){
        if(sr == er && sc == ec){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();

        for(int jump = 1; sc + jump <= ec; jump++){
            ArrayList<String> horizontal = mazePath_HDV_multi(sr, sc + jump, er, ec);
            for(String s : horizontal){
                myAns.add("h" + jump+ s);
            }
        }

        for(int jump = 1; sc + jump <= ec && sr + jump <= er; jump++){
            ArrayList<String> diagonal = mazePath_HDV_multi(sr+jump, sc+jump, er, ec);
            for(String s : diagonal){
                myAns.add("d"  + jump+ s);
            }
        }
        for(int jump = 1; sr + jump <= er; jump++){
            ArrayList<String> vertical = mazePath_HDV_multi(sr+jump, sc, er, ec);
            for(String s : vertical){
                myAns.add("v" + jump+ s);
            }
        }
        return myAns;

    }







    public static void main(String[]args){
        // System.out.println(subseq("ahbgdc"));
        // System.out.println(kpc("11"));
        // System.out.println(decodeWays("12"));
        System.out.println(getStirPaths(4));
        // System.err.println(mazePath(0, 0, 2, 2));
        // System.out.println(mazePath_HDV(0,0,2,2));

        // System.out.println(mazePath_HDV_multi(0,0,2,2));

    }
}
