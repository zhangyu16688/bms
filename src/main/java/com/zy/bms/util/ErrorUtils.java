package com.zy.bms.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class ErrorUtils {
    private ErrorUtils() {};
    /**
     * 完整的堆栈信息
     *
     * @param e Exception
     * @return Full StackTrace
     */
    public static String getStackTrace(Exception e) {
        StringWriter sw = null;
        PrintWriter pw = null;
        try {
            sw = new StringWriter();
            pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            pw.flush();
            sw.flush();
        } finally {
            if (sw != null) {
                try {
                    sw.close();
                } catch (IOException e1) {
                }
            }
            if (pw != null) {
                pw.close();
            }
        }
        return sw.toString();
    }
}
