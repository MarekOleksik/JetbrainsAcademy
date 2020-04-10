public class AsciiCharSequence implements CharSequence {

    private final byte[] value;

    public AsciiCharSequence(byte[] value) {
        this.value = value.clone();
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int index) {
        return (char) value[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new  AsciiCharSequence(java.util.Arrays.copyOfRange(value, start, end));
    }

    @Override
    public String toString() {
        return new String(this.value);
    }

    // implementation
}