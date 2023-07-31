class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        double answer;
        try {
            answer = Double.parseDouble(input);
        } catch (Exception e) {
            return 0;
        }
        return answer;
    }
}