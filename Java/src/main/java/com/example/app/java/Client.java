package com.example.app.java;

public class Client
{

    public static void main(String[] args)
    {
        TetrisMachine tetrisMachine = new TetrisMachine();


        //根据游戏构造4种命令
        LeftCommand leftCommand = new LeftCommand(tetrisMachine);
        RightCommand rightCommand = new RightCommand(tetrisMachine);
        FastBottomCommand fastBottomCommand = new FastBottomCommand(tetrisMachine);
        TrsansformCommand trsansformCommand = new TrsansformCommand(tetrisMachine);


        //按钮可以执行不同的命令
        Bottons bottons = new Bottons();
        bottons.setLeftCommand(leftCommand);
        bottons.setRightCommand(rightCommand);
        bottons.setFastBottomCommand(fastBottomCommand);
        bottons.setTrsansformCommand(trsansformCommand);

        //具体按下哪个按钮玩家说了算
        bottons.toLeft();
        bottons.toRight();
        bottons.transform();
        bottons.fastToBottom();
    }
}
