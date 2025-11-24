// 37. how to copy one array into another .
class ArrayCopier {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args) {
        // Q10. How to copy one array into another
        
        int sourceArray[] = {10, 20, 30, 40, 50};
        
        // Method 1: Manual Loop (The 5/10 coder way)
        int destinationArray1[] = new int[sourceArray.length];
        
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray1[i] = sourceArray[i];
        }
        System.out.println("Method 1 (Loop) copy result: " + destinationArray1[2]);

        // Method 2: System.arraycopy (The efficient way)
        int destinationArray2[] = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, destinationArray2, 0, sourceArray.length);
        
        System.out.println("Method 2 (System.arraycopy) copy result: " + destinationArray2[2]);
        
        // Method 3: clone()
        int destinationArray3[] = sourceArray.clone();
        System.out.println("Method 3 (clone()) copy result: " + destinationArray3[2]);
    }
}
