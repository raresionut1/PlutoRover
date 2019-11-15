package Enums;

public enum Directions {
    N, S, W, E, UNDEFINED;

    public static Directions oppositeDirection(Directions direction) {
        switch (direction) {
            case N:
                return S;
            case S:
                return N;
            case W:
                return E;
            case E:
                return W;
            default:
                return UNDEFINED;
        }
    }
}
