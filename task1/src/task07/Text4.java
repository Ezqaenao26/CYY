package task07;

import java.util.Calendar;

//月份季节转化
public class Text4 {
    public static void main(String[] args) {
        System.out.println("输入月份");
        Calendar cal = Calendar.getInstance();
        int mouth = cal.get(Calendar.MONTH);

        mouth+=1;

        String season="";
        switch (mouth) {
            case 12:
            case 1:
            case 2:
                season="winer";
                break;
            case 3:
            case 4:
            case 5:
                season="spring";
                break;
            case 6:
            case 7:
            case 8:
                season="summer";
            default:
                season="autumn";
                break;
        }
        System.out.println("当前月份是："+mouth+"月:当前季节是:"+season);
    }
}
