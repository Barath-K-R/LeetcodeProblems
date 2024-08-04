package MathAndGeometry;

public class ZIgZagConversion {
    public static String convert(String s, int numRows) {
        String res="";
        int gap=(numRows-1)*2;
        if(numRows==1)
        return s;
        for(int i=0;i<numRows;++i){
            
            for(int j=i;j<s.length();j+=gap){
                
                res+=s.substring(j,j+1);
                int tempgap=gap-(i*2);
                
                if(i!=0 && i!=numRows-1){
                    if(j+tempgap<s.length()){
                        
                        res+=s.substring(j+tempgap,j+tempgap+1);
                    }
                }
                
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        System.out.println(convert(s,3));
    }

}
