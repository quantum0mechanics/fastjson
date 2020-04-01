package com.alibaba.json.bvt.issue_2900;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

public class mytest extends TestCase {


    @Test
    public void mytest()
    {
        HashSet<Object> test = new HashSet<Object>();
        test.add(null);
        test.add("123 ");
        Iterator iter = test.iterator();
        iter.next();
        System.out.println(((String)(iter.next())).trim()); // if iter.next() is null, will throw NPE
    }


}
