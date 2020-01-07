package com.microkatas;

class ExtractInterfaceFromImplementation {

    static class Animal {
        String getSound() {
            return "Mooo";
        }
    }

    static class Vehicle {
        int getWheels() {
            return 2;
        }
    }

}
