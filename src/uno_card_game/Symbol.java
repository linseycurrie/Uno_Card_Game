package uno_card_game;

public enum Symbol {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    PICK_UP_TWO,
    SKIP,
    REVERSE,
    WILD_FOUR;

    private static final Symbol[] symbols = Symbol.values();

    public static Symbol getSymbol(int i) {
        return Symbol.symbols[i];
    }

