package homework.task1.task1;

public class Numbers{

    public int intValue;

    public Integer intValueUpgrade;

    public int intTest = Integer.max(10,11);

    public double doubleValue;

    public Double doubleValueUpgrade;

    public double doubleTest = Double.parseDouble("1.4546");

    public float floatValue;

    public Float floatValueUpgrade;

    public float floatTest = Float.min(1.123f, 4.423f);

    public boolean isActive;

    public Boolean booleanValueUpgrade;

    public long longValue;

    public Long longValueUpgrade;

    public long longTest = Long.max(123123123, 353253453);

    public short shortValue;

    public Short shortValueUpgrade;

    public byte byteValue;

    public Byte byteValueUpgrade;

    public char charValue;

    public Character charValueUpgrade;

    public char charTest = Character.toUpperCase('c');

    public String stringValue;

    private final int CONST_VALUE = 100;

    public Numbers (int intValue, double doubleValue, float floatValue, long longValue, short shortValue, byte byteValue,
             char charValue, String stringValue, Integer intValueUpgrade, Double doubleValueUpgrade,
             Float floatValueUpgrade, Long longValueUpgrade, Short shortValueUpgrade, Byte byteValueUpgrade,
             Character charValueUpgrade){

        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.floatValue = floatValue;
        this.longValue = longValue;
        this.shortValue = shortValue;
        this.byteValue = byteValue;
        this.charValue = charValue;
        this.stringValue = stringValue;
        this.intValueUpgrade = intValueUpgrade;
        this.doubleValueUpgrade = doubleValueUpgrade;
        this.floatValueUpgrade = floatValueUpgrade;
        this.longValueUpgrade = longValueUpgrade;
        this.shortValueUpgrade = shortValueUpgrade;
        this.byteValueUpgrade = byteValueUpgrade;
        this.charValueUpgrade = charValueUpgrade;

    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public void setShortValue(short shortValue) {
        this.shortValue = shortValue;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Integer getIntValueUpdate() {
        return intValueUpgrade;
    }

    public void setIntValueUpgrade(Integer intValueUpgrade) {
        this.intValueUpgrade = intValueUpgrade;
    }

    public Double getDoubleValueUpgrade() {
        return doubleValueUpgrade;
    }

    public void setDoubleValueUpgrade(Double doubleValueUpgrade) {
        this.doubleValueUpgrade = doubleValueUpgrade;
    }

    public Float getFloatValueUpgrade() {
        return floatValueUpgrade;
    }

    public void setFloatValueUpgrade(Float floatValueUpgrade) {
        this.floatValueUpgrade = floatValueUpgrade;
    }

    public Long getLongValueUpgrade() {
        return longValueUpgrade;
    }

    public void setLongValueUpgrade(Long longValueUpgrade) {
        this.longValueUpgrade = longValueUpgrade;
    }

    public Short getShortValueUpgrade() {
        return shortValueUpgrade;
    }

    public void setShortValueUpgrade(Short shortValueUpgrade) {
        this.shortValueUpgrade = shortValueUpgrade;
    }

    public Character getCharValueUpgrade() {
        return charValueUpgrade;
    }

    public void setCharValueUpgrade(Character charValueUpgrade) {
        this.charValueUpgrade = charValueUpgrade;
    }

    public Byte getByteValueUpgrade() {
        return byteValueUpgrade;
    }

    public void setByteValueUpgrade(Byte byteValueUpgrade) {
        this.byteValueUpgrade = byteValueUpgrade;
    }

    public void calculate(){
        int intTest = Integer.max(10,11);

        double doubleTest = Double.parseDouble("1.4546");

        float floatTest = Float.min(1.123f, 4.423f);

        long longTest = Long.max(123123123, 353253453);

        char charTest = Character.toUpperCase('c');

        double sum = intTest + doubleTest;
        double diff = doubleTest - (double) floatTest;
        double multi = doubleTest * longTest;
        double div = intTest / longTest;

        System.out.println("Результат сложения: " + sum);
        System.out.println("Результат вычитания: " + diff);
        System.out.println("Результат умножения: " + multi);
        System.out.println("Результат деления: " + div);
        System.out.println("Результат преобразования строчной буквы в прописную: " + charTest);
    }

    @Override
    public String toString() {
        return "Обзор всех типов данных Java:{\n" +
                " int = '" + intValue + '\'' +
                ",\n double = '" + doubleValue + '\'' +
                ",\n float = '" + floatValue + '\'' +
                ",\n long = '" + longValue + '\'' +
                ",\n short = '" + shortValue + '\'' +
                ",\n byte = '" + byteValue + '\'' +
                ",\n char = '" + charValue + '\'' +
                ",\n String = '" + stringValue + '\'' +
                ",\n Integer = '" + intValueUpgrade + '\'' +
                ",\n Double = '" + doubleValueUpgrade + "$'" +
                ",\n Float = '" + floatValueUpgrade + "$'" +
                ",\n Long = '" + longValueUpgrade + "$'" +
                ",\n Short = '" + shortValueUpgrade + "$'" +
                ",\n Byte = '" + byteValueUpgrade + '\'' +
                ",\n Character = '" + charValueUpgrade + '\'' +
                ",\n Boolean = '" + booleanValueUpgrade + '\'' +
                ",\n Const int (final int)  = '" + CONST_VALUE + '\'' +
                "\n}";
    }

}
