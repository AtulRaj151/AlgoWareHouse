## Bit Manupkation

<h5>Bit manipulation</h5> is the act of algorithmically manipulating bits using bit-level (bitwise) operations. These bitwise operations are the heart of bit manipulation. They are primitive, fast actions that are used in improving the efficiency of a program.


<h5>Bit mask</h5> A bitmask is the data used for bitwise operations, particularly in a bit field. Using a mask, bits can be set either on/off or vice versa in a single bitwise operation.

# Application of Bit Operators

- Bit operations are used for optimization of embedded systems.
- The Exclusive-or operator can be used to confirm the integrity of a file, making sure it has not been    corrupted, especially after it has been in transit.
- Bitwise operations are used in Data encryption and compression.
- Bits are used in the area of networking, framing the packets of numerous bits which are sent to another  system generally through any type of serial interface.
- Digital Image Processors use bitwise operations to enhance image pixels and to extract different sections of a microscopic image.

# Bit Wise Operators

- AND operator (&):</br>
    0 & 1 = 0</br>
    1 & 0 = 0</br>
    0 & 0 = 0</br>
    1 & 1 = 1</br>

- OR operator (|):</br>
    0 | 1 = 1</br>
    1 | 0 = 1</br>
    1 | 1 = 1</br>
    0 | 0 = 0</br>

- XOR operator (^):</br>
    0 ^ 0 = 0</br>
    1 ^ 1 = 0</br>
    1 ^ 0 = 1</br>
    0 ^ 1 = 1</br>

- NOT operator (~):</br>
    ~0 = 1</br>
    ~1 = 0</br>

- Right Shift (>>): Add Zero at the left </br>
    0010 >> 1 = 0100 (Multiple By 2)</br>
    0010 >> 2 = 1000 </br>

- Left Shift (<<): Add Zero at the right</br>
    0010 << 1 = 0001 (Divide By 2)</br>
    0100 << 2 = 0001</br>

## UseFull Tricks 
# Swap two number 

```yaml
void swap(int a, int b){
    a ^= b
    b ^= a
    a ^= b
}
```  
# Convert Uppercase to Lowaer and vise versa

```yaml
char convertTOLower(char a){
    return c | ' ';
}
char convertToUpper(char a){
    return c & '_'; 
}
``` 

# Computer XOR from 1 to n 

```ymal
int computeXor(int n){
       if(n%4 == 0){
        return n;
    }
    else if(n%4 == 1){
        return 1;
    }
    else if(n%4 == 2){
        return n + 1;
    }
    else{
        return 0;
    }
}
```
# Find max and min values
```yaml
x = 10;
y = 20;
int min = (y ^ (x ^ y)& - (x < y));
int max = (x ^ (x ^ y)& - (x < y));
```

