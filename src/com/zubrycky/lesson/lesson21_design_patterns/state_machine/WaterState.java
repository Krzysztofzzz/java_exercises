package com.zubrycky.lesson.lesson21_design_patterns.state_machine;

public enum WaterState {
    PLASMA {
        @Override
        public WaterState onAction(WaterAction action) {
            if (action == WaterAction.DEIONIZATION) {
                return VAPOR;
            }
            return PLASMA;
        }
    }, VAPOR {
        @Override
        public WaterState onAction(WaterAction action) {
            WaterState newState;
            switch (action) {
                case IONIZATION -> newState = PLASMA;
                case DEPOSITION -> newState = ICE;
                case CONDENSATION -> newState = LIQUID;
                default -> newState = VAPOR;
            }
            return newState;
        }
    }, LIQUID {
        @Override
        public WaterState onAction(WaterAction action) {
            WaterState newState;
            switch (action){
                case VAPORIZATION -> newState = VAPOR;
                case FREEZING -> newState = ICE;
                default -> newState = LIQUID;
            }
            return newState;
        }
    }, ICE {
        @Override
        public WaterState onAction(WaterAction action) {
            WaterState newState;
            switch (action){
                case SUBLIMATION -> newState = VAPOR;
                case MELTING -> newState = LIQUID;
                default -> newState = ICE;
            }
            return newState;
        }
    };

    abstract WaterState onAction(WaterAction action);

}
