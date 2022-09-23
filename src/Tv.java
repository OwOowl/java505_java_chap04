public class Tv {
    public static String company = "삼성";
    public static String model = "LED 80인치";
    public static String info;

//    정적 초기화블럭
    static {
        info = company + " - " + model;
    }
}
