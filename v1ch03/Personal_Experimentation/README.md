In Core Java Volume 1, there is Note at the end of Section 3.3.1 Integer Types.
It goes something like this:

"If you work with integer values that can never be negative and you really need an additional bit, you can, with some care, interpret signed integer values as unsigned. For example, instead of having a byte value b represent the range from –128 to 127, you may want a range from 0 to 255. You can store it in a byte. Due to the nature of binary arithmetic, addition, subtraction, and multiplication will work provided they don’t overflow. For other operations, call Byte.toUnsignedInt(b) to get an int value between 0 and 255, then process the integer value and cast back to byte. The Integer and Long classes have methods for unsigned division and remainder."

Now how would that method work?

> It's quite simple
> `Byte.toUnsignedInt()` converts values like -128, -127, -126, ... into 128, 129, and 130... respectively. Let's look at the following example code snippet

```java
public static void ByteToInt(){
    byte b;
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 0; i <= 255; i++){
        b = (byte) i;
        arr.add(Byte.toUnsignedInt(b));
    }
    System.out.println(arr);
}
ByteToInt();
```

Guess what the output looks like

```
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255]
```

As the Byte variable overflows when asked to store a value outside its range of -128 to 127, in situations where negative values are neither required nor necessary `.toUnsignedInt()` provides an easy way to store values between 0-255 within an 8-bit container (data-type), i.e., `byte`.
