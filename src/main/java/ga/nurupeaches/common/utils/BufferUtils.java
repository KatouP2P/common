package ga.nurupeaches.common.utils;

import java.nio.ByteBuffer;

public final class BufferUtils {

    private BufferUtils(){}

    public static void writeString(ByteBuffer buffer, String str){
        writeChars(buffer, str.toCharArray());
    }

    public static String readString(ByteBuffer buffer){
        return new String(readChars(buffer));
    }

    public static void writeChars(ByteBuffer buffer, char[] arr){
        buffer.putInt(arr.length);
        for(char c : arr){
            buffer.putChar(c);
        }
    }

    public static char[] readChars(ByteBuffer buffer){
        char[] arr = new char[buffer.getInt()];
        for(int i=0; i < arr.length; i++){
            arr[i] = buffer.getChar();
        }
        return arr;
    }

    public static int stringSize(String str){
        int size = Integer.BYTES;
        size += str.toCharArray().length * Character.BYTES;
        return size;
    }

    public static byte peek(ByteBuffer buffer){
        byte b = buffer.get();
        buffer.position(buffer.position() - 2);
        return b;
    }

}
