package com.et.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 模拟ArrayList
public class TestArrayList7 {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(10);
        list.add(12);
        list.add(13);
        System.out.println(list);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}

class MyList{
    // 定义用来存放数据的数组
    private Object[] data;
    // 定义用来记录元素个数的属性 size
    private int size;

    // 无参构造方法
    public MyList(){
        this(10);// 调用当前对象的有参构造方法
    }
    // 有参构造方法
    public MyList(int len){
        data = new Object[len];// 初始化数组
    }
    // 得到元素个数
    public int size(){
        return size;
    }
    // 得到第几个元素
    public Object get(int index){
        return data[index];
    }
    // 得到指定的元素
    public Object get(Object obj){
        // 遍历是否存在指定的元素 如果存在则返回 否则返回null
        for(int i=0;i<data.length;i++){
            if(obj.equals(data[i])){
                return data[i];
            }
            //break;
        }
        return null;
    }

    // 添加元素
    public void add(Object obj){
        // 判断是否需要扩容
        if(data.length==size){
            // 创建一个更大的数组
            Object[] temp = new Object[size+(size>>1)];
            // 复制老数组中的元素
            // data 原数组
            // 0 表示原数组中的起始位置
            // temp 新数组
            // 0 表示新数组的起始位置
            // size 复制多少个元素
            System.arraycopy(data,0,temp,0,size);
            // 使用新数组 老数组留给GC
            data = temp;
        }
        // 每次存放元素 应该放到size的位置 存放后 size++
        data[size++] = obj;
    }

    // 删除指定元素
    public void remove(Object e){
        for(int i=0;i<size;i++){
            if(e.equals(data[i])){
                remove(i);// remove(int index);
                return ;// 确保一次remove 只能删除一个元素
            }
        }
    }

    // 删除指定位置的元素
    /*
	 删除是靠着大量的复制完成的
	 例如 有0 1 2 3 4 五个元素
	 当要删除下标为3的元素时 是将下标为4的元素复制到下标为3的位置 然后将下标为4的位置赋值为null 留着存放其他元素
	 如果要删除下标2的元素 其实就是从下标3开始向下标2复制元素 总共复制 总的元素个数减掉要删除的元素下标-1
	 System.arraycopy(data, x+1, data, x, size-x-1);
	 解释
	 data 原数组
	 x+1  元数组的起始位置
	 data 目标数组(原数组本身 这样就可以实现数组中的元素移动)
	 x    目标数组的起始位置
	 size-x-1 总共需要复制多少个元素
	 */
    public void remove(int x){
        System.arraycopy(data, x+1, data, x, size-x-1);
        // 删除元素 计数器需要--
        size--;
    }

}
