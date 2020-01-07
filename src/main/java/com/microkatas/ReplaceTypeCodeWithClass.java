package com.microkatas;

class ReplaceTypeCodeWithClass {

    enum Size {
        XS, S, M, L, XL
    }

    static String getName(Size s) {
        switch (s) {
            case XS:
                return "eXtra Small";
            case S:
                return "Small";
            case M:
                return "Medium";
            case L:
                return "Large";
            case XL:
                return "eXtra Large";
            default:
                throw new RuntimeException("Impossible");
        }
    }

    private static float VAT = 1.25f;

    enum CustomerType {
        BUSINESS, PERSON
    }

    static float getPrice(Size s, CustomerType t) {
        float price;
        switch (s) {
            case XS:
                price = 1;
                break;
            case S:
                price = 2;
                break;
            case M:
                price = 3;
                break;
            case L:
                price = 4;
                break;
            case XL:
                price = 5;
                break;
            default:
                throw new RuntimeException("Impossible");
        }
        switch (t) {
            case BUSINESS:
                break;
            case PERSON:
                price *= ReplaceTypeCodeWithClass.VAT;
                break;
            default:
                throw new RuntimeException("Impossible");
        }
        return price;
    }

    static final String RED = "red";
    static final String BLUE = "blue";
    static final String GREEN = "green";

    static String colorToHex(String color) {
        if (ReplaceTypeCodeWithClass.RED.equals(color)) {
            return "#ff0000";
        } else if (ReplaceTypeCodeWithClass.GREEN.equals(color)) {
            return "#00ff00";
        } else if (ReplaceTypeCodeWithClass.BLUE.equals(color)) {
            return "#0000ff";
        } else {
            throw new RuntimeException("Impossible");
        }
    }

}
