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

    public static Directions rotate(Directions direction, boolean left) {
        Directions rotatedDirection;
        switch (direction) {
            case N:
                rotatedDirection = W;
                break;
            case S:
                rotatedDirection = E;
                break;
            case W:
                rotatedDirection = S;
                break;
            case E:
                rotatedDirection = N;
                break;
            default:
                rotatedDirection = UNDEFINED;
                break;
        }

        if(!left)
            rotatedDirection = Directions.oppositeDirection(rotatedDirection);

        return rotatedDirection;
    }
}
