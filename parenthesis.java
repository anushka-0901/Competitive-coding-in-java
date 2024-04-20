//generate parenthesis
public class parenthesis {
    public static void main(String args[]){
       paren(5,5,"");
    }
    public static void paren(int op,int cl,String s){
        if(cl<op){
            return;
        }
        if(cl==op && op==0){
            System.out.println(s);
            return;
        }
        if(op<0){
            return;
        }
        paren(op-1,cl,s+"(");
        paren(op,cl-1,s+")");
    }
}
