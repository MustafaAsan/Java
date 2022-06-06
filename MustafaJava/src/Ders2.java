public class Ders2 {
    public static void main(String[] args) {

        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;

        System.out.println("Byte'ın Max Değeri: " + maxByte + "'dır. \nByte'ın Min Değeri: " + minByte + "'dır.");

        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        int maxInt = Integer.MAX_VALUE;
        System.out.println("En büyük Integer sayisi: " + maxInt);

        int minInt = Integer.MIN_VALUE;
        System.out.println("En küçük Integer sayisi: " + minInt);

        // Long değer atamalarında ilgili sayının yanına büyük harf ile L yazılır.
        long maxLong = Long.MAX_VALUE;
        System.out.println("En büyük Long sayisi: " + maxLong);

        long minLong = Long.MIN_VALUE;
        System.out.println("En küçük Long sayisi: " + minLong);

        float minFloat = Float.MAX_VALUE;
        float maxFloat = Float.MIN_VALUE;

        System.out.println("En küçük Float sayisi: " + minFloat);
        System.out.println("En büyük Long sayisi: " + maxFloat);

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println("MaxDouble: " + maxDouble);
        System.out.println("MinDouble: " + minDouble);

        char karakter = 'A'; // Ascii numarası 97
        char karakter2 = 'a'; // Ascii numarası 65

        int karakterAsciiNumarasi = (int)karakter;
        int karakter2AsciiNumarasi = (int)karakter2;
        System.out.println(karakterAsciiNumarasi);
        System.out.println(karakter2AsciiNumarasi);

        String str = "Mustafa";
        System.out.println(str);
    }
}
