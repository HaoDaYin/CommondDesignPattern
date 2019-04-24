package com.example.app.java;

public class RightCommand implements Command
{
    private TetrisMachine tetrisMachine;

    public RightCommand(TetrisMachine tetrisMachine)
    {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute()
    {
        tetrisMachine.toRight();
    }
}
