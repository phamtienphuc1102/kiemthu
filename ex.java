import static java.lang.StrictMath.sqrt;

public class ex {
    public static String tuongquan2dt(int x1, int y1, int r1, int x2, int y2, int r2) {
        int r3 = Math.abs(r1-r2); 
        int r4 = (r1+r2);
        double d = sqrt ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)); 
        
        if(r1<=0 || r2<=0){
            return "input không hợp lệ";
        } else {
            if(d==0){
                if(r1 == r2) {
                    return "trùng nhau";
                } else {
                    return "không giao nhau";
                }
            }else if(r3<d && d<r4){
                return "giao nhau";
            } else if(r3==d || d==r4) {
                return "tiếp xúc";
            }else { 
                return "không giao nhau";
            }
        }
    }
}
