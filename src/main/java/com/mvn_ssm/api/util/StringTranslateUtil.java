package com.mvn_ssm.api.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Cong Qianhao on 2017/5/27.
 */
public class StringTranslateUtil {
    public static void translate(String jsonStr, HttpServletResponse response) {
        response.setContentType("application/json; charset=utf-8");
        try (PrintWriter httpWriter = response.getWriter()) {
            httpWriter.append(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //java 7 特性，不需要在finally中关闭输出流
    }
}
