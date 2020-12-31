public class PrintfEx1 {
    public static void main (String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L; // long datatype은 숫자 뒤에 'L'을 붙힌다
        long hex = 0xFFFF_FFFF_FFFFL; // hex 16진수는 숫자 앞에 '0x'를 붙힌다

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%d%n", b); // %n is a newline. think as '%n' == '\n'
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c); // '(int)c' changes an object into an integer type
        System.out.printf("finger=[%5d]%n", finger); // %5d means five spaces inside [].
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]\n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex);
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
    }
}
