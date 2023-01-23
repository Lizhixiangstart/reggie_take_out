package com.itheima.reggie;

import org.junit.jupiter.api.Test;

/**
 * @Author: Lizhixiang
 * @Date: 2023/1/14
 * @Time: 19:41
 * @Description:
 * @Version:
 */

public class UploadFileTest {
    @Test
    void test1 (){
        String fileName = "erer.jpg";
        System.out.println(fileName.length());
        //开始截取   startIndex<=substr<endIndex
        String substring = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        System.out.println(substring);
    }
}