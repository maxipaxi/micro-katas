class SpecializeMethod {

    static <T> T newestElement(Iterable<T> coll) {
        var i = coll.iterator();
        T result = null;
        while (i.hasNext()) {
            result = i.next();
        }
        return result;
    }

}
