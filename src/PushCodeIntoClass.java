class PushCodeIntoClass {

    static class Item {
        private String _name;
        private float _price;

        Item(String name, float price) {
            _name = name;
            _price = price;
        }

        float getPrice() {
            return _price;
        }

        String getName() {
            return _name;
        }
    }

    static float calculatePrice(Item i, float discount) {
        return i.getPrice() * discount;
    }

    static String receiptLine(Item item) {
        var result = item.getName();
        while (result.length() < 10) {
            result += " ";
        }
        result += item.getPrice();
        return result;
    }

    interface Animal {
        float getWeight();
    }

    static class Cat implements Animal {

        @Override
        public float getWeight() {
            return 3;
        }
    }

    static class Cow implements Animal {

        @Override
        public float getWeight() {
            return 241;
        }
    }

    static String getSound(Animal a) {
        if (a.getWeight() > 15) {
            return "Mooo";
        } else {
            return "Meow";
        }
    }

}
