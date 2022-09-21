public class InputFileLoad {
    public static void main(String[] args) {

        String filename = "test.txt";
        In reader = new In(filename);

        int num = reader.readInt();
        double val = reader.readDouble();
        String text = reader.readString();

        Out writer = new Out("output.txt");
        writer.println(num);
        writer.println(val);
        writer.println(text);
    }
}
