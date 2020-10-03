package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class for working with
 * contact book
 */
class TextOpt {

        void read(String contactsFile, String[] contactsArr) throws IOException {

                int i = 0;

                FileReader rd = new FileReader(contactsFile);
                Scanner scan = new Scanner(rd);

                while (scan.hasNextLine()) {
                        Main.contactsArr[i] = scan.nextLine();
                        i++;
                }
                rd.close();
        }

        void writeContacts(String[] contactsArr) {
                try {
                        FileWriter writer = new  FileWriter(Main.contactsFile, false);
                        for(String info: Main.contactsArr) {
                                if (info != null) {
                                        writer.write(info + "\n");
                               }
                       }
                        writer.flush();
                } catch (IOException e) {
                        e.getLocalizedMessage();
                }

        }

}
