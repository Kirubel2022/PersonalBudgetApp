import java.text.SimpleDateFormat;

public class Date {

    public  static void main(String[]args){
        java.util.Date date =new java.util.Date();
        SimpleDateFormat dateForm= new SimpleDateFormat("MM/dd/YY hh:m a");
        System.out.println(dateForm.format(date));
    }
}
