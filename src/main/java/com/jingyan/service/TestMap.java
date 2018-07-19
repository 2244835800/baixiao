//package com.jingyan.service;
//
//import java.io.FileInputStream;
//import java.util.*;
//
//public class TestMap{
//
///*
// *
// *Object put(Object key,Object value):向Map中添加一个元素
// *
// *Object remove(Object key)：按照指定的key删除此key-value对
// *
// *void putAll(Map t)：
// *
// *void clear()：清空
// *
// *Object get(Object key)：获取指定key的value值,若无此key则返回null
// *
// *boolean containsKey(Object key):
// *
// *boolean containsValue(Object value)
// *
// *int size()
// *
// *boolean isEmpty()
// *
// *boolean equals(Object obj)
// *
// *HashMap：
// *1.key是用Set来存放的，不可重复，value是用Collection来存放的，可重复
// * 一个key-value对，是一个Entry，所有的Entry是用Set存放的，也是不可重复的。
// *2.向HashMap中添加元素时，会调用key所在类的equals（）方法，判断两个key是否相同，若相同则只能够添加进一个,则只能添加进后加的那个元素
// *
// */
//
////两个put的key相同，输出结果为后加进去的那个，所以输出是value=87
//
//    public void test1(){
//
//        Map map = new HashMap();
//        map.put("AA",213);
//        map.put("BB",456);
//        map.put("BB",45);//与上边的key相同所以map中是这个
//        map.put(123,"CC");
//        map.put(null,null);
//        map.put(new Person("xx",21),89);
//        map.put(new Person("xx",21),87);//与上边的key相同所以map中是这个
//        System.out.println(map.size());
//        map.remove("BB");
//        System.out.println(map);
//        Object value = map.get(123);
//        System.out.println(value);
//
//    }
//  /*
//
//   如何遍历Map
//   Set keySet（）
//   Collection values()
//   Set entrySet()
//
//  */
//
//    @Test
//    public void test2(){
//
//        Map map = new HashMap();
//        map.put("AA",213);
//        map.put("BB",45);
//        map.put(123,"CC");
//        map.put(null,null);
//        map.put(new Person("xx",21),89);
//
//
//        //1.遍历key集.此时打印输出 null,AA,Person    //[name=DD,age=23],BB,123
//        Set set = map.keySet();
//        for(Object obj : set){
//            System.out.println(obj);
//        }
//        //2.遍历value集.此时打印输出null,213,89,45,CC
//        Collection values = map.values();
//        Iterator i = values.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//        //3.如何遍历key-value对
//        //方式一
//        Set set1 = map.keySet();
//        for(Object obj1 : set1){
//            System.out.println(obj + "----->" + map.get(obj));
//
//        }
//        //方式二
//        Set set2 = map.entrySet();
//        for(Object obj : set2 ){
//            Map.Entry entry = (Map.Entry)obj;
//            System.out.println(entry.getKey() + "---->" + entry.getValue());
//        }
//    }
//
//
//    @Test
//    public void testLinkedHashMap(){
//        Map map2 = new hashmap();
//        Map map = new LinkedHashMap();
//        map.put("AA",213);
//        map.put("BB",45);
//        map.put(123,"CC");
//        map.put(null,null);
//        map.put(new Person("xx",21),89);
//
//        Set set1 = map.keySet();
//        for(Object obj1 : set1){
//            System.out.println(obj + "----->" + map.get(obj));
//        }
//    }
//
//    @Test
//    public void testTreeMap(){
//
//
//        //自然排序
//        Map map = new TreeMap();
//        map.put(new Person("AA",23),89);
//        map.put(new Person("MM",22),79);
//        map.put(new Person("BB",23),99);
//        map.put(new Person("CC",13),69);
//
//        Set set1 = map.keySet();
//        for(Object obj1 : set1){
//            System.out.println(obj + "----->" + map.get(obj));
//        }
//    }
//
//
//    @Test
//    public void testProperties(){
//
//        Properties pros = new Properties();
//        pros.load(new FileInputStream(new File(jdbc.properties )));
//        String user = pros.getProperty("user");
//        String password = pros.getProperty("password");
//
//    }
//}