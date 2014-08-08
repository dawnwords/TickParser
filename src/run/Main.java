package run;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Dawnwords on 2014/8/8.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("tick");
        readEntry(in);
        in.close();
    }

    private static void readEntry(FileInputStream in) throws IOException {
        byte[] entry = new byte[MapHolder.ENTRY_LEN];
        in.read(entry);

        int i = 1;
        for (byte b : entry) {
            System.out.print(String.format("%02x", b) + ",");
            if (i++ == 50) {
                i = 1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println(new String(entry));
    }

    private static void readContractCode(FileInputStream in) throws IOException {
        byte[] head = new byte[6];
        in.read(head);

        byte[] contract_code = new byte[103];
        in.read(contract_code);
        System.out.println(new String(contract_code));
    }


}
