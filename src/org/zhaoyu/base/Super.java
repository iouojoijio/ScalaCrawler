package org.zhaoyu.base;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by Administrator on 2015/1/26.
 */
public class Super {
    public static void main(String[] args) {
        Calendar calendar =  Calendar.getInstance();
        calendar.add(Calendar.DATE,5);
        System.out.println(calendar.getTime());
        List<a> list = new ArrayList<a>();
        List<b> list1 = new ArrayList<b>();
        List<c> list2 = new ArrayList<c>(0);
        list.add(new a());
        Super su = new Super();
        su.containAll(list);
        su.containAll2(list);
        su.containAll(list2);
        su.containAll2(list1);
    }
    //上界
    public boolean containAll(List<? super a> list) {
        System.out.println(list.get(0));
        return false;
    }
    //下界
    public boolean containAll2(List<? extends a> list) {
        System.out.println(list.get(0));
        return false;
    }
}
class c {

}
class a extends c{

}
class b extends a {

}
