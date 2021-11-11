package encryptdecrypt;

public class ArgsParse {
    protected String mode = "";
    protected String data = "";
    protected int key = 0;
    protected String in;
    protected String out;

    public void argsParseProcess(String[] args) {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-in":
                    in = args[i + 1];
                    break;
                case "-out":
                    out = args[i + 1];
                    break;
            }
        }
    }

}
