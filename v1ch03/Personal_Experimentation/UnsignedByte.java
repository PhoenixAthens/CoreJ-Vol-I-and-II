import java.util.ArrayList;
public class UnsignedByte{
	public static void ByteToInt(){
    		byte b;
    		ArrayList<Integer> arr = new ArrayList<>();
    		for(int i = 0; i <= 255; i++){
        		b = (byte) i;
        		arr.add(Byte.toUnsignedInt(b));
    		}
    		System.out.println(arr);
	}
	public static void main(String...args){
		ByteToInt();
	}
}

