package com.zubrycky.lesson.lesson21_design_patterns.state_machine;

import static com.zubrycky.utils.Utils.print;

public class WaterStateMachine {

    private WaterState currentState;

    public WaterStateMachine(WaterState waterState) {
        this.currentState = waterState;
    }

    public void onAction(WaterAction action){
        WaterState newState = currentState.onAction(action);
        print("Changing state from " + currentState + " to " + newState);
        currentState = newState;
    }

    public WaterState getCurrentState() {
        return currentState;
    }
}
