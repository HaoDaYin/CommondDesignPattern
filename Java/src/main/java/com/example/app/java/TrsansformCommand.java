package com.example.app.java;

public class TrsansformCommand implements Command
{
    private TetrisMachine tetrisMachine;

    public TrsansformCommand(TetrisMachine tetrisMachine)
    {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute()
    {
        tetrisMachine.transform();
    }
}
