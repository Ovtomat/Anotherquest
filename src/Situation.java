public class Situation {
    String text;
    Choice[]b=new Choice[3];
    Situation(String q,Choice a,Choice m,Choice c) {
        this.text = q;
        b[0] = a;
        b[1] = m;
        b[2] = c;
    }
    Situation(String q){
        this.text=q;
    }

}
