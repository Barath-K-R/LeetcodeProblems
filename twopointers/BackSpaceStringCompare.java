package twopointers;

public class BackSpaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder(),sb2=new StringBuilder();
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='#' ){
                if(!sb1.isEmpty())
                sb1.deleteCharAt(sb1.length()-1); 
            }
            else
            sb1.append(s.charAt(i));
        }
        for(int j=0;j<t.length();++j){
            if(t.charAt(j)=='#'){
                if(!sb2.isEmpty())
                sb2.deleteCharAt(sb2.length()-1);
            }
            else
            sb2.append(t.charAt(j));
        }
        System.out.println(sb1+" "+sb2);
        return sb1.compareTo(sb2)==0?true:false;
    }
    public static void main(String[] args) {
        String s="y#fo##f",t="y#f#o##f";
        System.out.println(backspaceCompare(s, t));
    }
}
