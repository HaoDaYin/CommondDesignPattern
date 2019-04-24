package com.example.app.java;

public class Bottons
{
    private LeftCommand leftCommand;
    private  RightCommand rightCommand;
    private FastBottomCommand fastBottomCommand;
    private TrsansformCommand trsansformCommand;


    public void setLeftCommand(LeftCommand leftCommand)
    {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand)
    {
        this.rightCommand = rightCommand;
    }

    public void setFastBottomCommand(FastBottomCommand fastBottomCommand)
    {
        this.fastBottomCommand = fastBottomCommand;
    }

    public void setTrsansformCommand(TrsansformCommand trsansformCommand)
    {
        this.trsansformCommand = trsansformCommand;
    }


    public void toLeft(){
        leftCommand.execute();
    }

    public void toRight()
    {
        rightCommand.execute();
    }
    public void fastToBottom()
    {
        fastBottomCommand.execute();
    }
    public void transform()
    {
        trsansformCommand.execute();
    }
}
