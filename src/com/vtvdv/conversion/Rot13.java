package com.vtvdv.conversion;

public class Rot13 implements Converter {

    public String convert(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for(char c: string.toCharArray()) {
            if((c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M')) {
                c += 13;
                stringBuilder.append(c);
            }
            else if((c >= 'n' && c <= 'z') || (c >= 'N' && c <= 'Z')) {
                c -= 13;
                stringBuilder.append(c);
            }
            else {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }
}
