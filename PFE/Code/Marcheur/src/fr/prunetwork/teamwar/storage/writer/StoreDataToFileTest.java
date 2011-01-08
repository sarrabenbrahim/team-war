/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.prunetwork.teamwar.storage.writer;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpierre03
 */
public class StoreDataToFileTest {

    public static void main(String arg[]) {
        StoreDataToFile storeDataToFile = new StoreDataToFile("FileXXXXXXXXXXXX");

        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        storeDataToFile.add("vncdnbcvlnbvj,n!vb,n:;,v!\n");
        try {
            storeDataToFile.commit();
        } catch (IOException ex) {
            Logger.getLogger(StoreDataToFileTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
