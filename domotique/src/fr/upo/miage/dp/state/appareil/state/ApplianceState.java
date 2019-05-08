package fr.upo.miage.dp.state.appareil.state;

/**
 * TODO Exercise: Complete the steps in this file
 */
public enum ApplianceState {

    // TODO: Comment the following definitions
    //OFF, ON, STOPPED, STARTED, UNKNOW;

    // TODO: Uncomment the following block of code

    OFF {
        public ApplianceStateBehavior getStateBehavior() {
            return new OffState();
        }
    },
    ON {
        public ApplianceStateBehavior getStateBehavior() {
            return new OnState();
        }
    }, STOPPED {
        public ApplianceStateBehavior
        getStateBehavior() {
            return new StoppedState();
        }
    }, STARTED {
        public ApplianceStateBehavior getStateBehavior() {
            return new StartedState();
        }
    }, UNKNOW{
        public ApplianceStateBehavior getStateBehavior() {
            return new UnknowState();
        }
    };

    /**
     * Default
     *
     * @return
     */
    public ApplianceStateBehavior getStateBehavior() {
        return null;
    }

}
