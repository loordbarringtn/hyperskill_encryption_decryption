package encryptdecrypt;

public class ProcessDataToOutPut {
    FileProcess fileProcess = new FileProcess();

    protected void processEncodeAndOutput(ArgsParse argsParse,
                                          EncryptAndDecrypt encryptAndDecrypt) {
        String dataFromFile;
        String outputData = null;

        dataFromFile = fileProcess.getDateFromFile(argsParse.in);

        if (argsParse.mode.equals("enc")) {
            outputData = encryptAndDecrypt.encryptDecryptMessage(dataFromFile,
                    argsParse.key);
        } else if (argsParse.mode.equals("dec")) {
            outputData = encryptAndDecrypt.encryptDecryptMessage(dataFromFile,
                    argsParse.key * -1);
        }

        if (argsParse.out.isEmpty()) {
            System.out.println(outputData);
        } else fileProcess.saveDateToFile(argsParse.out, outputData);
    }
}
