package com.adc.da.business.util;

public class IsEmpty {


        /*
         * 判断是否为空(只要有一个为空，返回false)
         * 参数：
         *   list:需要判断的参数的集合
         *   bool:为true -- 只要有一个为空，返回false
         *        为false -- 只要有一个不为空，返回true
         * */
        public static boolean isEmpty(boolean Boolean,String... args){
            if (Boolean){
                for (String string:args
                        ) {
                    if (string==null||"".equals(string)){
                        return false;
                    }
                }
                return true;
            }else {
                for (String string:args
                        ) {
                    if (string!=null&&(!"".equals(string))){
                        return true;
                    }
                }
                return false;
            }
        }

}
