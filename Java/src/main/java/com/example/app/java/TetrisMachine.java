package com.example.app.java;

/**
 * 创建接收者
 */
public class TetrisMachine
{

    //处理向左的逻辑
    public void toLeft()
    {
        System.out.println("向左");
    }

    public void toRight()
    {
        System.out.println("向右");
    }

    /**
     * 真正处理“快速落下”逻辑的代码
     */
    public void fastToBottom()
    {
        System.out.println("快速落下");
    }

    /**
     * 真正处理"改变形状"操作的逻辑代码
     */
    public void transform()
    {
        System.out.println("改变形状");
    }

}
