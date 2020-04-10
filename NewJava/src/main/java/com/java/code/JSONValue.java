package com.java.code;

import org.json.JSONArray;

/*
 * 主要演示如何拿到json中的值
 * */
public class JSONValue {
    public static void main(String[] args) {
        String s = "[\n" +
                "  {\n" +
                "    \"code\": 200,\n" +
                "    \"message\": \"成功!\",\n" +
                "    \"result\": [\n" +
                "      {\n" +
                "        \"sid\": \"30565144\",\n" +
                "        \"text\": \"这个jio怎么不受控制\",\n" +
                "        \"comment\": \"12\",\n" +
                "        \"uid\": \"23133187\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"sid\": \"30565144\",\n" +
                "        \"text\": \"这个jio怎么不受控制\",\n" +
                "        \"comment\": \"作对了\",\n" +
                "        \"uid\": \"23133187\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";

        JSONArray array = new JSONArray(s);
        String s1=array.getJSONObject(0).getJSONArray("result").getJSONObject(1).getString("text");
        System.out.println(s1);
        //getJSONObject获取value，参数为key   getJSONArray:获取value下的数组
    }
}
