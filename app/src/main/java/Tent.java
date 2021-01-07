import android.text.TextUtils;
import android.text.format.DateFormat;

import com.example.myapp.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建时间 2020/12/21
 *
 * @author: zhanglichao
 **/
class Tent {
    public static void main(String[] args) {
        Long longTime = getLongTime("19:55:55");
        System.out.println(longTime);
    }

    /**
     * 转换时间格式
     */
    public static Long getLongTime(String time) {
        //if (TextUtils.isEmpty(time)) return 0L;
        String ymdTime = getYMDTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date parse = simpleDateFormat.parse(ymdTime+" "+time);
            long time1 = parse.getTime();
            return time1;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0l;
        }
    }

    /**
     * 获取当前string年月日
     * @return
     */
    public static String getYMDTime(){
        long l = System.currentTimeMillis();
        Date date = new Date(l);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat2.format(date);
        return format;
    }

}
