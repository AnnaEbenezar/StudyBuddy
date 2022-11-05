package Utility;

public interface CustomException {
    class ModuleIsRunningException extends RuntimeException {
        public ModuleIsRunningException() {
            super("This module is already running");
        }
    }

    class DuplicateUIException extends RuntimeException {
        public DuplicateUIException() {
            super("UI Windows are duplicated. (This shouldn't happen)");
        }
    }
}
