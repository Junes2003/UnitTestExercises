public class Ex1WarmUp {
    public boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || vacation){
         return true;
        }
        return false;
    }

    /**
     * Returner summen af a og b. Men hvis a og b er ens, returnér dobbelt summen.
     * Eksempel: sumDouble(2, 2) → 8
     * Eksempel: sumDouble(3, 2) → 5
     */

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
        //throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Returner den absolutte forskel mellem n og 21.
     * Hvis n er større end 21, returnér dobbelt forskellen.
     * Eksempel: diff21(19) → 2
     * Eksempel: diff21(22) → 2
     */
    public int diff21(int n) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Vi har ballade, hvis begge aber smiler, eller hvis ingen smiler.
     * Returner true hvis vi har ballade.
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Returner true hvis en af værdierne er 10, eller hvis deres sum er 10.
     */
    public boolean makes10(int a, int b) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Returner true hvis n er inden for 10 af 100 eller 200.
     * Dvs. tæt på 100 eller tæt på 200.
     * Eksempel: nearHundred(93) → true
     * Eksempel: nearHundred(105) → true
     */
    public boolean nearHundred(int n) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Returner true hvis strengen indeholder mellem 1 og 3 'e'-bogstaver.
     * Eksempel: stringE("Hello") → true
     * Eksempel: stringE("HeeeHeee") → false
     */
    public boolean stringE(String str) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Returner en ny streng, hvor det første og sidste bogstav er byttet rundt.
     * Hvis strengen er kortere end 2, returner den uændret.
     */
    public String frontBack(String str) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Returner en ny streng, der er 3 gange det første bogstav.
     * Eksempel: front3("Java") → "JavJavJav"
     */
    public String front3(String str) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Returner strengen med "not " foran, medmindre den allerede starter med "not".
     * Eksempel: notString("candy") → "not candy"
     * Eksempel: notString("not bad") → "not bad"
     */
    public String notString(String str) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Giv en streng og et heltal n. Returner strengen uden det bogstav på position n.
     * Eksempel: missingChar("kitten", 1) → "ktten"
     */
    public String missingChar(String str, int n) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Returner true hvis tallet er mod 3 eller 5.
     * Eksempel: or35(3) → true, or35(10) → true, or35(8) → false
     */
    public boolean or35(int n) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Returner den største af tre værdier.
     */
    public int maxInt(int a, int b, int c) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Returner den længste af to strenge. Hvis de er lige lange, returnér begge.
     */
    public String longString(String a, String b) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }

    /**
     * Returner true hvis begge tal er i intervallet 10..20 (inklusiv).
     */
    public boolean in1020(int a, int b) {
        // TODO
        throw new RuntimeException("Not implemented yet"); // Udkommenter denne linje ved implementation
    }
}


