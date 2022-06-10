package com.zubrycky.lesson.lesson_21_design_patterns.state_machine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterStateMachineTest {

    @Test
    public void whenInPlasmaStateDeionizationReturnsVapor() {
        WaterStateMachine waterStateMachine = new WaterStateMachine(WaterState.PLASMA);
        waterStateMachine.onAction(WaterAction.DEIONIZATION);
        assertEquals(WaterState.VAPOR, waterStateMachine.getCurrentState());
    }

    @Test
    public void whenInPlasmaStateNotDeionizationReturnsPlasma() {
        WaterStateMachine waterStateMachine = new WaterStateMachine(WaterState.PLASMA);
        waterStateMachine.onAction(WaterAction.DEPOSITION);
        assertEquals(WaterState.PLASMA, waterStateMachine.getCurrentState());
        waterStateMachine.onAction(WaterAction.SUBLIMATION);
        assertEquals(WaterState.PLASMA, waterStateMachine.getCurrentState());
        waterStateMachine.onAction(WaterAction.MELTING);
        assertEquals(WaterState.PLASMA, waterStateMachine.getCurrentState());
        waterStateMachine.onAction(WaterAction.VAPORIZATION);
        assertEquals(WaterState.PLASMA, waterStateMachine.getCurrentState());
        waterStateMachine.onAction(WaterAction.FREEZING);
        assertEquals(WaterState.PLASMA, waterStateMachine.getCurrentState());
        waterStateMachine.onAction(WaterAction.CONDENSATION);
        assertEquals(WaterState.PLASMA, waterStateMachine.getCurrentState());
    }

    @Test
    public void testIceStatesTransition() {
        WaterStateMachine waterStateMachine = new WaterStateMachine(WaterState.ICE);
        waterStateMachine.onAction(WaterAction.MELTING);
        assertEquals(WaterState.LIQUID, waterStateMachine.getCurrentState());
        waterStateMachine.onAction(WaterAction.VAPORIZATION);
        assertEquals(WaterState.VAPOR, waterStateMachine.getCurrentState());
        waterStateMachine.onAction(WaterAction.IONIZATION);
        assertEquals(WaterState.PLASMA, waterStateMachine.getCurrentState());
        waterStateMachine.onAction(WaterAction.DEIONIZATION);
        assertEquals(WaterState.VAPOR, waterStateMachine.getCurrentState());
        waterStateMachine.onAction(WaterAction.DEPOSITION);
        assertEquals(WaterState.ICE, waterStateMachine.getCurrentState());
    }
}