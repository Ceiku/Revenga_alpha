package sample.LogicLayer.DataEntities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Daniel on 09/06/2016.
 */
public class AnalyzableData {

    public String id;

    public boolean bit8, bit16, bit32, bit64;
    public byte[] rawData;

    public AnalyzableData(String path){
        setId(path);

        try {
            setRawData(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AnalyzableData(AnalyzableData data){
        this(data.getId());
    }

    public int getLenght() {
        return rawData.length;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isBit8() {
        return bit8;
    }

    public void setBit8(boolean bit8) {
        this.bit8 = bit8;
    }

    public boolean isBit16() {
        return bit16;
    }

    public void setBit16(boolean bit16) {
        this.bit16 = bit16;
    }

    public boolean isBit32() {
        return bit32;
    }

    public void setBit32(boolean bit32) {
        this.bit32 = bit32;
    }

    public boolean isBit64() {
        return bit64;
    }

    public void setBit64(boolean bit64) {
        this.bit64 = bit64;
    }

    public byte[] getRawData() {
        return rawData;
    }

    public void setRawData(byte[] rawData) {
        this.rawData = rawData;
    }

    @Override
    public String toString() {
        return getId() + " , " + getRawData().length;
    }
}
