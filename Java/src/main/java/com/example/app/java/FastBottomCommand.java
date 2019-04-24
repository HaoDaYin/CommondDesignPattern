package com.example.app.java;

public class FastBottomCommand implements Command
{
    private TetrisMachine tetrisMachine;

    public FastBottomCommand(TetrisMachine tetrisMachine)
    {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute()
    {
        tetrisMachine.fastToBottom();
    }
}
