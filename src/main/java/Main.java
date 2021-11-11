package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends ArgsParse {

    public static void main(String[] args) throws FileNotFoundException {
        ArgsParse argsParse = new ArgsParse();
        EncryptAndDecrypt encryptAndDecrypt = new EncryptAndDecrypt();

        ProcessDataToOutPut processDataToOutPut = new ProcessDataToOutPut();
        argsParse.argsParseProcess(args);
        processDataToOutPut.processEncodeAndOutput(argsParse,
                encryptAndDecrypt);
    }
}
