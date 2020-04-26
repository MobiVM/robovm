package org.robovm.debugger.debuginfo;

import org.robovm.debugger.utils.Pair;

/**
 * @author Demyan Kimitsa
 * Method debug info that is extracted from ObjectFile/DWARF
 */
public class DebuggerDebugMethodInfo {
    private final String name;

    // scope visibility range -- line numbers (not available from DWARF)
    private final int startLine;
    private final int finalLine;

    // sp-fp offset on arm targets
    private final int spFpOffset;
    private final int spFpAlign;

    // local variables
    private final DebuggerDebugVariableInfo[] localvariables;

    // two dimension array: first dimension index specifies slice, second dimention are variables visible at slice
    private final DebuggerDebugVariableInfo[][] sliceVariables;
    // two dimension array: first dimension index specifies slice, second dimention are allocas of variables visible at slice
    private final DebuggerDebugAllocaInfo[][] sliceAllocas;

    // array with offsets from start of method, used to find slice index that corresponds to given address
    private final int[] offsets;
    // array of variable slices indexes, corresponds to address in offsetValues at same idx
    private final int[] offsetSliceIndexes;


    DebuggerDebugMethodInfo(RawData rawData) {
        this.name = rawData.signature;
        this.startLine = rawData.startLine;
        this.finalLine = rawData.finalLine;
        if (rawData.spFpOffset != 0) {
            // unpack values -- here is how it is set in
            // bellow are original comments from patch
            //
            // We divide by 4 since the offset is always at least a multiple of 4.
            // uint32_t spFpOffset = (GPRCS1Size - 8 + GPRCS2Size + DPRGapSize + DPRCSSize + NumBytes + AFI->getNumAlignedDPRCS2Regs()*8) >> 2;
            // Calculate the stack alignment. It's at least a multiple of 4 so we divide by 4.
            // We subtract by 1 since alignment/4 is always at least 1.
            // uint32_t spAlignment = (MFI->getMaxAlignment() >> 2) - 1;
            // We store the stack alignment in the 4 MSBs of the symbol value.
            //  Offset->setVariableValue(MCConstantExpr::Create(spFpOffset | (spAlignment << 28), Context));
            spFpOffset = (rawData.spFpOffset & ((1 << 28) - 1)) << 2;
            spFpAlign = ((rawData.spFpOffset >> 28) + 1) << 2;
        } else {
            spFpOffset = 0;
            spFpAlign = 0;
        }
        this.localvariables = rawData.variables;
        this.offsets = rawData.offsets;
        this.offsetSliceIndexes = rawData.offsetSliceIndexes;

        // construct slice information
        int sliceCount = rawData.slices.length;
        sliceVariables = new DebuggerDebugVariableInfo[sliceCount][];
        sliceAllocas = new DebuggerDebugAllocaInfo[sliceCount][];
        for (int sliceIdx = 0; sliceIdx < sliceCount; sliceIdx++) {
            int[] sliceData = rawData.slices[sliceIdx];
            int varCount = sliceData.length / 2;

            // allocate variables and allocas of slice
            DebuggerDebugVariableInfo[] variables = sliceVariables[sliceIdx] = new DebuggerDebugVariableInfo[varCount];
            DebuggerDebugAllocaInfo[] allocas = sliceAllocas[sliceIdx] = new DebuggerDebugAllocaInfo[varCount];
            // build slice with data
            for (int idx = 0; idx < varCount; idx++) {
                int varIdx = sliceData[idx * 2];
                int allocaIdx = sliceData[idx * 2 + 1];
                variables[idx] = localvariables[varIdx];
                allocas[idx] = rawData.allocas[allocaIdx];
            }
        }
    }


    public String signature() {
        return name;
    }

    public DebuggerDebugVariableInfo[] localvariables() {
        return localvariables;
    }

    public int startLine() {
        return startLine;
    }

    public int finalLine() {
        return finalLine;
    }

    public int getSpFpOffset() {
        return spFpOffset;
    }

    public int getSpFpAlign() {
        return spFpAlign;
    }

    /**
     * returns a tuple of variables and corresponding allocas that are visible at Frame's PC
     * @param offset from method start (e.g. PC - method.startAddr)
     */
    public Pair<DebuggerDebugVariableInfo[], DebuggerDebugAllocaInfo[]> getVisibleVariables(int offset) {
        int offsetIdx = binarySearchOffset(offsets, offset);
        if (offsetIdx < 0)
            return null;
        int sliceIdx = offsetSliceIndexes[offsetIdx];

        return new Pair<>(sliceVariables[sliceIdx], sliceAllocas[sliceIdx]);
    }


    /**
     * Modified binary search to find smallest index where array[idx] >= value
     */
    private static int binarySearchOffset(int[] array, int value) {
        if (array == null || array.length == 0)
            return -1;
        // skip case if value is out of bounds
        if (array[0] > value)
            return -1;

        int leftIdx = 0;
        int rightIdx = array.length - 1;
        while (leftIdx < rightIdx) {
            int centerIdx = (leftIdx + rightIdx + 1) / 2;
            int cv = array[centerIdx];
            if (cv <= value) {
                leftIdx = centerIdx;
            } else {
                rightIdx = centerIdx - 1;
            }
        }

        return leftIdx;
    }

    // data for serialization of object
    public static class RawData {
        final String signature;

        // variables -- contains generic information about variables as in Java debug info
        final DebuggerDebugVariableInfo[] variables;

        // allocas -- contains information about locations of variables in memory
        final DebuggerDebugAllocaInfo[] allocas;

        // array with offsets from start of method, used to find slice index that corresponds to given address
        final int[] offsets;
        // array of variable slices indexes, corresponds to address in offsetValues at same idx
        final int[] offsetSliceIndexes;

        // slices of local variables
        // first dimension -- index to slice
        // second -- array of pairs: variable + alloca
        final int[][] slices;

        // scope visibility range -- line numbers (not available from DWARF)
        final int startLine;
        final int finalLine;

        // sp-fp offset on arm targets
        final int spFpOffset;

        public RawData(String methodName, int startLine, int finalLine, int spfpOffset,
                       DebuggerDebugVariableInfo[] variables, DebuggerDebugAllocaInfo[] allocas,
                       int[] offsets, int[] offsetSliceIndexes, int[][] slices) {
            this.signature = methodName;
            this.startLine = startLine;
            this.finalLine = finalLine;
            this.spFpOffset = spfpOffset;
            this.variables = variables;
            this.allocas = allocas;
            this.offsets = offsets;
            this.offsetSliceIndexes = offsetSliceIndexes;
            this.slices = slices;
        }
    }
}
